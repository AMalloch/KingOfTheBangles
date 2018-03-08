import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    private Rogue player;
    private Quest quest;
    private Room room1;
    private Room room2;
    private Enemy enemy;
    private Treasure treasure;
    private ArrayList<Room> rooms;
    private ArrayList<Player> players;
    private Club club;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("Jacob", 45, 2);
        treasure = new Treasure(TreasureType.COIN);
        room1 = new Room("1", enemy, null);
        room2 = new Room("2", null, treasure);
        rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        players = new ArrayList<>();
        club = new Club(34);
        player = new Rogue("Alan", 45, club);
        players.add(player);
        quest = new Quest("Cool Quest", rooms, players);
    }

    @Test
    public void hasPlayers() {
        assert(quest.getPlayers().contains(player));
    }

    @Test
    public void startsWithPlayersInFirstRoom() {
        quest.playNextRoom();
        Room room = quest.getCurrentRoom();
        assertEquals(1, room.countPlayers());
    }
}
