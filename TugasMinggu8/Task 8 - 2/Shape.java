/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task8.pkg2;

/**
 *
 * @author Raii
 */
public class Shape {
    
    // instances //
    private String color;
    private boolean filled;
    
    // constructor //
    public Shape (){
        this.color = "green";
        this.filled = true;
    }
    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    // getter and setter //
    public String getColor (){
        return color;
    }
    
    public void setColor (String color){
        this.color = color;
    }
    
    public boolean isFilled (){
        return filled;
    }
    
    public void setFilled (boolean filled){
        this.filled = filled;
    }
    
    // to String //
    @Override
    public String toString(){
        return "A shape with color of" + this.color + "and" + this.filled;
    }
}
