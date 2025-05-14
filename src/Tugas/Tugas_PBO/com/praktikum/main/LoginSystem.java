package Tugas.Tugas_PBO.com.praktikum.main;

import Tugas.Tugas_PBO.com.praktikum.users.Admin;
import Tugas.Tugas_PBO.com.praktikum.users.Mahasiswa;
import Tugas.Tugas_PBO.com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {

        User user1 = new Admin();
        User user2 = new Mahasiswa();

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   Sistem Login   ");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilihan login: ");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1")) {
            System.out.print("Masukkan Username: ");
            String usernameInput = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String passwordInput = scanner.nextLine();

            boolean berhasil = user1.login(usernameInput, passwordInput);
            if (berhasil) {
                user1.displayInfo();
                user1.displayAppMenu();
            } else {
                System.out.println("\nLogin Admin gagal! Username atau password salah.");
            }

        } else if (pilihan.equals("2")) {
            System.out.print("Masukkan Nama: ");
            String namaInput = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nimInput = scanner.nextLine();

            boolean berhasil = user2.login(namaInput, nimInput);
            if (berhasil) {
                user2.displayInfo();
                System.out.println();
                user2.displayAppMenu();
            } else {
                System.out.println("\nLogin Mahasiswa gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid! Harap pilih 1 atau 2.");
        }

        scanner.close();
    }

    public static void main (String[] args){
        LoginSystem system = new LoginSystem();
        system.run();
    }

}