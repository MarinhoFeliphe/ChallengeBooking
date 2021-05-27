package model;

public class Booking {

    private Hotel hotel;
    private Double totalPriceToRegularClientOnWeekDays;
    private Double totalPriceToFidelityClientOnyWeekDays;
    private Double totalPriceToRegularClientOnWeekendDays;
    private Double totalPriceToFidelityClientOnWeekendDays;

    public Booking(Hotel hotel, Double totalPriceToRegularClientOnWeekDays, Double totalPriceToFidelityClientOnyWeekDays, Double totalPriceToRegularClientOnWeekendDays, Double totalPriceToFidelityClientOnWeekendDays) {
        this.hotel = hotel;
        this.totalPriceToRegularClientOnWeekDays = totalPriceToRegularClientOnWeekDays;
        this.totalPriceToFidelityClientOnyWeekDays = totalPriceToFidelityClientOnyWeekDays;
        this.totalPriceToRegularClientOnWeekendDays = totalPriceToRegularClientOnWeekendDays;
        this.totalPriceToFidelityClientOnWeekendDays = totalPriceToFidelityClientOnWeekendDays;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Double getTotalPriceToRegularClientOnWeekDays() {
        return totalPriceToRegularClientOnWeekDays;
    }

    public void setTotalPriceToRegularClientOnWeekDays(Double totalPriceToRegularClientOnWeekDays) {
        this.totalPriceToRegularClientOnWeekDays = totalPriceToRegularClientOnWeekDays;
    }

    public Double getTotalPriceToFidelityClientOnyWeekDays() {
        return totalPriceToFidelityClientOnyWeekDays;
    }

    public void setTotalPriceToFidelityClientOnyWeekDays(Double totalPriceToFidelityClientOnyWeekDays) {
        this.totalPriceToFidelityClientOnyWeekDays = totalPriceToFidelityClientOnyWeekDays;
    }

    public Double getTotalPriceToRegularClientOnWeekendDays() {
        return totalPriceToRegularClientOnWeekendDays;
    }

    public void setTotalPriceToRegularClientOnWeekendDays(Double totalPriceToRegularClientOnWeekendDays) {
        this.totalPriceToRegularClientOnWeekendDays = totalPriceToRegularClientOnWeekendDays;
    }

    public Double getTotalPriceToFidelityClientOnWeekendDays() {
        return totalPriceToFidelityClientOnWeekendDays;
    }

    public void setTotalPriceToFidelityClientOnWeekendDays(Double totalPriceToFidelityClientOnWeekendDays) {
        this.totalPriceToFidelityClientOnWeekendDays = totalPriceToFidelityClientOnWeekendDays;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "hotel=" + hotel +
                ", totalPriceToRegularClientOnWeekDays=" + totalPriceToRegularClientOnWeekDays +
                ", totalPriceToFidelityClientOnyWeekDays=" + totalPriceToFidelityClientOnyWeekDays +
                ", totalPriceToRegularClientOnWeekendDays=" + totalPriceToRegularClientOnWeekendDays +
                ", totalPriceToFidelityClientOnWeekendDays=" + totalPriceToFidelityClientOnWeekendDays +
                '}';
    }
}
