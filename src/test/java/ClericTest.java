import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private HealingPotion potion;
    private Barbarian barbarian;
    private Sword sword;

    @Before
    public void setUp() throws Exception {
        potion = new HealingPotion(25);
        cleric = new Cleric("Eric", 100, potion);
        barbarian = new Barbarian("Barbara", 10, sword);
    }

    @Test
    public void canHeal() {
        cleric.heal(barbarian);
        assertEquals(35, barbarian.getHealth());
    }

    @Test
    public void canChangeHealingTool() {
        DeliciousHerbs herbs = new DeliciousHerbs(45);
        cleric.changeItem(herbs);
        assertEquals(herbs, cleric.getItem());
    }

    @Test
    public void cannotChangeItemToWeapon() {
        Sword sword = new Sword(20);
        cleric.changeItem(sword);
        assertEquals(potion, cleric.getItem());
    }
}
