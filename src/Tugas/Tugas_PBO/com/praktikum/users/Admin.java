package Tugas.Tugas_PBO.com.praktikum.users;

import Tugas.Tugas_PBO.com.praktikum.actions.AdminAction;
import java.util.Scanner;

public class Admin extends User implements AdminAction {

    private final String username;
    private final String password;
    Scanner scan = new Scanner (System.in);

    public Admin() {
        super("Admin043", "Password043");
        this.username = "Admin043";
        this.password = "Password043";
    }

    @Override
    public boolean login(String usernameInput, String passwordInput) {
        return this.username.equals(usernameInput) && this.password.equals(passwordInput);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nLogin Admin Sukses!!");
        System.out.println();
    }

    @Override
    public void displayAppMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Kelola Laporan Barang");
        System.out.println("2. kelola Data Mahasiswa");
        System.out.println("0. Logout");
        int pilihan;

        do {
            System.out.print("Masukkan Pilihan: ");


            pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUser();
                    break;
                case 0:
                    System.out.println("Logout Berhasil");
                    break;
                default:
                    System.out.println("pilihan salah");
            }
        } while (pilihan != 0);
    }
    @Override
    public void manageItems() {
        System.out.println(">>Fitur Kelola Barang Belum Tersedia <<");
        System.out.println();
    }

    @Override
    public void manageUser() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
        System.out.println();
    }
}

