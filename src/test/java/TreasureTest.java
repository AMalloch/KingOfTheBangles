import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    private Treasure treasure;

    @Before
    public void setUp() throws Exception {
        treasure = new Treasure(TreasureType.GEM);
    }

    @Test
    public void canGetType() {
        assertEquals(TreasureType.GEM, treasure.getType());
    }

    @Test
    public void canGetValueFromType() {
        assertEquals(60, treasure.getValue());
    }
}
