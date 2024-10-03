package jobsheet04.Perpustakaan;
import java.util.ArrayList;

import jobsheet04.RumahSakit.Konsultasi;

import java.time.LocalDate;

public class Anggota {
    private String noPeminjaman;
    private String nama;
    private ArrayList<Peminjaman> riwayatPeminjaman;

    public Anggota(String noPeminjaman, String nama){
        this.noPeminjaman = noPeminjaman;
        this.nama = nama;
        this.riwayatPeminjaman = new ArrayList<Peminjaman>();
    }

    public String getNoPeminjaman(){
        return noPeminjaman;
    }

    public void setNoPeminjaman(String noPeminjaman){
        this.noPeminjaman = noPeminjaman;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getInfo(){
        String info = "";
        info += "No Peminjaman  : " + this.noPeminjaman + "\n";
        info += "Nama           : " + this.nama + "\n";

        if(!riwayatPeminjaman.isEmpty()){
            info += "Riwayat Peminjaman :\n";

            for(Peminjaman peminjaman : riwayatPeminjaman){
                info += peminjaman.getInfo();
            }
        } else{
            info += "Belum ada riwayat peminjaman";
        }
        info += "\n";

        return info;
    }

    public void tambahPeminjaman(LocalDate tanggal, Buku judulBuku, Pegawai petugas){
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setTanggal(tanggal);
        peminjaman.setJudulBuku(judulBuku);
        peminjaman.setPetugas(petugas);
        riwayatPeminjaman.add(peminjaman);
    }
}

