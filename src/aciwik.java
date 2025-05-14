import java.util.Scanner;
import java.util.ArrayList;
public class aciwik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pilihanJurusanBudi = {"Teknik Informatika", "Sistem Informasi", "Teknik Elektro", "Teknik Komputer"};

        System.out.println(budi.getNama());
        for (int i = 0; i < pilihanJurusanBudi.length; i++) {
            System.out.println(i + 1 + ". " + pilihanJurusanBudi[i]);
        }


        System.out.printf(budi.getPilihanJurusan(1));
        CalonSiswa[] cs = new CalonSiswa[3];
        cs[0] = new CalonSiswa("Ali", "Rizki", pilihanJurusanBudi);
        cs[1] = new CalonSiswa("Budi", "aa", "aass");
        for (CalonSiswa data : cs) {
            data.printCalonSiswa;
        }
        ArrayList<CalonSiswa> listcs = new ArrayList<>();
        listcs.add(new CalonSiswa("a", "b", pilihanJurusanBudi));
        listcs.add(new CalonSiswa("aa", "bb", "cc"));

        Integer <CalonSiswa> itcs = listcs.iterator();
        while (itcs.hasNext()){
            CalonSiswa data = itcs.next();
            data.printCalonSiswa();
    }
    }

    public void printCalonSiswa(){
        System.out.println("Nama siswa:" + this.nama);
        for (String i: this.pilihanJurusan){
            System.out.println("pilihan jurusan"+ i);
        }
    }

    public class CalonSiswa{
        private String nama;
        private String nim;
        private String[] pilihanJurusan;

        public void setPilihanJurusan (String pj1, String pj2, String pj3, String pj4)
        {
            this.pilihanJurusan[0] = pj1;
            this.pilihanJurusan[1] = pj2;
            this.pilihanJurusan[2] = pj3;
            this.pilihanJurusan[3] = pj4;
        }
        public void setJalurPendaftaran (String[] jalurPendaftaran){
            this.setJalu rPendaftaran = jalurPendaftaran;
        }

        public String getNama(){
            return nama;
        }

        public String getPilihanJurusan(){
            return pilihanJurusan
        }

        public String getJalurPendaftaran(){
            return jalurPendaftaran;
        }
    }
}