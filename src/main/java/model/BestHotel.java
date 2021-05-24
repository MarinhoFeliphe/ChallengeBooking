package model;


import java.util.Objects;

public class BestHotel {

    private Hotel hotel;
    private Double valorTotal;

    public BestHotel(Hotel hotel, Double valorTotal) {
        this.hotel = hotel;
        this.valorTotal = valorTotal;
    }

    public BestHotel() {
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BestHotel)) return false;
        BestHotel that = (BestHotel) o;
        return Objects.equals(getHotel(), that.getHotel()) && Objects.equals(getValorTotal(), that.getValorTotal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHotel(), getValorTotal());
    }

    @Override
    public String toString() {
        return "MelhorHotel{" +
                "hotel=" + hotel +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
