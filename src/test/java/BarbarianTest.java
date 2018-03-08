import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Rogue rogue;
    private Club club;

//    can we hardcode Weapon values ???

    @Before
    public void setUp() throws Exception {
        club = new Club(50);
        barbarian = new Barbarian("Alan", 200, club);
        rogue = new Rogue("Steve", 150, club);
    }

    @Test
    public void canAttack() {
        barbarian.attack(rogue);
        assertEquals(100, rogue.getHealth());
    }
}
