import java.util.Scanner;

public class LoginSystem {
    Admin admin;
    Mahasiswa mahasiswa;

    public LoginSystem() {
        admin = new Admin();
        mahasiswa = new Mahasiswa();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi (1/2): ");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1")) {
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            boolean berhasil = admin.login(username, password);
            if (berhasil) {
                System.out.println("\nLogin Admin berhasil!");

            } else {
                System.out.println("\nLogin Admin gagal! Username atau password salah.");
            }

        } else if (pilihan.equals("2")) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            boolean berhasil = mahasiswa.login(nama, nim);
            if (berhasil) {
                System.out.println("\nLogin Mahasiswa berhasil!");
                mahasiswa.displayInfo();
            } else {
                System.out.println("\nLogin Mahasiswa gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid! Harap pilih 1 atau 2.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        LoginSystem system = new LoginSystem();
        system.run();
    }
}
