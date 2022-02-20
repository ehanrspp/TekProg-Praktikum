package soal5;

import java.util.Scanner;

/**
 *
 * @author Ehan
 * Program ini bertujuan untuk menentukan apakah keempat mobil tersebut harus berhenti atau jalan berdasarkan plat nomornya
 */
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**/
        String platMobil1, platMobil2, platMobil3, platMobil4;
        long gabunganPlat;
        /**/
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input:");
        platMobil1 = keyboard.next();
        platMobil2 = keyboard.next();
        platMobil3 = keyboard.next();
        platMobil4 = keyboard.next();
        gabunganPlat = Long.parseLong(platMobil1+platMobil2+platMobil3+platMobil4);
        System.out.println("================================");
        System.out.println("Result:");
        if ((gabunganPlat - 999999) % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}