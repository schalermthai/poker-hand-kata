package schalermthai.kata.pokerhand;

/**
 * Created by schalermthai on 23/07/2015.
 */
public enum Rank {
    TWO(2, "2"), THREE(3, "3"),
    FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"),
    SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"),
    TEN(10, "T"), JACK(11, "J"), QUEEN(12, "Q"),
    KING(13, "K"), ACE(14, "A");

    private final int value;
    private final String symbol;

    Rank(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Rank fromSymbol(String sym) {
        for (Rank rank : Rank.values()) {
            if (rank.getSymbol().equals(sym)) {
                return rank;
            }
        }

        throw new IllegalArgumentException("Unknown rank: " + sym);
    }
}
