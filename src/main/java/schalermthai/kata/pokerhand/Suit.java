package schalermthai.kata.pokerhand;

/**
 * Created by schalermthai on 23/07/2015.
 */
public enum Suit {
    CLUB("C"), DIAMOND("D"), HEART("H"), SPADE("S");

    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Suit fromSymbol(String sym) {
        for (Suit suit : Suit.values()) {
            if (suit.getSymbol().equals(sym)) {
                return suit;
            }
        }

        throw new IllegalArgumentException("Unknown suit: " + sym);
    }
}
