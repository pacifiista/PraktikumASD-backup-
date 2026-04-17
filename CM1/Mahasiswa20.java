package CM1;

public class Mahasiswa20 {
    String nim;
    String nama;
    String prodi;

    // constructor default
    Mahasiswa20() {
    }
    // constructor dengan parameter
    Mahasiswa20(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // method untuk menampilkan data mahasiswa
    void tampilData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
