import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private Creature creature;
    private ChaosBall ball;

    @Before
    public void setUp() throws Exception {
        ball = new ChaosBall(20);
        creature = new Creature("Ogre", 50, 10);
        warlock = new Warlock("Jeff", 250, ball, creature);
    }

    @Test
    public void canGetHealth() {
        assertEquals(250, warlock.getHealth());
    }

    @Test
    public void canAttackAndCreatureTakesDamage() {
        Wizard wizard = new Wizard("Barry", 300, ball, creature);
        warlock.attack(wizard);
        assertEquals(300, wizard.getHealth());
        assertEquals(30, creature.getHealth());
    }

    @Test
    public void canAttackKillCreatureThenTakeDamage() {
        creature = new Creature("Snotling", 1, 1);
        Wizard wizard = new Wizard("Barry", 300, ball, creature);
        warlock.attack(wizard);
//        need to make Creature health stick at 0
        assertEquals(300, wizard.getHealth());
        warlock.attack(wizard);
        assertEquals(280, wizard.getHealth());
    }

    @Test
    public void canChangeSpell() {
        LightningBolt bolt = new LightningBolt(20);
        warlock.changeItem(bolt);
        assertEquals(bolt, warlock.getItem());
    }

    @Test
    public void cannotChangeToWeapon() {
        Sword sword = new Sword(20);
        warlock.changeItem(sword);
        assertEquals(ball, warlock.getItem());
    }
}
