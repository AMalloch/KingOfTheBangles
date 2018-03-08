import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingPotionTest {

    private HealingPotion potion;

    @Before
    public void setUp() throws Exception {
        potion = new HealingPotion(50);
    }

    @Test
    public void canGetPower() {
        assertEquals(50, potion.getPower());
    }
}
