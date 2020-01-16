package ro.tibi.logic;

import ro.tibi.model.CardTypes;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<CardTypes> board;
    private int value;

    protected Table() {
        this.board = new ArrayList<>();
    }

    public void putCardOnBoard(CardTypes card) {
        board.add(card);
        value = card.getValue();
    }
}
