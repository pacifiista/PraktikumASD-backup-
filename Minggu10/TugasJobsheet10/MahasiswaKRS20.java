package Minggu10.TugasJobsheet10;

public class MahasiswaKRS20 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public MahasiswaKRS20() {
    }

    public MahasiswaKRS20(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " \t " + nama + " \t " + prodi + " \t " + kelas);
    }
}
