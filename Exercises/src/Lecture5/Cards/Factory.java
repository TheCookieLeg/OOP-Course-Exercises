package Lecture5.Cards;

import java.util.ArrayList;

public class Factory implements ICardFactory{

    public ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<Card>();
        for (Card.Suits suit : Card.Suits.values()) {
            for (int j = 1; j < 14; j++) {
                deck.add(new Card(j, suit));
            }
        }
        return deck;
    }

    public Card addCard(int value, Card.Suits suit) {
        return createCard(value, suit);
    }

    public Card createCard(int value, Card.Suits suit) {
        return new Card(value, suit);
    }
}
