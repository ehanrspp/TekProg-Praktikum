/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus2;

/**
 *
 * @author ehans
 */
public class Item {
    private String name;
    private Item () {
        name = "Ipin";
    }
    public Item (String name) {
        System.out.println(this.name = new Item ().name); // Isi variabel this.new dengan string name
    }
}
