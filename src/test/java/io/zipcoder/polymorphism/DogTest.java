package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest(){
        String expected = "Woof";
        Dog d = new Dog();
        String actual = d.speak();
        Assert.assertEquals(expected, actual);
    }


    public void testGetName(){
        Dog d = new Dog();
        String expected = "Apollo";
        String actual = d.getName();
        Assert.assertEquals(expected, actual);
    }


    public void testSetName(){
        Dog d = new Dog();
        String expected = "Fido";
        d.setName(expected);
        String actual = d.getName();
        Assert.assertEquals(expected, actual);
    }


}
