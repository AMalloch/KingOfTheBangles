import java.util.ArrayList;

public class Quest {
    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Player> players;

    public Quest(String name, ArrayList<Room> rooms, ArrayList<Player> players) {
        this.name = name;
        this.rooms = rooms;
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
