public class Mahasiswa {
    String nama = "Akhmad Arjuan Syuhada";
    String nim = "202410370110043";

    public boolean login (String inputNama, String inputNim) {
        return inputNama.equals(nama) && inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}
