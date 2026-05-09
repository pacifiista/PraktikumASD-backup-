package ModifUTS;

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
            System.out.println("terlambat " + terlambat + " hari, denda: Rp " + denda);
        } else {
            terlambat = 0;
            denda = 0;
            System.out.println("tidak terlambat");
        }
        
        
    }

    // method untuk menampilkan data peminjaman
    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judulBuku +
                " | Lama: " + lamaPinjam +
                " | Terlambat: " + terlambat +
                " | Denda: " + denda
                + " | Status: " + status()); // tambahin ini jg buat status
    }

    //modif e warda
    // Method untukk menambahkan total denda
    int totalDenda(int totalDenda) {
        return totalDenda + denda; // menambahkan denda setiap peminjaman ke total denda
    } 

    // Status peminjaman
    String status() {
        if (lamaPinjam > batasPinjam) {
            return "Terlambat";
        } else {
            return "Tepat Waktu";
        }
    }
    
}
