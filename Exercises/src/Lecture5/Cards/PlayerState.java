package Lecture5.Cards;

import java.util.List;
import java.util.ArrayList;

public class PlayerState {
    private ArrayList<Card> hand;
    private int id;
    private static int i = 0;

    public PlayerState() {
        this.id = i++;
        hand = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public boolean hasCard(Card card) {
        return hand.contains(card);
    }
}
