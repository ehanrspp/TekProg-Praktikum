/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task8.pkg2;

/**
 *
 * @author Raii
 */
public class Square extends Rectangle {
    
    // instance //
    public Square (double side) {
        super (side, side);
    }
    
    // to String //
    @Override
    public String toString () {
        return "A Square with side = " + super.getWidth () + ", which subclass of " + super.toString();
    }
    
    // methods //
    @Override
    public double getArea () {
        return super.getWidth () * super.getWidth();
    }
    
    @Override
    public double getPerimeter () {
        return (4*super.getWidth());
    }
    
    @Override
    public void setLength (double length) {
        super.setWidth (length);
    }
    
    @Override
    public void setWidth (double width) {
        super.setLength (width);
    }
}
