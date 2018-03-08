public abstract class MeleePlayer extends Player implements IAttack{

    public MeleePlayer(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    @Override
    public void attack(GameActor gameActor) { // can change this to only attack Enemies
        int damage = getItem().getPower();
        gameActor.takeDamage(damage);

    }

    @Override
    public void changeItem(Item item) {
        if (item instanceof Weapon) {
            setItem(item);
        }
    }

}
