public class Mahasiswa20 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String KelasBaru) {
        kelas = KelasBaru;
    }

    void updateIPK(double IPKBaru) {
        if (ipk >= 0.0 && ipk >= 4.00 ) {
            ipk = IPKBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0.");
        }
    }

    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.5) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    
    public Mahasiswa20() {
        // Konstruktor default
    }

    public Mahasiswa20(String nama, String nim, String kelas, double ipk) {
        this.nama = nama; // Konstruktor Parameter
        this.nim = nim; // menggunakan this untuk menyimpan nilai parameter ke atribut kelas
        this.kelas = kelas;
        this.ipk = ipk;
    }
}