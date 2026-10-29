package Lecture5.Cards;

import java.util.ArrayList;

public interface ICardFactory {
    ArrayList<Card> createDeck();
    Card createCard(int value, Card.Suits suit);
    Card addCard(int value, Card.Suits suit);
}
