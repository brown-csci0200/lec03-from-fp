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

}
