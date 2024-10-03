package pertemuan1;
import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
        double angka1, angka2;
        char operator;
        
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        angka1 = input1.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input1.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input2.next().charAt(0);

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = (tambah(angka1, angka2));
                break;
            
            case '-':
                hasil = (kurang(angka1, angka2));
                break;
            
            case '*':
                hasil = (kali(angka1, angka2));
                break;

            case '/':
                hasil = (bagi(angka1, angka2));
                break;
        }
        System.out.println("Hasil: " +angka1 +" "+operator+ " " + angka2 + " = "+hasil);
    }

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        return a / b;
    }
}
