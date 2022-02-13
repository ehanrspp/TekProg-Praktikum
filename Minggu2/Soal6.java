package Minggu2;
import java.lang.String;
import java.util.Scanner;

public class Soal6 {
 public static void main(String[] args) {
  /* Kamus Data */
  String A, B;
  
  /* Algoritma */
  Scanner sc = new Scanner(System.in);
  A = sc.nextLine();
  B = sc.nextLine();
  System.out.println("The sum the lengths of A and B is " + (A.length() + B.length()));
  
  if (A.compareTo(B) > 0) {
   System.out.println("Yes");
  } else {
   System.out.println("No");
    }

  System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " 
  + B.substring(0, 1).toUpperCase() + B.substring(1));
 }
}