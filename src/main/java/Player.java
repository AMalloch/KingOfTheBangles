import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
    private ArrayList<Item> inventory;
    private Item selectedItem;
    private int satchel;

    public Player(String name, int health, ArrayList<Item> inventory) {
        this.name = name;
        this.health = health;
        this.inventory = inventory;
        this.selectedItem = this.inventory.get(0);
    }

    public int getHealth() {
        return health;
    }

    public int countInventory() {
        return this.inventory.size();
    }
}
