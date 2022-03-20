/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author ehans
 */
public class Main {
public static void main(String[] args) {
        // TODO code application logic here
        Potpie potObject = new Potpie (27,7,2003);
        Orang peopleObject = new Orang ("Raihan Shidqi Pangestu", potObject);
        
        System.out.println (peopleObject);
    }
    
}