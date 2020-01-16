package ro.tibi.application;

import ro.tibi.model.CardTypes;
import ro.tibi.model.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static void showCards(List<CardTypes> cards) {
        for (CardTypes card : cards)
            System.out.print(card.toString().charAt(1) + " ");
        System.out.println();
//        System.out.println("Length: " + cards.size());
    }

    public static void showPlayersHands(List<Player> players) {
        for (Player player : players)
            showCards(player.hand);
    }
}
