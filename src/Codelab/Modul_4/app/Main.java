package Codelab.Modul_4.app;
import Codelab.Modul_4.perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Fiksi("Journal Of Terror", "Sweta Kartika", "Horror");
        Buku buku2 = new NonFiksi("Koala Kumal", "Raditya Dika", "Biografi");

        System.out.println();
        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Arjuan ","043");
        Anggota anggota2 = new Anggota("Farel", "040");

        anggota1.displayInfo();
        anggota2.displayInfo();
        System.out.println();

        anggota1.pinjamBuku(buku1.judul);

        anggota2.pinjamBuku(buku2.judul, 10);

        anggota1.kembalikanBuku(buku1.judul);

        anggota2.kembalikanBuku(buku2.judul);
    }
}
