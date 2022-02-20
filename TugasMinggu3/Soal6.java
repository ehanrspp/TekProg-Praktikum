package soal6;
import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author Ehan
 * Untuk menjumlah dan mengalikan dua inputan yang berbeda
 */

public class Soal6 {


    public static void main(String[] args) {
    // Data Fields //
    Scanner keyboard = new Scanner (System.in);
    String angka1;
    String angka2;
    BigInteger konversi1;
    BigInteger konversi2;
    
    // Behavior //
    angka1 = keyboard.nextLine();
    angka2 = keyboard.nextLine();
    konversi1 = new BigInteger (angka1);
    konversi2 = new BigInteger (angka2);
    
    // Tampilkan //
    System.out.println (konversi1.add(konversi2));
    System.out.println (konversi1.multiply(konversi2));
    }
    
}
