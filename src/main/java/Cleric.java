public class Cleric extends Player{

    public Cleric(String name, int health, Item item) {
        super(name, health, item);
    }



    @Override
    public void changeItem(Item item) {
        if (item instanceof HealingTool) {
            setItem(item);
        }
    }

    public void heal(Player player) {
        int power = getItem().getPower();
        player.increaseHealth(power);

    }
}
