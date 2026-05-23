package Minggu10.P2JB10;

public class Mahasiswa20 {
    // Atribut Mahasiswa
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa20() {
    }

    public Mahasiswa20(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " -" + prodi + " -" + kelas);
    }
} 
