package schalermthai.kata.pokerhand;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by schalermthai on 23/07/2015.
 */
public class CardTest {

    @Test
    public void can_create_card_from_string_literal() throws Exception {
        Card normalWay = new Card(Rank.FIVE, Suit.HEART);
        Card literalWay = Card.fromSymbol("5H");

        assertThat(normalWay, Matchers.equalTo(literalWay));
    }

    @Test(expected = IllegalArgumentException.class)
    public void string_literal_needs_to_be_2_chars() throws Exception {
        Card.fromSymbol("5");
    }

    @Test
    public void cards_are_ordered_by_their_rank() throws Exception {
        Card higherCard = new Card(Rank.FIVE, Suit.CLUB);
        Card lowerCard = new Card(Rank.TWO, Suit.CLUB);

        assertTrue(higherCard.compareTo(lowerCard) > 0);
    }

    @Test
    public void suits_are_unordered() throws Exception {
        Card fiveClub = new Card(Rank.FIVE, Suit.CLUB);
        Card fiveHearth = new Card(Rank.FIVE, Suit.HEART);

        assertTrue(fiveClub.compareTo(fiveHearth) == 0);
    }

    @Test
    public void two_is_the_smallest_card() throws Exception {
        Card lowestCard = new Card(Rank.TWO, Suit.SPADE);
        Card highestCard = new Card(Rank.ACE, Suit.HEART);

        assertTrue(lowestCard.compareTo(highestCard) < 0);
    }

    @Test
    public void ace_is_the_highest_card() throws Exception {
        Card kingHeart = new Card(Rank.KING, Suit.HEART);
        Card highestCard = new Card(Rank.ACE, Suit.HEART);

        assertTrue(highestCard.compareTo(kingHeart) > 0);
    }
}