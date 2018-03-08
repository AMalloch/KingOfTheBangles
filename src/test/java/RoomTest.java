import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RoomTest {

    private Room room1;
    private Room room2;
    private Enemy enemy;
    private Treasure treasure;
    private Knight knight;
    private Sword sword;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("John", 4, 1);
        sword = new Sword(45);
        knight = new Knight("Angus", 45, sword);
        treasure = new Treasure(TreasureType.COIN);
        room1 = new Room("Codeclan", enemy, null);
        room2 = new Room("Bank of Scotland", null, treasure);
    }

    @Test
    public void hasNoPlayers() {
        assertEquals(0, room1.countPlayers());
    }

    @Test
    public void canAddPlayer() {
        room1.addPlayer(knight);
        assertEquals(1, room1.countPlayers());
    }

//    is not complete with enemy

    @Test
    public void isNotCompleteWithEnemy() {
        assertFalse(room1.isComplete());
    }
//    is not complete with treausure

    @Test
    public void isNotCompleteWithTreasure() {
        assertFalse(room2.isComplete());
    }
//    is complete with dead enemy

    @Test
    public void isCompleteWithDeadEnemy() {
        room1.addPlayer(knight);
        knight.attack(enemy);
        assert (room1.isComplete());
    }
//    is complete with collected treasure

    @Test
    public void isCompleteWithCollectedTreasure() {
        room2.addPlayer(knight);
        knight.collectTreasure(treasure);
        assert(room2.isComplete());
    }
}
