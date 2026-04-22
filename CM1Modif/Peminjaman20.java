package CM1Modif;

public class Peminjaman20 {
    // atribut
    Mahasiswa20 mhs;
    Buku20 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    // constructor default
    Peminjaman20() {
    }

    // constructor dengan parameter
    Peminjaman20(Mahasiswa20 mhs, Buku20 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    // method untuk menghitung denda
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam; // hitung jumlah hari terlambat
            denda = terlambat * 2000; // hitung total denda
        } else {
            terlambat = 0;
            denda = 0;
            
        }
    }

    // method untuk menampilkan data peminjaman
    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judulBuku +
                " | Lama: " + lamaPinjam +
                " | Terlambat: " + terlambat +
                " | Denda: " + denda +
                // modif A3
                " | Kategori: " + kategoriPinjam()); // menampilkan kategori peminjaman
    }

    //modif A3
    // menambahkan kategori lama peminjaman
    String kategoriPinjam(){
        if (lamaPinjam <= 3) {
            return "Cepat"; // jika lama pinjam 3 hari atau kurang, kategori "Cepat"
        } else if (lamaPinjam == 4 || lamaPinjam == 5) {
            return "Normal"; //jika Lama pinjam 4 atau 5 hari, Kategori Normal
        } else {
            return "Lama"; // jika lama pinjam lebih dari 5 hari, kategori "Lama"

        }
    }
}
