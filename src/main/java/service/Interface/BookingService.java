package service.Interface;

import model.emun.ClientType;

import java.time.LocalDate;

public interface BookingService {

    public String findByHotelWithBetterValueAndRank(ClientType tpClient, LocalDate... dates);
}
