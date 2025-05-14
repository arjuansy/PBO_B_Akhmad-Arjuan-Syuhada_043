package Tugas.Tugas_PBO.com.praktikum.users;

import Tugas.Tugas_PBO.com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    Scanner scan = new Scanner(System.in);

    public Mahasiswa() {
        super("Akhmad Arjuan Syuhada", "202410370110043");
    }

    @Override
    public boolean login(String namaInput, String nimInput) {
        return namaInput.equals(getNama()) && nimInput.equals(getNim());
    }

    @Override
    public void displayInfo() {
        System.out.println("\nLogin Mahasiswa Sukses");
        super.displayInfo();
    }

    @Override
    public void displayAppMenu() {
        System.out.println("=== Pilihan Menu ===");
        System.out.println("1. Laporkan Barang Temuan");
        System.out.println("2. Lihat Daftar Laporan");
        System.out.println("0. Logout");
        int pilihan;

        do {
            System.out.print("Masukkan Pilihan: ");

            pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItem();
                    break;
                case 0:
                    System.out.println("Logout Berhasil");
                    break;
                default:
                    System.out.println("Pilihan salah");
            }
        } while (pilihan != 0);
    }
    @Override
    public void reportItem() {
        System.out.println("=== Laporkan Barang Temuan ===");
        scan.nextLine();
        System.out.print ("Nama barang: ");
        String namaBarang = scan.nextLine();

        System.out.print ("Deskripsi barang: ");
        String deskripsiBarang = scan.nextLine();

        System.out.print("Lokasi terakhir: ");
        String lokasiTerakhir = scan.nextLine();

        System.out.println();

        System.out.println("=== Barang Hilang ===");
        System.out.println("Nama barang: "+ namaBarang);
        System.out.println("Deskripsi barang: "+ deskripsiBarang);
        System.out.println("Lokasi terakhir: "+ lokasiTerakhir);
    }

    @Override
    public void viewReportedItem() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");

    }
}
