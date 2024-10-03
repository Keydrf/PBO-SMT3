package jobsheet06.tugas;

public class Ruangan {
    protected String noRuangan;
    protected String namaRuangan;
    protected int kapasitas;

    public Ruangan(String noRuangan, String namaRuangan, int kapasitas){
        this.noRuangan = noRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
    }

    public Ruangan(){
        this.noRuangan = "null";
        this.namaRuangan = "null";
        this.kapasitas = 0;
    }

    public String display(){
        String info = "";
        info += "No Ruangan     : " + noRuangan + "\n";
        info += "Nama Ruangan   : " + namaRuangan + "\n";
        info += "Kapasitas      : " + kapasitas + "\n";

        return info;
    }
}
