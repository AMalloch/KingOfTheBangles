public class Treasure {

    private TreasureType type;
    private boolean collected;

    public Treasure(TreasureType type) {
        this.type = type;
        this.collected = false;
    }

    public TreasureType getType() {
        return type;
    }

    public int getValue() {
        return type.getValue();
    }


    public boolean isCollected() {
        return collected;
    }

    public void getCollected() {
        this.collected = true;
    }
}
