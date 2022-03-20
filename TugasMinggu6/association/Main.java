/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association;

/**
 *
 * @author ehans
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Ecommerce ecommerce = new Ecommerce ("Tokopedia");
        
        // inisialisasi nama pegawai //
        Employee e1 = new Employee ("Muhamad Naufal Al Ghani");
        Employee e2 = new Employee ("Dewita Eka");
        Employee e3 = new Employee ("Rahmatia Kusmana");
        Employee e4 = new Employee ("Taufikkurahman");
        
        // tampil //
        System.out.println(e1.getNameEmployee() + " adalah pegawai dari ecommerce " + ecommerce.getEcommerceName());
        System.out.println(e2.getNameEmployee() + " adalah pegawai dari ecommerce " + ecommerce.getEcommerceName());
        System.out.println(e3.getNameEmployee() + " adalah pegawai dari ecommerce " + ecommerce.getEcommerceName());
        System.out.println(e4.getNameEmployee() + " adalah pegawai dari ecommerce " + ecommerce.getEcommerceName());
    }
    
}