
/**
 * Write a description of class Circle here.
 * 
 * @author (Sadiq Muhammad ) 
 * @U15/FNS/CSC/035
 */
public class Circle
{
private static int numberOfCircles = 0;
private double radius;
public Circle(double circleRadius) {
numberOfCircles++;
radius = circleRadius;
}
public double area() {
return Math.PI * radius * radius;
}
public double circumference() {
return 2.0 * Math.PI * radius;
}
public static int getNumberOfCircles() {
return numberOfCircles;
}
}
