package Codelab.Modul_2.Codelab_2_Modul_2;

import java.util.Scanner;

public class MainRekening {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110043";
        rekening1.namaPemilik = "Akhmad Arjuan Syuhada";
        rekening1.saldo = Double.parseDouble("2000000");

        rekening2.nomorRekening = "202410370110044";
        rekening2.namaPemilik = "Gatauu siapa";
        rekening2.saldo = Double.parseDouble("9000000");

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        rekening1.setorUang();
        rekening2.setorUang();

        rekening1.tarikUang();
        rekening2.tarikUang();

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }

}
