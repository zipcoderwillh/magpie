
import java.util.ArrayList;

/**
 * Created by will on 1/24/16.
 */
public class Player {

    private ArrayList<Card> allCards = new ArrayList<>();
    private int totalPoints;

    public ArrayList<Card> getAllCards() {
        return allCards;
    }

    public void addNewCard(Card newCard) {
        allCards.add(newCard);
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int points) {
        totalPoints = points;
    }

}