
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by will on 1/24/16.
 */
public class TestDeck {

    @Test
    public void testGetRandomCard() {
        // Test that function returns a valid card.
        Deck testDeck = new Deck();
        assertTrue(testDeck.getRandomCard() instanceof Card);
    }

}
