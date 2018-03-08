import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Rogue rogue;
    private Club club;
    private Treasure treasure;

//    can we hardcode Weapon values ???

    @Before
    public void setUp() throws Exception {
        club = new Club(50);
        barbarian = new Barbarian("Alan", 200, club);
        rogue = new Rogue("Steve", 150, club);
        treasure = new Treasure(TreasureType.COIN);
    }

    @Test
    public void canAttack() {
        barbarian.attack(rogue);
        assertEquals(100, rogue.getHealth());
    }

    @Test
    public void canChangeWeapon() {
        Sword sword = new Sword(100);
        rogue.changeItem(sword);
        assertEquals(sword, rogue.getItem());
    }

    @Test
    public void cannotChangeToSpell() {
        ChaosBall ball = new ChaosBall(100);
        rogue.changeItem(ball);
        assertEquals(club, rogue.getItem());
    }

    @Test
    public void canCollectTreasure() {
        barbarian.collectTreasure(treasure);
        assertEquals(1, barbarian.getSatchel());
    }
}
