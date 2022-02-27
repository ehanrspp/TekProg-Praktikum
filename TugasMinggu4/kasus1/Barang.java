/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus1;

/**
 *
 * @author ehans
 */
public class Barang {

    /**
     * @return the stok
     */
    public int getStock() {
        return stok;
    }
    
    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok += stok; //diubah menjadi += karena operasi hitungan yang diminta adalah operasi tambah
    }
    //data fields
    String kode_barang;
    String nama_barang;
    private int stok; //jadikan varibel stok menjadi private
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
