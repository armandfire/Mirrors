package ro.tibi.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public List<CardTypes> hand = new ArrayList<>();
    public List<CardTypes> bottom = new ArrayList<>();
    public List<CardTypes> face = new ArrayList<>();
    private String name;


    public Player(String name, List<CardTypes> hand, List<CardTypes> bottom, List<CardTypes> face) {
        this.name = name;
        this.hand = hand;
        this.bottom = bottom;
        this.face = face;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<CardTypes> getHand() {
        return hand;
    }

    public List<CardTypes> getBottom() {
        return bottom;
    }

    public List<CardTypes> getFace() {
        return face;
    }
}
