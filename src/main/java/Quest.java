import java.util.ArrayList;

public class Quest {
    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Player> players;

    private int currentRoom;

    public Quest(String name, ArrayList<Room> rooms, ArrayList<Player> players) {
        this.name = name;
        this.rooms = rooms;
        this.players = players;
//        start in Room 0
        this.currentRoom = 0;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }


    public void playNextRoom() {
        Room room = rooms.get(currentRoom);
        for (Player player : players) {
            room.addPlayer(player);
        }
    }

    public Room getCurrentRoom() {
        return rooms.get(currentRoom);
    }

    public void checkRoomComplete() {
        Room room = getCurrentRoom();
        if (room.isComplete()){
            currentRoom += 1;
        }
    }
}
