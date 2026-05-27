package Minggu11.TugasJB11;

public class Mahasiswa20 {
     String nim;
    String nama;
    String jurusan;

    Mahasiswa20(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    void tampilData() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
    }
}
