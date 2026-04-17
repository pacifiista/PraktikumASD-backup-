package CM1;

public class Buku20 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;

    // constructor default
    Buku20() {
    }

    // constructor dengan parameter
    Buku20(String kodeBuku, String judulBuku, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
    }

    // method untuk menampilkan data buku
    void tampilData() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judulBuku + " | Tahun: " + tahunTerbit);
    }
}
