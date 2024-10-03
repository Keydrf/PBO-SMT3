package jobsheet06.tugas;
import jobsheet06.tugas.Ruangan;

public class Auditorium extends Ruangan {
    private String fasilitas;

    public Auditorium(String noRuangan, String namaRuangan, int kapasitas, String fasilitas){
        super(noRuangan, namaRuangan, kapasitas);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas(){
        return fasilitas;
    }

    public void setFasilitas(String fasilitas){
        this.fasilitas = fasilitas;
    }
    
    public String displayAll(){
        String info = super.display();
        info += "Fasilitas      : " + fasilitas + "\n";
        return info;
    }
}
