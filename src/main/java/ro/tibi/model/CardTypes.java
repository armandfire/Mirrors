package ro.tibi.model;

public enum CardTypes {
    _2(14), _3(14), _4(4), _5(5),
    _6(6), _7(7), _8(8), _9(9),
    _10(14), _J(11), _Q(12), _K(13),
    _A(14);

    private int value;

    CardTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
