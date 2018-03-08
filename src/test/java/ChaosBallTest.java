import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChaosBallTest {

    private ChaosBall ball;

    @Before
    public void setUp() throws Exception {
        ball = new ChaosBall(50);
    }

    @Test
    public void canGetPower() {
        assertEquals(50, ball.getPower());
    }
}
