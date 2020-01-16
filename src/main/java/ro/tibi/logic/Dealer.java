package ro.tibi.logic;

import ro.tibi.model.CardTypes;
import ro.tibi.model.Player;

import java.util.List;

//se poate complica daca este vorba de a fi dealer la player si impartiandu-se de la stanga acestuia...
public class Dealer {
    List<Player> players;

    public Dealer(List<Player> players) {
        players = this.players;
    }

    private void givePlayersCards(List<CardTypes> deck) {
        int i = 0;
        while (i < 9 * players.size()) {
            if (i < 9) players.get(i % 3).bottom.add(deck.get(0));
            else if (i < 18) players.get(i % 3).face.add(deck.get(0));
            else players.get(i % 3).hand.add(deck.get(0));
            deck.remove(0);
            i++;
        }
    }
}
