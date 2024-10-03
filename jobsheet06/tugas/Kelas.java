package jobsheet06.tugas;
import jobsheet06.tugas.Ruangan;

public class Kelas extends Ruangan {
    private String jenisKelas;

    public Kelas(String noRuangan, String namaRuangan, int kapasitas, String jenisKelas){
        super(noRuangan, namaRuangan, kapasitas);
        this.jenisKelas = jenisKelas;
    }

    public Kelas(){
        super();
        this.jenisKelas = "null";
    }

    public void setJenisKelas(String jenisKelas){
        this.jenisKelas = jenisKelas;
    }

    public String getJenisKelas(){
        return jenisKelas;
    }

    public String displayAll(){
        String info = super.display();
        info += "Jenis Kelas    : " + jenisKelas + "\n";
        return info;
    }
}
