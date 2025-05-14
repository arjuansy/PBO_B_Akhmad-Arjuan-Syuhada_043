package Codelab.Modul_4.perpustakaan;

public class NonFiksi extends Buku {
    public  NonFiksi(String judul, String penulis, String kategori){
        super (judul, penulis, kategori);
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku non fiksi : "+judul+" oleh " + penulis + " (Bidang " + kategori+")");
    }
}


