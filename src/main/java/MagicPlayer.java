import java.util.ArrayList;

public abstract class MagicPlayer extends Player{
    private Creature creature;

    public MagicPlayer(String name, int health, ArrayList<Item> inventory, Creature creature) {
        super(name, health, inventory);
        this.creature = creature;
    }
}
