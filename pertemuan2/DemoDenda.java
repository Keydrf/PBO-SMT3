package pertemuan2;

import pertemuan1.denda;

public class DemoDenda {
    public static void main(String[] args) {
        Denda denda1 = new Denda();
        Denda denda2 = new Denda();
        Denda denda3 = new Denda();

        denda1.noDenda = 2001;
        denda1.noPeminjaman = 439;
        denda1.jumlahDenda = 23000;
        denda1.statusPembayaran = "Belum Lunas";

        denda2.noDenda = 2002;
        denda2.noPeminjaman = 673;
        denda2.jumlahDenda = 3000;
        denda2.statusPembayaran = "Belum Lunas";

        denda3.noDenda = 2003;
        denda3.noPeminjaman = 88;
        denda3.jumlahDenda = 7000;
        denda3.statusPembayaran = "Belum Lunas";

        denda1.LihatDenda();
        System.out.println();
        denda2.LihatDenda();
        System.out.println();
        denda3.LihatDenda();

        System.out.println("Denda setelah di bayar");

        denda1.jumlahDenda = denda1.BayarDenda(denda1.jumlahDenda, 20000);
        denda2.jumlahDenda = denda2.BayarDenda(denda2.jumlahDenda, 3000);
        denda3.jumlahDenda = denda3.BayarDenda(denda3.jumlahDenda, 7000);

        denda1.LihatDenda();
        System.out.println();
        denda2.LihatDenda();
        System.out.println();
        denda3.LihatDenda();
    }
}
