public abstract class GameActor implements Damageable {

    private String name;
    private int health;

    public GameActor(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void takeDamage(int damage){
        this.health -= damage;
//        reset health to 0 if it goes into minus values
        if (this.health < 0) {
            setHealth(0);
        }
    }


}
