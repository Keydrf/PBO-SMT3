package jobsheet03;

public class Anggota {
    private String noAnggota;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noAnggota, String nama, int limitPinjaman){
        this.noAnggota = noAnggota;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public void pinjam(int pinjam){
        if(pinjam > limitPinjaman){
            System.out.println("Maaf, jumlah pinjam melebihi limit");
        } else{
            this.jumlahPinjaman = pinjam;
        }
    }

    public int getJumlahPinjaman (){
        return jumlahPinjaman;
    }

    public void angsur(int angsur){
        if(angsur < (jumlahPinjaman * 0.1)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else{
            jumlahPinjaman -= angsur;
        }
        
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public void setLimitPinjaman(int limitPinjaman){
        this.limitPinjaman = limitPinjaman;
    }

}
