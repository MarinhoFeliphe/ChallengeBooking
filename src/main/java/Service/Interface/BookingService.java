package Service.Interface;

import model.emun.TPClient;

import java.time.LocalDate;

public interface BookingService {

    public String findByHotel(TPClient tpClient, LocalDate... dates);
}
