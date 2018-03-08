import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private ArrayList<Item> inventory;
    private Creature creature;
    private ChaosBall ball;

    @Before
    public void setUp() throws Exception {
        ball = new ChaosBall(20);
        inventory = new ArrayList<>();
        inventory.add(ball);
        creature = new Creature("Ogre", 50, 10);
        warlock = new Warlock("Jeff", 250, inventory, creature);
    }

    @Test
    public void canGetHealth() {
        assertEquals(250, warlock.getHealth());
    }

    @Test
    public void hasInventory() {
        assertEquals(1, warlock.countInventory());
    }
}
