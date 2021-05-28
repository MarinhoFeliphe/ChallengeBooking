package model;

public class Booking {

    private Hotel hotel;
    private Double totalRegularPriceOnWeekdays;
    private Double totalFidelityPriceOnWeekdays;
    private Double totalRegularPriceOnWeekend;
    private Double totalFidelityPriceOnWeekend;

    public Booking(Hotel hotel, Double totalRegularPriceOnWeekdays, Double totalFidelityPriceOnWeekdays,
                   Double totalRegularPriceOnWeekend, Double totalFidelityPriceOnWeekend) {

        this.hotel = hotel;
        this.totalRegularPriceOnWeekdays = totalRegularPriceOnWeekdays;
        this.totalFidelityPriceOnWeekdays = totalFidelityPriceOnWeekdays;
        this.totalRegularPriceOnWeekend = totalRegularPriceOnWeekend;
        this.totalFidelityPriceOnWeekend = totalFidelityPriceOnWeekend;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Double getTotalRegularPriceOnWeekdays() {
        return totalRegularPriceOnWeekdays;
    }

    public void setTotalRegularPriceOnWeekdays(Double totalRegularPriceOnWeekdays) {
        this.totalRegularPriceOnWeekdays = totalRegularPriceOnWeekdays;
    }

    public Double getTotalFidelityPriceOnWeekdays() {
        return totalFidelityPriceOnWeekdays;
    }

    public void setTotalFidelityPriceOnWeekdays(Double totalFidelityPriceOnWeekdays) {
        this.totalFidelityPriceOnWeekdays = totalFidelityPriceOnWeekdays;
    }

    public Double getTotalRegularPriceOnWeekend() {
        return totalRegularPriceOnWeekend;
    }

    public void setTotalRegularPriceOnWeekend(Double totalRegularPriceOnWeekend) {
        this.totalRegularPriceOnWeekend = totalRegularPriceOnWeekend;
    }

    public Double getTotalFidelityPriceOnWeekend() {
        return totalFidelityPriceOnWeekend;
    }

    public void setTotalFidelityPriceOnWeekend(Double totalFidelityPriceOnWeekend) {
        this.totalFidelityPriceOnWeekend = totalFidelityPriceOnWeekend;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "hotel=" + hotel +
                ", totalRegularPriceOnWeekdays=" + totalRegularPriceOnWeekdays +
                ", totalFidelityPriceOnWeekdays=" + totalFidelityPriceOnWeekdays +
                ", totalRegularPriceOnWeekend=" + totalRegularPriceOnWeekend +
                ", totalFidelityPriceOnWeekend=" + totalFidelityPriceOnWeekend +
                '}';
    }
}
