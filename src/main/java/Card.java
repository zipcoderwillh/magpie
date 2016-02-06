
/**
 * Created by will on 1/24/16.
 */
public class Card {

    private Value value;
    private Suit suit;
    private int points;

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getPoints() {

        // For JACK, QUEEN, and KING, check if it is HEARTS/DIAMONDS, and assign additional points if so.
        // For everything else, assign base points as defined in Value enum class.
        switch(value) {
            case JACK: points = suit.isHeartsOrDiamonds() ?  15 : value.getBasePoints();
                break;
            case QUEEN: points = suit.isHeartsOrDiamonds() ?  18 : value.getBasePoints();
                break;
            case KING: points = suit.isHeartsOrDiamonds() ? 22 : value.getBasePoints() ;
                break;
            default: points = value.getBasePoints();
                break;
        }

        return points;
    }

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

}
