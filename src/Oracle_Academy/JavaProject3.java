package Oracle_Academy;
import java.util.Scanner;

public class JavaProject3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Mengambil 10 input dari pengguna
            System.out.print("Masukkan nama kamu: ");
            String nama = input.nextLine();

            System.out.print("Masukkan nama kota: ");
            String kota = input.nextLine();

            System.out.print("Masukkan Game favorit kamu: ");
            String game = input.nextLine();

            System.out.print("Masukkan kata kerja (misalnya: bermain): ");
            String kataKerja = input.nextLine();

            System.out.print("Masukkan kata sifat (misalnya: lucu): ");
            String kataSifat = input.nextLine();

            System.out.print("Masukkan jumlah tahun (angka bulat): ");
            int tahun = input.nextInt();

            System.out.print("Masukkan umur kamu saat ini (angka bulat): ");
            int umur = input.nextInt();

            System.out.print("Masukkan angka desimal acak (misalnya: 3.14): ");
            double angkaDesimal1 = input.nextDouble();

            System.out.print("Masukkan angka desimal lainnya: ");
            double angkaDesimal2 = input.nextDouble();

            input.nextLine();

            System.out.print("Masukkan kata lucu atau aneh: ");
            String kataLucu = input.nextLine();

            // Perhitungan
            int umurMasaDepan = umur + tahun;
            double totalHarta = angkaDesimal1 + angkaDesimal2;

            System.out.println("Di kota " + kota + ", hiduplah seseorang bernama " + nama + ".");
            System.out.println(nama + " sangat suka " + kataKerja + " dan hobinya main game " + game + ".");
            System.out.println("Orang-orang mengenalnya memiliki sifat yang " + kataSifat + ".");
            System.out.println("Suatu hari, " + nama + " bermimpi ramalan yang mengatakan:");
            System.out.println("\"Dalam " + tahun + " tahun, kamu akan menjadi atlet profesional game di " + kota + "!\"");
            System.out.println("Pada saat itu, umurmu akan menjadi " + umurMasaDepan + " tahun.");
            System.out.println("Mimpi itu juga meramalkan bahwa kamu akan memenangkan harta sebesar Rp" + totalHarta + " juta!");
            System.out.println("Sejak saat itu, semua orang memanggilmu \"" + kataLucu + " Sang Legenda.\"");
            System.out.println("\nDan kamu hidup bahagia selamanya. Tamat.");

            input.close();
        }
    }


