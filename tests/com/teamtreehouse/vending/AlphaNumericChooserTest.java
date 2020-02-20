package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaNumericChooserTest {

    private AlphaNumericChooser chooser;
    @Before
    public void setUp() throws Exception {
        chooser = new AlphaNumericChooser(26,10);
    }

    @Test
    public void validInputReturnsProperLocation()  throws Exception {
//        fail();
        AlphaNumericChooser.Location loc = chooser.locationFromInput("B4");

        assertEquals("proper row",1, loc.getRow());
        assertEquals("proper column",3, loc.getColumn());
    }

    @Test (expected = InvalidLocationException.class)
    public void choosingWrongInputNotAllowed() throws Exception {
        chooser.locationFromInput("WRONG");
    }

    @Test (expected = InvalidLocationException.class)
    public void choosingLargerThanMaxIsNotAllowed() throws Exception {
        chooser.locationFromInput("B52");

    }
}