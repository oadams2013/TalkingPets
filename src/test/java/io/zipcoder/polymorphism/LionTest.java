package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class LionTest {
    @Test
    public void speakTest(){
        String expected = "Roar";
        Lion l = new Lion();
        String actual = l.speak();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetName(){
        Lion l = new Lion();
        String expected = "Leo";
        String actual = l.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        Lion l = new Lion();
        String expected = "Larry";
        l.setName(expected);
        String actual = l.getName();
        Assert.assertEquals(expected, actual);
    }
}

