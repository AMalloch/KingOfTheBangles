public enum TreasureType {
    COIN(1),
    GEM(60),
    GOBLET(20);

    private final int value;

    TreasureType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
