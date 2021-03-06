import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.ArrayList;

public abstract class Player extends GameActor implements ISelect, IHealth{

    private String name;
    private int health;
    private Item item;
    private int satchel;

    public Player(String name, int health, Item item) {
        super(name, health);
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public void increaseHealth(int power){
        int newHealth = getHealth() + power;
        setHealth(newHealth);
    }

    public int getSatchel() {
        return satchel;
    }

    public void collectTreasure(Treasure treasure){
        int value = treasure.getValue();
        satchel += value;
        treasure.getCollected();
    }
}
