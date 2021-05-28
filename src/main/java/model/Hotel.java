package model;

import model.emun.Ranks;

public class Hotel {

    private String name;
    private Ranks rank;
    private Double regularPriceOnWeekdays;
    private Double fidelityPriceOnWeekdays;
    private Double regularPriceOnWeekend;
    private Double fidelityPriceOnWeekend;

    public Hotel() {

    }

    public Hotel(String name, Ranks rank, Double regularPriceOnWeekdays, Double fidelityPriceOnWeekdays, Double regularPriceOnWeekend, Double fidelityPriceOnWeekend) {
        this.name = name;
        this.rank = rank;
        this.regularPriceOnWeekdays = regularPriceOnWeekdays;
        this.fidelityPriceOnWeekdays = fidelityPriceOnWeekdays;
        this.regularPriceOnWeekend = regularPriceOnWeekend;
        this.fidelityPriceOnWeekend = fidelityPriceOnWeekend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public Double getRegularPriceOnWeekdays() {
        return regularPriceOnWeekdays;
    }

    public void setRegularPriceOnWeekdays(Double regularPriceOnWeekdays) {
        this.regularPriceOnWeekdays = regularPriceOnWeekdays;
    }

    public Double getFidelityPriceOnWeekdays() {
        return fidelityPriceOnWeekdays;
    }

    public void setFidelityPriceOnWeekdays(Double fidelityPriceOnWeekdays) {
        this.fidelityPriceOnWeekdays = fidelityPriceOnWeekdays;
    }

    public Double getRegularPriceOnWeekend() {
        return regularPriceOnWeekend;
    }

    public void setRegularPriceOnWeekend(Double regularPriceOnWeekend) {
        this.regularPriceOnWeekend = regularPriceOnWeekend;
    }

    public Double getFidelityPriceOnWeekend() {
        return fidelityPriceOnWeekend;
    }

    public void setFidelityPriceOnWeekend(Double fidelityPriceOnWeekend) {
        this.fidelityPriceOnWeekend = fidelityPriceOnWeekend;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", regularPriceOnWeekdays=" + regularPriceOnWeekdays +
                ", fidelityPriceOnWeekdays=" + fidelityPriceOnWeekdays +
                ", regularPriceOnWeekend=" + regularPriceOnWeekend +
                ", fidelityPriceOnWeekend=" + fidelityPriceOnWeekend +
                '}';
    }
}
