import java.util.ArrayList;

public abstract class MagicPlayer extends Player implements IAttack{
    private Creature creature;

    public MagicPlayer(String name, int health, ArrayList<Item> inventory, Creature creature) {
        super(name, health, inventory);
        this.creature = creature;
    }

    @Override
    public void attack(GameActor gameActor) { // can change this to only attack Enemies
        int damage = getSelectedItem().getPower();
//        gameActor.takeDamage(damage);

    }


}
