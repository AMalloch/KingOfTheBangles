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
}

