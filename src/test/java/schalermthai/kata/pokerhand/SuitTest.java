package schalermthai.kata.pokerhand;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by schalermthai on 23/07/2015.
 */
public class SuitTest {

    @Test
    public void fromSymbol_returns_matching_suit() throws Exception {

        assertEquals(Suit.HEART, Suit.fromSymbol("H"));
        assertEquals(Suit.CLUB, Suit.fromSymbol("C"));
        assertEquals(Suit.SPADE, Suit.fromSymbol("S"));
        assertEquals(Suit.DIAMOND, Suit.fromSymbol("D"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void fromSymbol_throw_exception_for_unknown_suit() throws Exception {
        Suit.fromSymbol("R");
    }

}