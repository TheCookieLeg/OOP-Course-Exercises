package Lecture5.Cards;

public class Card {
    private Suits suit;
    private int value;

    public Card(int value, Suits suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", cardValueToString(value), cardSuitToString(suit));
    }


    public enum Suits {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES
    }

    public String cardSuitToString(Suits suit) {
        return switch (suit) {
            case HEARTS -> "Hearts";
            case DIAMONDS -> "Diamonds";
            case CLUBS -> "Clubs";
            case SPADES -> "Spades";
            default -> "unknown";
        };
    }

    public String cardValueToString(int val) {
        return switch (val) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> Integer.toString(val);
        };
    }
}
