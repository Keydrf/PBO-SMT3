package pertemuan2;

public class PersegiPanjang {
    public int panjang, lebar;

    public void displayInfo(){
        System.out.println("Panjang : "+ panjang);
        System.out.println("Lebar   : "+ lebar);
    }

    public int getLuas(int panjang, int lebar){
        return panjang * lebar;
    }

    public int getKeliling(int panjang, int luas){
        return 2 * (panjang + lebar);
    }
}
