package Codelab.Modul_4.perpustakaan;

public class Fiksi extends Buku{
    public Fiksi(String judul, String penulis, String kategori){
        super(judul,penulis,kategori);
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi : "+judul+" oleh " + penulis + " (Genre " + kategori + ")");

    }


}
