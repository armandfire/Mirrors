package ro.tibi.logic;

import ro.tibi.model.CardTypes;
import ro.tibi.model.Player;
import ro.tibi.model.Deck;

import java.util.ArrayList;
import java.util.List;

public class GameHandler {
    List<Player> players;
    Table table;
    Deck deck;
    List<CardTypes> deck;

    public GameHandler() {
        initializeGame();
    }

    private void initializeGame() {
        deck = Deck.getInstance();
        deck = deck.getCards();
        players = new ArrayList<>();
        table = new Table();
        //TODO: Give players cards
    }

    public void handle(List<Player> players, Deck deck) {
    }
}
