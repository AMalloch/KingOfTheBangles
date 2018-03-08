public class Creature extends GameActor implements IAttack {

    private String name;
    private int health;
    private int attackValue;

    public Creature(String name, int health, int attackValue) {
        super(name, health);
        this.attackValue = attackValue;
    }

    @Override
    public void attack(GameActor gameActor) {
        gameActor.takeDamage(attackValue);
    }
}
