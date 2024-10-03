package pertemuan2;
import java.util.Scanner;

public class DemoPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PersegiPanjang pp1 = new PersegiPanjang();

        System.out.print("Masukkan panjang  : ");
        pp1.panjang = input.nextInt();
        System.out.print("Masukkan lebar    : ");
        pp1.lebar = input.nextInt();

        pp1.displayInfo();
        System.out.println("Luas Persegi Panjang    : "+ pp1.getLuas(pp1.panjang, pp1.lebar));
        System.out.println("Keliling Persegi Panjang: " + pp1.getKeliling(pp1.panjang, pp1.lebar));
        
    }
}
