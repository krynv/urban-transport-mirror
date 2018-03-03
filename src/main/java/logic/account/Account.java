package logic.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import logic.fare.FareRegistry;
import logic.journey.Journey;
import logic.journey.JourneyRegistry;
import logic.location.Location;
import logic.pass.Pass;

import java.time.LocalDateTime;

@JsonDeserialize(using = AccountDeserializer.class)
public class Account {

    private String id;
    private String name;
    private double credits;
    private int sortCode;
    private int securityNo;
    private int accountNum;

    @JsonIgnore
    private double spentToday;

    private JourneyRegistry journeys;

    @JsonIgnore
    private Pass pass;                  // TODO: Change to pass registry

    @JsonIgnore
    private Boolean exit;

    public Account() {
    }

    public Account(String id, String name, double credits, int sortCode, int securityNo, int accountNum) {
        this.id = id;
        this.name = name;
        this.journeys = new JourneyRegistry(id);
        this.pass = new Pass(true, LocalDateTime.now());
        this.spentToday = 10.0;
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

            if (!pass.isCovered(openJourney)) {
                FareRegistry fares = new FareRegistry();

                spentToday += fares.calculateCost(openJourney); // TODO: Implement logic for calculate cost

                credits -= fares.findCheapestTariff(this);  // TODO: Implement logic for find cheapest tariff

                exit = true;
            } else {
                System.out.println("Pass covers journey"); // TODO: Change to Logger
            }
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

    public void setJourneys() {
        journeys = new JourneyRegistry(id);
    }

    public void setPasses() {
        pass = new Pass(true, LocalDateTime.now());
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
                ", pass=" + pass +
                ", spentToday=" + spentToday +
                '}';
    }
}