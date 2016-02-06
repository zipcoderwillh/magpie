
/**
 * Created by will on 1/24/16.
 */
public enum Suit {

    HEARTS (true),
    DIAMONDS (true),
    CLUBS (false),
    SPADES (false);

    private final boolean ISHEARTSORDIAMONDS;

    Suit(boolean isHeartsOrDiamonds) {
        this.ISHEARTSORDIAMONDS = isHeartsOrDiamonds;
    }

    public boolean isHeartsOrDiamonds() {
        return ISHEARTSORDIAMONDS;
    }

}
