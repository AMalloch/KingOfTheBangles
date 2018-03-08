public class Enemy extends GameActor implements IAttack{

    private int attackValue;

    public Enemy(String name, int health, int attackValue) {
        super(name, health);
        this.attackValue = attackValue;
    }

    @Override
    public void attack(GameActor gameActor) {
        gameActor.takeDamage(attackValue);
    }
}
