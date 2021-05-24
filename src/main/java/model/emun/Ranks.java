package model.emun;

public enum Ranks {

    RANK_ONE(1),
    RANK_TWO(2),
    RANK_THREE(3),
    RANK_FOUR(4),
    RANK_FIVE(5),;

    private final int rank;

    Ranks(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
