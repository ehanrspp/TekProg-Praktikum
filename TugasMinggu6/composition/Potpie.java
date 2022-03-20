/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

/**
 *
 * @author ehans
 */
public class Potpie {

     private int month;
    private int day;
    private int year;
    
    public Potpie(int d, int m, int y){
        month = m;
        day = d;
        year = y;
        
    }
   
    @Override
    public String toString(){
        return String.format("%d/%d/%d", day,month,year);
    }
}
