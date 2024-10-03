package jobsheet06.testpackage;

public class Pegawai {
    public String nip;
    public String nama;
    protected double gaji;

    public Pegawai(String nip, String nama, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo(){
        String info = "";
        info += "NIP      : " + nip + "\n";
        info += "Nama     : " + nama + "\n";
        info += "Gaji     : " + gaji + "\n";

        return info;
    }
}
