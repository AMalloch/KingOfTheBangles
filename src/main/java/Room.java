import java.util.ArrayList;

public class Room {

    private String name;
    private Enemy enemy;
    private Treasure treasure;
    private ArrayList<Player> players;
    private boolean completed;

    public Room(String name, Enemy enemy, Treasure treasure) {
        this.name = name;
        this.enemy = enemy;
        this.treasure = treasure;
        this.players = new ArrayList<>();
        this.completed = false;
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public boolean isComplete() {
//      check if the enemy is not there, or is dead
        boolean enemyCondition = enemy == null || enemy.getHealth() == 0;
//      check if the treasure is not there or is collected
        boolean treasureCondition = treasure == null || treasure.isCollected();
//        if both are true, the room is complete
        if (enemyCondition && treasureCondition) {
            completed = true;
        }
        return completed;
    }
}

