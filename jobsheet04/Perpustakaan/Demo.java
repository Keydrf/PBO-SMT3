package jobsheet04.Perpustakaan;
import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Pegawai dinda = new Pegawai("321", "Adinda Kusuma");
        Pegawai firly = new Pegawai("987", "Firly Sabrina");

        Buku kancil = new Buku("678", "Kancil Cerdik");
        Buku asd = new Buku("432", "ALgoritma Struktur Data");

        Anggota anggota1 = new Anggota("6767", "Sindi");
        anggota1.tambahPeminjaman(LocalDate.of(2024, 8, 9), kancil, firly);
        anggota1.tambahPeminjaman(LocalDate.of(2024, 9, 1), asd, dinda);

        System.out.println(anggota1.getInfo());

        Anggota anggota2 = new Anggota("8080", "Jini");
        System.out.println(anggota2.getInfo());
    }
}
