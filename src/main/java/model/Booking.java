package model;

public class Booking {

    private Hotel hotel;
    private Double sumRegularWeek;
    private Double sumFidelityWeek;
    private Double sumRegularWeekend;
    private Double sumFidelityWeekend;

    public Booking(Hotel hotel, Double sumRegularWeek, Double sumFidelityWeek, Double sumRegularWeekend, Double sumFidelityWeekend) {
        this.hotel = hotel;
        this.sumRegularWeek = sumRegularWeek;
        this.sumFidelityWeek = sumFidelityWeek;
        this.sumRegularWeekend = sumRegularWeekend;
        this.sumFidelityWeekend = sumFidelityWeekend;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Double getSumRegularWeek() {
        return sumRegularWeek;
    }

    public void setSumRegularWeek(Double sumRegularWeek) {
        this.sumRegularWeek = sumRegularWeek;
    }

    public Double getSumFidelityWeek() {
        return sumFidelityWeek;
    }

    public void setSumFidelityWeek(Double sumFidelityWeek) {
        this.sumFidelityWeek = sumFidelityWeek;
    }

    public Double getSumRegularWeekend() {
        return sumRegularWeekend;
    }

    public void setSumRegularWeekend(Double sumRegularWeekend) {
        this.sumRegularWeekend = sumRegularWeekend;
    }

    public Double getSumFidelityWeekend() {
        return sumFidelityWeekend;
    }

    public void setSumFidelityWeekend(Double sumFidelityWeekend) {
        this.sumFidelityWeekend = sumFidelityWeekend;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "hotel=" + hotel +
                ", sumRegularWeek=" + sumRegularWeek +
                ", sumFidelityWeek=" + sumFidelityWeek +
                ", sumRegularWeekend=" + sumRegularWeekend +
                ", sumFidelityWeekend=" + sumFidelityWeekend +
                '}';
    }
}
