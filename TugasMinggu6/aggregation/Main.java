/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author ehans
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Guru guru = new Guru("211525023", "Rayyanza");
        MataPelajaran matapelajaran = new MataPelajaran ("Ilmu Pengetahuan Sosial");
        
        matapelajaran.setGuru(guru);
        
        // tampil //
        System.out.println ("NIP Guru      : " + matapelajaran.getGuru().getNip());
        System.out.println ("Nama Guru     : " + matapelajaran.getGuru().getNama());
        System.out.println ("MataPelajaran : " + matapelajaran.getNamaMataPelajaran());
        System.out.println (matapelajaran.getGuru().getNama() + " adalah guru "+ matapelajaran.getNamaMataPelajaran() + " dengan NIP : " + matapelajaran.getGuru().getNip());
    }
    
}