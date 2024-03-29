/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task8.pkg1;

/**
 *
 * @author Raii
 */
public class Circle {

/**
* The Circle class models a circle with a radius and color.
*/
// private instance variable, not accessible from outside this class
private double radius;
private String color;
// Constructors (overloaded)
/** Constructs a Circle instance with default value for radius and color */
public Circle() { // 1st (default) constructor
    radius = 1.0;
    color = "red";
}
/** Constructs a Circle instance with the given radius and default color */
public Circle(double r) { // 2nd constructor
    radius = r;
    color = "red";
}
/** Returns the radius */
public double getRadius() {
    return radius;
}
public String getColor() {
    return color;
}
public void setColor(String color){
    this.color=color;
}
/** Returns the area of this Circle instance */
public double getArea() {
    return radius*radius*Math.PI;
}
/** Return a self-descriptive string of this instance in the form of
Circle[radius=?,color=?] */
public String toString() {
    return "Circle[radius=" + radius + " color=" + color + "]";
}
}