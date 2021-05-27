package model.emun;

public enum HotelName {

    PARQUE_DAS_FLORES("Parque das flores"),
    JARDIN_BOTANICO("Jardim Botânico"),
    MAR_ATLANTICO("Mar Atlântico");


    private final String value;

    HotelName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
