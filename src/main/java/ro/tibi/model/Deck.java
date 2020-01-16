package ro.tibi.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private static Deck deck;
    private List<CardTypes> cards;

    //Shuffled deck logic
    private Deck() {
        initializeDeck();
        Collections.shuffle(cards, new Random());
    }

    public static Deck getInstance() {
        if (deck == null)
            return new Deck();
        else
            return deck;

    }

    public static void main(String[] args) {
        Deck pokerCard = new Deck();
        List<CardTypes> deck = pokerCard.getCards();
        for (CardTypes x : deck)
            System.out.print(x.toString().charAt(1) + " ");

    }

    public List<CardTypes> getCards() {
        return cards;
    }

    private void initializeDeck() {
        cards = new ArrayList<>();
        for (int i = 0; i <= 12; i++)
            for (int j = 0; j < 4; j++)
                cards.add(CardTypes.values()[i]);
    }
}
