import javafx.scene.effect.Light;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Wizard wizard;
    private Enemy enemy;
    private LightningBolt bolt;
    private Creature rat;

    @Before
    public void setUp() throws Exception {
        bolt = new LightningBolt(45);
        rat = new Creature("rat", 25, 5);
        wizard = new Wizard("Phyllis", 250, bolt, rat);
        enemy = new Enemy("Evil Dragon", 100, 25);
    }

    @Test
    public void enemyCanAttack() {
        enemy.attack(wizard);
        assertEquals(0, rat.getHealth());
        assertEquals(250, wizard.getHealth());
        enemy.attack(wizard);
        assertEquals(225, wizard.getHealth());
    }

    @Test
    public void canTakeDamage() {
        wizard.attack(enemy);
        assertEquals(55, enemy.getHealth());
    }
}
