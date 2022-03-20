/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aggregation;

/**
 *
 * @author ehans
 */
public class Guru {

    // state //
    private String nip;
    private String nama ;
    
    // constructor //
    public Guru (String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNip (){
        return nip;
    }
}