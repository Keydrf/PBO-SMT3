package jobsheet06.tugas;

public class Demo {
    public static void main(String[] args) {
        Kelas kelas1 = new Kelas("771", "LPR 1", 35, "Lab Praktikum");
        Kelas kelasDefault = new Kelas();

        Auditorium audit1 = new Auditorium("881", "Auditorium Sipil", 360, "Proyektor, AC");

        System.out.println("Informasi Kelas ke 1");
        System.out.println(kelas1.displayAll());

        System.out.println("Informasi Kelas default");
        System.out.println(kelasDefault.displayAll());

        System.out.println("Informasi Auditorium");
        System.out.println(audit1.displayAll());

        // melakukan modifikasi 
        kelasDefault.noRuangan = "772";
        kelasDefault.namaRuangan = "RT 1";
        kelasDefault.kapasitas = 60;
        kelasDefault.setJenisKelas("Ruangan Teori");

        // setelah modifikasi
        System.out.println("Setelah dilakukan mofidikasi");

        System.out.println("Informasi Kelas ke 1");
        System.out.println(kelas1.displayAll());

        System.out.println("Informasi Kelas default");
        System.out.println(kelasDefault.displayAll());

        System.out.println("Informasi Auditorium");
        System.out.println(audit1.displayAll());
    }
}
