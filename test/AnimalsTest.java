package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.Dillo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalsTest {

    Dillo babyDillo = new Dillo(5,false);
    Dillo medDillo = new Dillo(20, false);

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
    public void testIsBigger() {
        // Can create a new object another Dillo that only exists
        // inside test is bigger
        Dillo anotherDillo = new Dillo(50, true);

        // Every object has a "this", including the object that holds our tests!
        // To access babyDillo, we can use this.babyDillo as well
        // (if we don't use "this", Java can usually figure it out)
        Assert.assertEquals(false, this.babyDillo.isBigger(medDillo));
        Assert.assertEquals(true, anotherDillo.isBigger(medDillo));
    }

}
