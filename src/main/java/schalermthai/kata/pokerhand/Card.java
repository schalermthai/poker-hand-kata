package schalermthai.kata.pokerhand;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by schalermthai on 23/07/2015.
 */
public class Card implements Comparable<Card> {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static Card fromSymbol(String s) {

        if (s == null || s.length() != 2) {
            throw new IllegalArgumentException("Mismatch format: " + s);
        }

        Rank rank = Rank.fromSymbol(s.substring(0, 1));
        Suit suit = Suit.fromSymbol(s.substring(1, 2));

        return new Card(rank, suit);
    }

    public int compareTo(Card o) {
        return rank.compareTo(o.rank);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("rank", rank)
                .append("suit", suit)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        return new EqualsBuilder()
                .append(rank, card.rank)
                .append(suit, card.suit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(rank)
                .append(suit)
                .toHashCode();
    }
}
