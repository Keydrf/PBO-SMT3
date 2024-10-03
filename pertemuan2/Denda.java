package pertemuan2;

public class Denda {
    public int noDenda;
    public int noPeminjaman;
    public int jumlahDenda;
    public String statusPembayaran;

    public void LihatDenda(){
        System.out.println("No Denda            : " + noDenda);
        System.out.println("No Peminjaman       : " + noPeminjaman);
        System.out.println("Jumlah Denda        : " + jumlahDenda);
        System.out.println("Status Pembayaran   : " + statusPembayaran);
    }

    public int BayarDenda(int denda, int bayar){
        if(denda == bayar){
            denda = 0;
            statusPembayaran = "Lunas";
        } else if(bayar > 0 && bayar < denda){
            denda -= bayar;
            statusPembayaran = "Belum Lunas";
        }
        return denda;
    }
}
