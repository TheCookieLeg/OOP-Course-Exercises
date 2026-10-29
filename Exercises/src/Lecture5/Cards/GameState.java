package Lecture5.Cards;

import java.util.ArrayList;
import java.util.Collections;

public class GameState {
    private ArrayList<Card> drawPile;
    private ArrayList<Card> playPile;
    private ArrayList<PlayerState> player;
    private final int playerNumber;
    private final ICardFactory _factory;


    public GameState(int players, ICardFactory factory) {
        this.playerNumber = players;
        this._factory = factory;
        player = new ArrayList<PlayerState>();

        for (int i = 0; i < playerNumber; i++) {
            player.add(new PlayerState());
        }

        initGame();
    }


    private void initGame() {
        drawPile = _factory.createDeck();
        Collections.shuffle(drawPile);

        // Give cards to players
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < playerNumber; j++) {
                player.get(j).addCard(drawPile.getFirst());
                drawPile.removeFirst();
            }
        }

    }






}
