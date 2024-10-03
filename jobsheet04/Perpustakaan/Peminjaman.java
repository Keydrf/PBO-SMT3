package jobsheet04.Perpustakaan;
import java.time.LocalDate;

public class Peminjaman {
    private LocalDate tanggal;
    private Buku judulBuku;
    private Pegawai petugas;

    public LocalDate getTanggal(){
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal){
        this.tanggal = tanggal;
    }

    public Buku getJudulBuku(){
        return judulBuku;
    }

    public void setJudulBuku(Buku judulBuku){
        this.judulBuku = judulBuku;
    }

    public Pegawai getPetugas(){
        return petugas;
    }

    public void setPetugas(Pegawai petugas){
        this.petugas = petugas;
    }

    public String getInfo(){
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Judul Buku: " + judulBuku.getInfo();
        info += ", Petugas: " + petugas.getInfo();
        info += "\n";

        return info;
    }
}
