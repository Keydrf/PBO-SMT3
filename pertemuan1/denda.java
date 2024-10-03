package pertemuan1;
public class denda{
    public static void main(String[] args) {       
        int noDenda, noDenda1, noDenda2, noDenda3, noDenda4, noDenda5, 
        noDenda6, noDenda7, noDenda8, noDenda9;
        String buku, buku1, buku2, buku3, buku4, buku5, buku6, buku7, 
        buku8, buku9;
        int jumlahDenda, jumlahDenda1, jumlahDenda2, jumlahDenda3, jumlahDenda4, 
        jumlahDenda5, jumlahDenda6, jumlahDenda7, jumlahDenda8, jumlahDenda9;

        noDenda = 1001;
        buku = "Bahan Ajar PBO";
        jumlahDenda = 6000; 

        noDenda1 = 1002;
        buku1 = "Si kancil";
        jumlahDenda1 = 2000;

        noDenda2 = 1003;
        buku2 = "Advance Data Base";
        jumlahDenda2 = 1000; 

        noDenda3 = 1004;
        buku3 = "Akutansi Keuangan";
        jumlahDenda3 = 7000; 

        noDenda4 = 1005;
        buku4 = "Anatomi";
        jumlahDenda4 = 9000; 

        noDenda5 = 1006;
        buku5 = "Tips pilih laptop";
        jumlahDenda5 = 4000; 

        noDenda6 = 1007;
        buku6 = "Siksa neraka";
        jumlahDenda6 = 8000; 

        noDenda7 = 1008;
        buku7 = "bad habbits";
        jumlahDenda7 = 10000; 

        noDenda8 = 1009;
        buku8 = "Konsentrasi Belajar";
        jumlahDenda8 = 5000; 

        noDenda9 = 1010;
        buku9 = "Science";
        jumlahDenda9 = 3000; 

        tampilkanData(noDenda, noDenda1, noDenda2, noDenda3, noDenda4, noDenda5,
        noDenda6, noDenda7, noDenda8, noDenda9, buku, buku1, buku2, buku3, buku4, 
        buku5, buku6, buku7, buku8, buku9, jumlahDenda, jumlahDenda1, jumlahDenda2, 
        jumlahDenda3, jumlahDenda4, jumlahDenda5, jumlahDenda6, jumlahDenda7, 
        jumlahDenda8, jumlahDenda9 );

        int totalDendareal = totaldenda(jumlahDenda, jumlahDenda1, jumlahDenda2, 
        jumlahDenda3, jumlahDenda4, jumlahDenda5, jumlahDenda6, jumlahDenda7, 
        jumlahDenda8, jumlahDenda9);
        System.out.println("Jumlah Keseluruhan Denda: " + totalDendareal);
    }

    public static void tampilkanData(int noDenda, int noDenda1, int noDenda2, 
    int noDenda3, int noDenda4, int noDenda5, int noDenda6, int noDenda7, 
    int noDenda8, int noDenda9, String buku, String buku1, String buku2, 
    String buku3, String buku4, String buku5, String buku6, String buku7, 
    String buku8, String buku9, int jumlahDenda, int jumlahDenda1, int jumlahDenda2, 
    int jumlahDenda3, int jumlahDenda4, int jumlahDenda5, int jumlahDenda6, 
    int jumlahDenda7, int jumlahDenda8, int jumlahDenda9){
        
        System.out.println("No Denda     : " + noDenda);
        System.out.println("Judul Buku   : "+buku);
        System.out.println("Jumlah Denda : "+jumlahDenda);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda1);
        System.out.println("Judul Buku   : "+buku1);
        System.out.println("Jumlah Denda : "+jumlahDenda1);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda2);
        System.out.println("Judul Buku   : "+buku2);
        System.out.println("Jumlah Denda : "+jumlahDenda2);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda3);
        System.out.println("Judul Buku   : "+buku3);
        System.out.println("Jumlah Denda : "+jumlahDenda3);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda4);
        System.out.println("Judul Buku   : "+buku4);
        System.out.println("Jumlah Denda : "+jumlahDenda4);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda5);
        System.out.println("Judul Buku   : "+buku5);
        System.out.println("Jumlah Denda : "+jumlahDenda5);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda6);
        System.out.println("Judul Buku   : "+buku6);
        System.out.println("Jumlah Denda : "+jumlahDenda6);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda7);
        System.out.println("Judul Buku   : "+buku7);
        System.out.println("Jumlah Denda : "+jumlahDenda7);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda8);
        System.out.println("Judul Buku   : "+buku8);
        System.out.println("Jumlah Denda : "+jumlahDenda8);
        System.out.println();
        System.out.println();

        System.out.println("No Denda     : " + noDenda9);
        System.out.println("Judul Buku   : "+buku9);
        System.out.println("Jumlah Denda : "+jumlahDenda9);
        System.out.println();
        System.out.println();
    }

    public static int totaldenda(int jumlahDenda, int jumlahDenda1, 
    int jumlahDenda2, int jumlahDenda3, int jumlahDenda4, int jumlahDenda5, 
    int jumlahDenda6, int jumlahDenda7, int jumlahDenda8, int jumlahDenda9){
        int totalDenda;
        totalDenda = jumlahDenda + jumlahDenda1 + jumlahDenda2 + jumlahDenda3
         + jumlahDenda4 + jumlahDenda5 + jumlahDenda6 + jumlahDenda7 + 
         jumlahDenda8 + jumlahDenda9 ;
        return totalDenda;
    }

}