package com.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fmontoto on 11-01-16.
 */
public class PointTest {

    private Point a;
    @Before
    public void before() {
        a = new Point(1.2, 5.6);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("(1.2,5.6)", a.toString());

    }

    @Test
    public void testGetDistance() throws Exception {
        assertEquals(0.0, a.getDistance(new Point(1.2, 5.6)), 0.0001);
    }
}