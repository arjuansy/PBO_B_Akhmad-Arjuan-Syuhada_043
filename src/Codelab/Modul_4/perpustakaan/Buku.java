package Codelab.Modul_4.perpustakaan;

public abstract class Buku {

    public String judul;
    public String penulis;
    public String kategori;

   public Buku(String judul, String penulis, String kategori){
       this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
   }

    public abstract void displayInfo();
}
