import java.util.ArrayList;

public abstract class Player extends GameActor{

    private String name;
    private int health;
    private ArrayList<Item> inventory;
    private Item selectedItem;
    private int satchel;

    public Player(String name, int health, ArrayList<Item> inventory) {
        super(name, health);
        this.inventory = inventory;
        this.selectedItem = this.inventory.get(0);
    }


    public Item getSelectedItem() {
        return selectedItem;
    }

    public int countInventory() {
        return this.inventory.size();
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }


}
