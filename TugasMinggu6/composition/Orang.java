/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author ehans
 */
public class Orang {
private String name;
    private Potpie birthday;
    
    public Orang(String theName, Potpie theDate){
        name = theName;
        birthday = theDate;
    }
    
    public String toString(){
        return String.format ("My name is %s, my birthday is %s", name, birthday);
    }
}
