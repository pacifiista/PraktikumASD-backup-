package Minggu2;

public class Dosen20 {
    String idDosen, namaDosen, bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif;

    void tampilkanInfo(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (status) {
            System.out.println(namaDosen + " sekarang aktif.");
        } else {
            System.out.println(namaDosen + " sekarang tidak aktif.");
        }
    }

    void hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa kerja " + namaDosen + " adalah: " + masaKerja + " tahun.");
    }

    void ubahBidangKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian " + namaDosen + " telah diubah menjadi: " + bidangKeahlian);
    }

     public Dosen20() {
        // Konstruktor default
    }

    public Dosen20(String idDosen, String namaDosen, String bidangKeahlian, int tahunBergabung, boolean statusAktif) {
        this.idDosen = idDosen; // Konstruktor Parameter
        this.namaDosen = namaDosen; // menggunakan this untuk menyimpan nilai parameter ke atribut kelas
        this.bidangKeahlian = bidangKeahlian;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;
    }
}
 {
    
}
