package Oracle_Academy.JavaProject4;

import java.util.Scanner;

public class tutorial {
    public static void main (String [] args) {
        System.out.println("Hello World \"kkkk\" ");

        System.out.println("Namaku ___ dan aku memiliki hobi ___. Aku sangat ____");

        String nama = "Juan";
        String hobi = "Memotret";
        String sifat = "Tampan";

        System.out.println("Namaku " + nama + " dan aku memiliki hobi " + hobi + ". Aku sangat " + sifat + "");
        System.out.println(nama);

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nama: ");
        String namaku = scan.nextLine();

        System.out.println("Masukkan Hobi: ");
        String hobiku = scan.nextLine();

        System.out.println("Nama anda adalah: "+ namaku+" Hobi anda: "+hobiku+" "); */

        String kiw = contoh("ror");
        kalimat();
    }

    public static void kalimat() {
        System.out.println("Kalimat");
    }

    public static String contoh (String contoh){
        return contoh ("aw") ;
    }
}