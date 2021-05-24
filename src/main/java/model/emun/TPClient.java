package model.emun;

public enum TPClient {

    REGULAR("Regular"),
    FIDELITY("Fidelidade");

    private final String value;

    TPClient(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
