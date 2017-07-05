package io.github.halycon_daze.closest_pair;

import java.util.Arrays;

public class Point {
    double x;
    double y;
    double z;
        
    Point(double x_dimension, double y_dimension, double z_dimension){
        x = x_dimension;
        y = y_dimension;
        z = z_dimension;
    }
    
    Point(double x_dimension, double y_dimension){
        x = x_dimension;
        y = y_dimension;
        z = 0;
    }
    
    public void moveTo (double x_dimension, double y_dimension, double z_dimension) {
        x = x_dimension;
        y = y_dimension;
        z = z_dimension;
    }
    
    /**
     * @param otherPoint A point
     * @return the distance from this to otherpoint
     * 
     * @author Christopher Chin
     * @date June 30. 2017
     * 
     */
    
    public double distanceTo (Point otherPoint) {
        double x_Distance = Math.pow(x - otherPoint.x, 2);
        double y_Distance = Math.pow(y - otherPoint.y, 2);
        double z_Distance = Math.pow(z - otherPoint.z, 2);
        
        return Math.sqrt(x_Distance + y_Distance + z_Distance);
    }
    
    public Point closestPoint (Point[] pointList) {
        Point closest = pointList[0];
        
        for (Point point : pointList) {
            if (this.distanceTo(point) < this.distanceTo(closest)) {
                closest = point;
            }
        }
        
        return closest;
    }
    
    public static Point[] twoClosestPoints (Point[] pointList) {
        Point[] closestPoints = {pointList[0], pointList[1]};
        Point currentClosest;
        
        for (int i = 0; i < pointList.length; i ++) {
            currentClosest = pointList[i].closestPoint(Arrays.copyOfRange(pointList, i, pointList.length));
            
            if (pointList[i].distanceTo(currentClosest) < closestPoints[0].distanceTo(closestPoints[1])){
                closestPoints[0] = pointList[i];
                closestPoints[1] = currentClosest;
            }
        }
        
        return closestPoints;
    }
    
}
