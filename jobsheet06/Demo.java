package jobsheet06;

import jobsheet06.inheritace.Dosen;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Yansy Ayuningtyas", "34329837", 3000000, "1989432439");

        // dosen1.nama = "Yansy Ayuningtyas";
        // dosen1.nip = "34329837";
        // dosen1.gaji = 3000000;
        // dosen1.nidn = "1989432439";

        System.out.println(dosen1.getAllInfo());
    }
   
}
