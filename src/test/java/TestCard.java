
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by will on 1/24/16.
 */
public class TestCard {

    @Test
    public void testGetPoints() {

        // Test that correct number of total points is returned for various individual cards
        Card testCard = new Card(Value.KING, Suit.DIAMONDS);
        int points = testCard.getPoints();
        assertTrue(testCard.getPoints() == 22);

        Card testCard2 = new Card(Value.THREE, Suit.CLUBS);
        assertTrue(testCard2.getPoints() == 3);

        Card testCard3 = new Card(Value.JACK, Suit.HEARTS);
        assertTrue(testCard3.getPoints() == 15);

        Card testCard4 = new Card(Value.QUEEN, Suit.SPADES);
        assertTrue(testCard4.getPoints() == 14);

        Card testCard5 = new Card(Value.ACE, Suit.DIAMONDS);
        assertTrue(testCard5.getPoints() == 0);

    }

}
