import java.util.ArrayList;

public abstract class MagicPlayer extends Player implements IAttack{
    private Creature creature;

    public MagicPlayer(String name, int health, Spell spell, Creature creature) {
        super(name, health, spell);
        this.creature = creature;
    }

    @Override
    public void attack(GameActor gameActor) { // can change this to only attack Enemies
        int damage = getItem().getPower();
        gameActor.takeDamage(damage);

    }

    @Override
    public void setSelectedItem() {

    }


}
