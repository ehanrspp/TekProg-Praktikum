package soal3;
import java.util.Scanner;

/**
 *
 * @author Ehan
 * Program ini bertujuan untuk menampilkan sebuah angka sesuai dengan input angka dan operasi yang diinputkan
 */
public class Soal3 {

    public static void main(String[] args) {
        // kamus data //
        Scanner keyboard = new Scanner(System.in);
        int angka1,angka2; // angka yang akan diinput dan dioperasikan
        char operator; // operator yang akan diinputkan
        
        // algoritma //
        A = keyboard.nextInt();
        operator = keyboard.next().charAt(0); // input operator
        B = keyboard.nextInt();
        if ((A>=1 && A<=1000) && (B>=1 && B<=1000)){
            switch (operator){
                case '+' : System.out.println(A+B);
                    break;
                case '-' : System.out.println(A-B);
                    break;
                case '*' : System.out.println(A*B);
                    break;
                case '/' : System.out.println(A/B);
                    break;
                case '%' : System.out.println(A%B);
                    break;
            }   
        }
    }
    
}
