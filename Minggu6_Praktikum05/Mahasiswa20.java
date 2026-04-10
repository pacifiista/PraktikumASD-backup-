package Minggu6_Praktikum05;

public class Mahasiswa20 {
    String nim, nama, kelas;
    double ipk;
    
    // konstruktor default
    Mahasiswa20() {
    }

    // konstruktor dengan parameter
    Mahasiswa20(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    // method untuk menampilkan data mahasiswa
    void tampilData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
