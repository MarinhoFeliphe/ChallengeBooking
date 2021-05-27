package model;


import java.util.Objects;

public class BestHotelVO {

    private Hotel hotel;
    private Double priceToClientTotalDays;

    public BestHotelVO(Hotel hotel, Double priceToClientTotalDays) {
        this.hotel = hotel;
        this.priceToClientTotalDays = priceToClientTotalDays;
    }

    public BestHotelVO() {
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Double getPriceToClientTotalDays() {
        return priceToClientTotalDays;
    }

    public void setPriceToClientTotalDays(Double priceToClientTotalDays) {
        this.priceToClientTotalDays = priceToClientTotalDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BestHotelVO)) return false;
        BestHotelVO that = (BestHotelVO) o;
        return Objects.equals(getHotel(), that.getHotel()) && Objects.equals(getPriceToClientTotalDays(), that.getPriceToClientTotalDays());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHotel(), getPriceToClientTotalDays());
    }

    @Override
    public String toString() {
        return "MelhorHotel{" +
                "hotel=" + hotel +
                ", priceToClientTotalDays=" + priceToClientTotalDays +
                '}';
    }
}
