package Tugas.Tugas_PBO;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Login:");
        System.out.println("1. Admin\n2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin043") && password.equals("Password043")) {
                System.out.println("Login Berhasil");

            } else {
                System.out.println("Login gagal! Username atau password salah");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM: ");
            long nim = scanner.nextLong();

            if (nama.equals("Akhmad Arjuan Syuhada") && nim == 202410370110043L) {
                System.out.println("Login Mahasiswa Berhasil");

                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah");
            }
        } else {
            System.out.println("Pilihan tidak valid");

        }
        scanner.close();

    }
}
