public class Treasure {

    private TreasureType type;

    public Treasure(TreasureType type) {
        this.type = type;
    }

    public TreasureType getType() {
        return type;
    }

    public int getValue() {
        return type.getValue();
    }
}
