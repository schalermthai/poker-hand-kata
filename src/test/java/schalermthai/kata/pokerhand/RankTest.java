package schalermthai.kata.pokerhand;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by schalermthai on 23/07/2015.
 */
public class RankTest {

    @Test
    public void fromSymbol_returns_matching_rank() throws Exception {

        assertEquals(Rank.TWO, Rank.fromSymbol("2"));
        assertEquals(Rank.FIVE, Rank.fromSymbol("5"));
        assertEquals(Rank.TEN, Rank.fromSymbol("T"));
        assertEquals(Rank.JACK, Rank.fromSymbol("J"));
        assertEquals(Rank.QUEEN, Rank.fromSymbol("Q"));
        assertEquals(Rank.KING, Rank.fromSymbol("K"));
        assertEquals(Rank.ACE, Rank.fromSymbol("A"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void fromSymbol_throw_exception_for_unknown_rank() throws Exception {
        Rank.fromSymbol("R");
    }
}