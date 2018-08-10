package com.karichkovsky.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Point2DTest {

    /**
     * Test of getDistanceTo method, of class Point2D. Simple inputs.
     */
    @Test
    public void testGetDistanceTo_validCheck() {
        Point2D other = new Point2D(-4, -3);
        Point2D instance = new Point2D(2, 5);
        double expResult = 10;
        double result = instance.getDistanceTo(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistanceTo method, of class Point2D. Overflow inputs.
     */
    @Test
    public void testGetDistanceTo_overflowCheck() {
        Point2D other = new Point2D(Integer.MAX_VALUE, 0);
        Point2D instance = new Point2D(Integer.MIN_VALUE + 1, 0);
        double expResult = (long) Integer.MAX_VALUE + Integer.MAX_VALUE;
        double result = instance.getDistanceTo(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistanceTo method, of class Point2D. Null input.
     */
    @Test
    public void testGetDistanceTo_throwNPE() {
        Point2D other = null;
        Point2D instance = new Point2D(0, 0);
        assertThrows(NullPointerException.class, () -> instance.getDistanceTo(other));
    }

    /**
     * Test of getDistanceToCenter method, of class Point2D. Simple input.
     */
    @Test
    public void testGetDistanceToCenter() {
        System.out.println("getDistanceToCenter");
        Point2D instance = new Point2D(3, 4);
        double expResult = 5.0;
        double result = instance.getDistanceToCenter();
        assertEquals(expResult, result);
    }
}
