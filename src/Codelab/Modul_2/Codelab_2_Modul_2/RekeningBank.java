package Codelab.Modul_2.Codelab_2_Modul_2;

import java.util.Scanner;

public class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;
    double uang;
    Scanner input = new Scanner(System.in);

    void tampilkaninfo(){
        System.out.println("Nomor Rekening: "+ nomorRekening);
        System.out.println("Nama Pemilik: "+ namaPemilik);
        System.out.println("Saldo: "+ saldo);
        System.out.println("");
    }
    void setorUang() {
        do {
            System.out.print(namaPemilik + " Menyetor Rp");
            uang = input.nextDouble();

            if (uang < 0) {
                System.out.println("Setoran tidak bisa negatif. Silakan masukkan jumlah yang benar.");
            }

        } while (uang < 0); // Mengulang jika input negatif

        saldo = saldo + uang;
        System.out.println("Saldo sekarang: " + saldo);
        System.out.println("");
    }


    void tarikUang(){

        System.out.print(namaPemilik + " Menarik Rp");
        double uang = input.nextDouble();

        if (uang >= 0 && uang <= saldo) {
            saldo = saldo - uang;
            System.out.println("[Berhasil] Saldo: "+ saldo);

        } else {
            if (uang > saldo){
                System.out.println("[Gagal saldo tidak mencukupi] Saldo sekarang:  " + saldo);
            }
        }

    }
}
