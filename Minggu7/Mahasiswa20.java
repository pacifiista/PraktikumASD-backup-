package Minggu7;

class Mahasiswa20 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    // constructor
    Mahasiswa20(){

    }

    Mahasiswa20(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
        
    }

    // method tampil data
    void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}