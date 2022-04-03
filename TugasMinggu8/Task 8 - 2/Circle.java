/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task8.pkg2;

/**
 *
 * @author Raii
 */
public class Circle extends Shape{
    
    // instance //
    private double radius;
    
    // constructor //
    public Circle () {
        super ();
        this.radius = 1.0;
    }
    
    public Circle (double radius){
        super ();
        this.radius = radius;
    }
    
    public Circle (double radius, String color, boolean filled) {
        super (color, filled);
        this.radius = radius;
    }
    
    // getter and setter //
    public double getRadius () {
        return radius;
    }
    
    public void getRadius (double radius) {
        this.radius = radius;
    }
    
    // methods //
    public double getArea () {
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter () {
        return Math.PI*(radius + radius);
    }
    
    // to String //
    @Override
    public String toString (){
        return "A Circle with radius = " + this.radius + ", which is sublass of " + super.toString ();
    }
}
