package model;

import model.emun.Ranks;

public class Hotel {

    private String name;
    private Ranks rank;
    private Double priceToClientOnRegularWeekDays;
    private Double priceToClientOnFidelityWeekDays;
    private Double priceToClientOnRegularWeekendDays;
    private Double priceToClientOnFidelityWeekendDays;

    public Hotel() {

    }

    public Hotel(String name, Ranks rank, Double priceToClientOnRegularWeekDays, Double priceToClientOnFidelityWeekDays, Double priceToClientOnRegularWeekendDays, Double priceToClientOnFidelityWeekendDays) {
        this.name = name;
        this.rank = rank;
        this.priceToClientOnRegularWeekDays = priceToClientOnRegularWeekDays;
        this.priceToClientOnFidelityWeekDays = priceToClientOnFidelityWeekDays;
        this.priceToClientOnRegularWeekendDays = priceToClientOnRegularWeekendDays;
        this.priceToClientOnFidelityWeekendDays = priceToClientOnFidelityWeekendDays;
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

    public Double getPriceToClientOnRegularWeekDays() {
        return priceToClientOnRegularWeekDays;
    }

    public void setPriceToClientOnRegularWeekDays(Double priceToClientOnRegularWeekDays) {
        this.priceToClientOnRegularWeekDays = priceToClientOnRegularWeekDays;
    }

    public Double getPriceToClientOnFidelityWeekDays() {
        return priceToClientOnFidelityWeekDays;
    }

    public void setPriceToClientOnFidelityWeekDays(Double priceToClientOnFidelityWeekDays) {
        this.priceToClientOnFidelityWeekDays = priceToClientOnFidelityWeekDays;
    }

    public Double getPriceToClientOnRegularWeekendDays() {
        return priceToClientOnRegularWeekendDays;
    }

    public void setPriceToClientOnRegularWeekendDays(Double priceToClientOnRegularWeekendDays) {
        this.priceToClientOnRegularWeekendDays = priceToClientOnRegularWeekendDays;
    }

    public Double getPriceToClientOnFidelityWeekendDays() {
        return priceToClientOnFidelityWeekendDays;
    }

    public void setPriceToClientOnFidelityWeekendDays(Double priceToClientOnFidelityWeekendDays) {
        this.priceToClientOnFidelityWeekendDays = priceToClientOnFidelityWeekendDays;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", priceToClientOnRegularWeekDays=" + priceToClientOnRegularWeekDays +
                ", priceToClientOnFidelityWeekDays=" + priceToClientOnFidelityWeekDays +
                ", priceToClientOnRegularWeekendDays=" + priceToClientOnRegularWeekendDays +
                ", priceToClientOnFidelityWeekendDays=" + priceToClientOnFidelityWeekendDays +
                '}';
    }
}
