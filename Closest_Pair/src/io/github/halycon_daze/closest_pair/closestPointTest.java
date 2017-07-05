package io.github.halycon_daze.closest_pair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class closestPointTest {

    @Test
    public void testPointDistance() {
        Point testPoint1 = new Point(0, 0, 0);
        Point testPoint2 = new Point(1, 1, 1);
        
        assertEquals("Distance between points should be sqrt(3)", Math.sqrt(3), testPoint1.distanceTo(testPoint2), 0.001 );
        
        testPoint1.moveTo(1, 1, 1);
        assertEquals("Distance between points should be 0", 0, testPoint1.distanceTo(testPoint2), 0.001 );
        
        testPoint2.moveTo(-1, -1, -1);
        assertEquals("Distance between points should be sqrt(12)", Math.sqrt(12), testPoint1.distanceTo(testPoint2), 0.001 );
        
        testPoint2.moveTo(-1, 1, -1);
        assertEquals("Distance between points should be sqrt(8)", Math.sqrt(8), testPoint1.distanceTo(testPoint2), 0.001 );
    }

    @Test
    public void testClosestPoint() {
        Point[] testPointArray = {new Point(0, 0, 0), new Point(1, 1, 1), new Point(2, 2, 2), new Point(3, 3, 3), new Point(4, 4, 4)};
        
        assertEquals("The closest point to point 0 is point 1", testPointArray[1], testPointArray[0].closestPoint(Arrays.copyOfRange(testPointArray, 1, testPointArray.length)) );
        
        testPointArray[1].moveTo(3, 3, 3);
        
        assertEquals("The closest point to point 0 is point 2", testPointArray[2], testPointArray[0].closestPoint(Arrays.copyOfRange(testPointArray, 1, testPointArray.length)) );
        
        assertEquals("The closest point to point 3 is point 1", testPointArray[1], testPointArray[3].closestPoint(testPointArray) );
        
        assertEquals("The closest point to point 4 is point 1", testPointArray[1], testPointArray[4].closestPoint(Arrays.copyOfRange(testPointArray, 0, testPointArray.length - 1)) );
    }
    
    @SuppressWarnings("deprecation")
    @Test
    public void testTwoClosestPoint () {
        Point[] testPointArray = {new Point(0, 0, 0), 
                                  new Point(0, 0, 1)};

        assertEquals("The closest points to eachother is points 0 & 1", testPointArray, Point.twoClosestPoints(testPointArray));
    }
    
}
