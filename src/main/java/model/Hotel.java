package model;

import model.emun.Ranks;

public class Hotel {

    private String name;
    private Ranks rank;
    private Double regularWeek;
    private Double fidelityWeek;
    private Double regularWeekend;
    private Double fidelityWeekend;

    public Hotel() {

    }

    public Hotel(String name, Ranks rank, Double valueRegularWeek, Double valueFidelityWeek, Double valueRegularWeekend, Double valueFidelityWeekend) {
        this.name = name;
        this.rank = rank;
        this.regularWeek = valueRegularWeek;
        this.fidelityWeek = valueFidelityWeek;
        this.regularWeekend = valueRegularWeekend;
        this.fidelityWeekend = valueFidelityWeekend;
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

    public Double getRegularWeek() {
        return regularWeek;
    }

    public void setRegularWeek(Double regularWeek) {
        this.regularWeek = regularWeek;
    }

    public Double getFidelityWeek() {
        return fidelityWeek;
    }

    public void setFidelityWeek(Double fidelityWeek) {
        this.fidelityWeek = fidelityWeek;
    }

    public Double getRegularWeekend() {
        return regularWeekend;
    }

    public void setRegularWeekend(Double regularWeekend) {
        this.regularWeekend = regularWeekend;
    }

    public Double getFidelityWeekend() {
        return fidelityWeekend;
    }

    public void setFidelityWeekend(Double fidelityWeekend) {
        this.fidelityWeekend = fidelityWeekend;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", regularWeek=" + regularWeek +
                ", fidelityWeek=" + fidelityWeek +
                ", regularWeekend=" + regularWeekend +
                ", fidelityWeekend=" + fidelityWeekend +
                '}';
    }
}
