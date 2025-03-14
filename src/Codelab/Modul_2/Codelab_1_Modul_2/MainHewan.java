package Codelab.Modul_2.Codelab_1_Modul_2;

public class MainHewan {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.nama = "kucing";
        hewan1.jenis = "Mamalia";
        hewan1.suara = "Nyan~~";

        hewan2.nama = "Anjing";
        hewan2.jenis = "Mamalia";
        hewan2.suara = "Woof-woof!!";

        hewan1.tampilkaninfo();
        System.out.println("");
        hewan2.tampilkaninfo();
    }
}

