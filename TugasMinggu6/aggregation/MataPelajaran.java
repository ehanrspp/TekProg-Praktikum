/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author ehans
 */
public class MataPelajaran {
    // state //
    private String namaMataPelajaran;
    private Guru guru;
    
    // constructor //
    public MataPelajaran (String namaMataPelajaran){
        this.namaMataPelajaran = namaMataPelajaran;
    }
    
    // getter setter //
    public void setGuru (Guru guru){
        this.guru = guru;
    }
    
    public Guru getGuru(){
        return guru;
    }
    
    public String getNamaMataPelajaran(){
        return namaMataPelajaran;
    }
}