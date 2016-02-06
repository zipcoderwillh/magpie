
import java.util.Arrays;
import java.util.Random;

/**
 * Created by will on 1/24/16.
 */
public class Deck {

    private Card[] allCards = new Card[52];

    public Card getRandomCard() {

        Card randomCard = null;
        Random rand = new Random();

        // Check and see if the random card has already been dealt, and if not, remove it from the deck and assign it
        // to randomCard. While loop will never become infinite because each player's hand ends when an ace is drawn
        // (only four aces, max four players).
        while(randomCard == null) {
            int randomIndex = rand.nextInt(52);
            if(allCards[randomIndex] != null) {
                randomCard = allCards[randomIndex];
                allCards[randomIndex] = null;
            }
        }

        return randomCard;

    }

    // Populate deck with all cards
    public Deck() {
        int i = 0;
        for(Suit suit : Suit.values()) {
            for(Value value : Value.values()) {
                allCards[i] = new Card(value, suit);
                i++;
            }
        }
    }

}
