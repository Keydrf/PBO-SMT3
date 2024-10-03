package jobsheet04.Perpustakaan;

public class Buku {
    private String noBuku;
    private String judulBuku;

    public Buku(String noBuku, String judulBuku){
        this.noBuku = noBuku;
        this.judulBuku = judulBuku;
    }

    public String getNoBuku(){
        return noBuku;
    }

    public void setNoBuku(String noBuku){
        this.noBuku = noBuku;
    }

    public String getJudulBuku(){
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }

    public String getInfo(){
        return judulBuku + " (" + noBuku + ")";
    }
}
