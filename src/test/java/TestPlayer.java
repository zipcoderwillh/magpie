
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by will on 1/24/16.
 */
public class TestPlayer {

    @Test
    public void testDrawNewCard() {

        // Instantiate test objects
        Player testPlayer = new Player();
        Card testCard = new Card(Value.KING, Suit.CLUBS);

        // Test that player begins with no cards
        assertTrue(testPlayer.getAllCards().isEmpty());

        // Test that a card is added to player's hand and that card is the same one that was passed as an argument
        testPlayer.addNewCard(testCard);
        assertTrue(testPlayer.getAllCards().size() == 1);
        assertTrue(testPlayer.getAllCards().get(0) == testCard);

    }

}
