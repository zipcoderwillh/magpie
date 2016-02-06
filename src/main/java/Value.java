
/**
 * Created by will on 1/24/16.
 */
public enum Value {

    TWO (0),
    THREE (3),
    FOUR (0),
    FIVE (5),
    SIX (0),
    SEVEN (7),
    EIGHT (0),
    NINE (9),
    TEN (0),
    JACK (10),
    QUEEN (14),
    KING (20),
    ACE (0);

    private final int BASEPOINTS;

    Value(int basePoints) {
        this.BASEPOINTS = basePoints;
    }

    public int getBasePoints() {
        return BASEPOINTS;
    }

}
