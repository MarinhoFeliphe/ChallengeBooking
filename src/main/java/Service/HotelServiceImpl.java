package Service;

import Service.Interface.HotelService;
import model.Hotel;
import model.emun.Ranks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelServiceImpl implements HotelService {


    public static final String PARQUE_DAS_FLORES = "Parque das flores";
    public static final String JARDIN_BOTANICO = "Jardim Botânico";
    public static final String MAR_ATLANTICO = "Mar Atlântico";

    @Override
    public List<Hotel> loadHotel() {

        List<Hotel> hotelList = new ArrayList<>();
        hotelList.addAll(Arrays.asList(
                new Hotel(PARQUE_DAS_FLORES, Ranks.RANK_THREE, 110d, 80d, 90d, 80d),
                new Hotel(JARDIN_BOTANICO, Ranks.RANK_FOUR, 160d, 110d, 60d, 50d),
                new Hotel(MAR_ATLANTICO, Ranks.RANK_FIVE, 220d, 100d, 150d, 40d)));

        return hotelList;
    }
}
