import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    private Creature orc;
    private Creature troll;

    @Before
    public void setUp() throws Exception {
        orc = new Creature("Orc", 100, 50);
        troll = new Creature("Troll", 100, 50);
    }

    @Test
    public void canAttackAndTakeDamage() {
        orc.attack(troll);
        assertEquals(50, troll.getHealth());
    }
}
