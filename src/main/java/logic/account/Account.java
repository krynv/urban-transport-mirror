package logic.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import logic.fare.FareRegistry;
import logic.journey.Journey;
import logic.journey.JourneyRegistry;
import logic.location.Location;
import logic.pass.PassRegistry;

import java.time.LocalDateTime;

@JsonDeserialize(using = AccountDeserializer.class)
public class Account {

    private String id;
    private String name;
    private double credits;
    private double spentToday;
    private int sortCode;
    private int securityNo;
    private int accountNum;
    private JourneyRegistry journeys;
    private PassRegistry passes;

    @JsonIgnore
    private Boolean exit;

    @JsonIgnore
    private Boolean entry;

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

    public void processPassengerEntry(Location entryLocation, LocalDateTime entryDateTime) {
        journeys.setOpenJourney(entryLocation, entryDateTime);
        entry = true;
    }

    public void processPassengerExit(Location arrivalLocation, LocalDateTime arrivalDateTime) {
        Journey openJourney = journeys.findOpenJourney();

        if (openJourney != null) {
            openJourney.closeJourney(arrivalLocation, arrivalDateTime);

            if (passes.getDayPass() == null) {
                FareRegistry fares = new FareRegistry();

                double cost = fares.findCheapestTariff(fares.calculateCost(openJourney), openJourney);

                cost = passes.applyPass(cost);

                spentToday += cost;

                if (spentToday >= 15) {
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

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getSpentToday() {
        return spentToday;
    }

    public void setSpentToday(double spentToday) {
        this.spentToday = spentToday;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getSecurityNo() {
        return securityNo;
    }

    public void setSecurityNo(int securityNo) {
        this.securityNo = securityNo;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public JourneyRegistry getJourneys() {
        return journeys;
    }

    public void setJourneys(JourneyRegistry journeys) {
        this.journeys = journeys;
    }

    public PassRegistry getPasses() {
        return passes;
    }

    public void setPasses(PassRegistry passes) {
        this.passes = passes;
    }

    public Boolean getExit() {
        return exit;
    }

    public void setExit(Boolean exit) {
        this.exit = true;
    }

    public Boolean getEntry() {
        return entry;
    }

    public void setEntry(Boolean entry) {
        this.entry = entry;
    }

    public Boolean addCredit(double amount) {
        this.credits = this.credits + amount;
        return true;
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