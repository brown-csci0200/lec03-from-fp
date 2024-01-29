package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.Boa;
import src.Dillo;
import src.Zoo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalsTest {

    Dillo babyDillo = new Dillo(5,false);
    Dillo adultDillo = new Dillo(24, false);
    Zoo sadZoo = new Zoo(babyDillo, adultDillo);

    Dillo bigDillo = new Dillo(18, false);
    Boa snek = new Boa("Bob", 45, "rats");
    Zoo zoo2 = new Zoo(bigDillo, snek);

    /**
     * Example test method.
     * Test methods must have @Test before the method
     */
    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(1+1, 2);
    }
    @Test
    public void testMakeDillo() {
        Assert.assertEquals(babyDillo.length, 5);
    }

    @Test
    public void testCanShelter() {
        Assert.assertEquals(false, babyDillo.canShelter());
    }

    @Test
    public void testZooHealth(){
        Assert.assertEquals(false, sadZoo.healthCheck());
        Assert.assertEquals(true, zoo2.healthCheck());
    }

}
