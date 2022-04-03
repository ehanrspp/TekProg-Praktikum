/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task8.pkg2;

/**
 *
 * @author Raii
 */
public class Rectangle extends Shape {
    
    // instance //
    private double width;
    private double length;
    
    // constructor //
    public Rectangle () {
        super ();
        this.width = 1.0;
        this.length = 1.0;
    }
    
    public Rectangle (double width, double radius) {
        super ();
        this.width = width;
        this.length  = length;
    }
    
    public Rectangle (double width, double radius, String color, boolean filled) {
        super (color, filled);
        this.width = width;
        this.length = length;
    }
    
    // getter and setter //
    public double getWidth () {
        return width;
    }
    
    public void setWidth (double width) {
        this.width = width;
    }
    
    public double getLength () {
        return length;
    }
    
    public void setLength (double length) {
        this.length = length;
    }
    
    // methods //
    public double getArea () {
        return width*length;
    }
    
    public double getPerimeter () {
        return 2*(length + width);
    }
    
    // to String //
    @Override
    public String toString () {
        return "A Rectangle with width = " + this.width + "and length = " + this.length + ", which is a subclass of " + super.toString ();
    }
}
