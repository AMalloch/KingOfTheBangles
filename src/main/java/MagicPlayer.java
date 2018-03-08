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
    public void changeItem(Item item) {
        if (item instanceof Spell) {
            setItem(item);
        }
    }

    @Override
    public void takeDamage(int damage) {
//        get the Creature to take damage if its alive
        if (this.creature.getHealth() > 0) {
            this.creature.takeDamage(damage);
            damage = 0;
        }
        super.takeDamage(damage);
    }

//   could ADD: add attack with Creature --

}
