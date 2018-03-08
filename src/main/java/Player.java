import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.ArrayList;

public abstract class Player extends GameActor implements ISelect{

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
}
