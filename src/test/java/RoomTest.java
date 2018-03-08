import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room1;
    private Room room2;
    private Enemy enemy;
    private Treasure treasure;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("John", 4, 1);
        treasure = new Treasure(TreasureType.COIN);
        room1 = new Room("Codeclan", enemy, null);
        room1 = new Room("Bank of Scotland", null, treasure);
    }

    @Test
    public void hasNoPlayers() {
        assertEquals(0, room1.countPlayers());
    }
}
