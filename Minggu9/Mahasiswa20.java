package Minggu9;

public class Mahasiswa20 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa20() {
    }


    public Mahasiswa20(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    // method tugasDinilai
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    } 

    
}
