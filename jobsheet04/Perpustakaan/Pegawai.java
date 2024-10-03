package jobsheet04.Perpustakaan;

public class Pegawai {
    private String noPegawai;
    private String nama;

    public Pegawai(String noPegawai, String nama){
        this.noPegawai = noPegawai;
        this.nama = nama;
    }

    public String getNoPegawai(){
        return getNoPegawai();
    }

    public void setNoPegawai(String noPegawai){
        this.noPegawai = noPegawai;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getInfo(){
        return nama + " (" + noPegawai + ")";
    }
}
