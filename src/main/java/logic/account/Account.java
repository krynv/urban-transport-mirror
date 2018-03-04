package logic.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import logic.fare.FareRegistry;
import logic.journey.Journey;
import logic.journey.JourneyRegistry;
import logic.location.Location;
import logic.pass.DayPass;
import logic.pass.Pass;
import logic.pass.PassRegistry;

import java.time.LocalDateTime;

@JsonDeserialize(using = AccountDeserializer.class)
public class Account {

    private String id;
    private String name;
    private double credits;
    private int sortCode;
    private int securityNo;
    private int accountNum;
    private double spentToday;

    @JsonIgnore
    private JourneyRegistry journeys;

    @JsonIgnore
    private PassRegistry passes;

    @JsonIgnore
    private Boolean exit;

    public Account() {}

    public Account(String id, String name, double credits, int sortCode, int securityNo, int accountNum, double spentToday) {
        this.id = id;
        this.name = name;
        this.journeys = new JourneyRegistry();
        this.passes = new PassRegistry();
        this.spentToday = spentToday;
        this.credits = credits;
        this.exit = false;
        this.sortCode = sortCode;
        this.securityNo = securityNo;
        this.accountNum = accountNum;
    }

    public void processPassengerExit(Location arrivalLocation, LocalDateTime arrivalDateTime) {
        Journey openJourney = journeys.findOpenJourney();

        if (openJourney != null) {
            openJourney.closeJourney(arrivalLocation, arrivalDateTime);

            if (passes.getDayPass() == null) {
                FareRegistry fares = new FareRegistry();

                double cost = fares.findCheapestTariff(fares.calculateCost(openJourney), openJourney);

                cost = passes.applyPass(cost);

                if (spentToday + cost >= 15) {
                    passes.awardDayPass();
                    cost = Math.abs(spentToday - 15);
                }

                credits -= cost;
            }

            exit = true;
        } else {
            System.out.println("Open Journey is null"); // TODO: Change to Logger
        }
    }

    public String getId() {
        return id;
    }

    public Boolean canExit() {
        return exit;
    }

    public Boolean takePayment(double amount, String accNo) {
        return true;
    }

    public Boolean addCredit(double amount) {
        this.credits = this.credits + amount;
        return true;
    }

    public int getSortCode() {
        return sortCode;
    }

    public String getName() {
        return name;
    }

    public int getSecurityNo() {
        return securityNo;
    }

    public double getCredits() {
        return credits;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public void setSecurityNo(int securityNo) {
        this.securityNo = securityNo;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setSpentToday(double spentToday) {
        this.spentToday = spentToday;
    }

    public void setJourneys() {
        journeys = new JourneyRegistry();
    }

    public void setPasses() {
        passes = new PassRegistry();
    }

    public void setExit() {
        exit = true;
    }

    public JourneyRegistry getJourneys() {
        return journeys;
    }

    public void addJourney(Journey journey) {
        journeys.addJourney(journey);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", credits=" + credits +
                ", sortCode=" + sortCode +
                ", securityNo=" + securityNo +
                ", accountNum=" + accountNum +
                ", journeyregistry=" + journeys +
                ", pass=" + passes +
                ", spentToday=" + spentToday +
                '}';
    }
}