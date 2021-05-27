package model.emun;

public enum ClientType {

    REGULAR("Regular"),
    FIDELITY("Fidelidade");

    private final String value;

    ClientType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
