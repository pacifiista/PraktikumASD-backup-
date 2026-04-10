public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dosen1 = new Dosen20();
        dosen1.idDosen = "D001";
        dosen1.namaDosen = "Vivi Nur Wijayaningrum, S.Kom., M.Kom.";
        dosen1.bidangKeahlian = "Pemrograman";
        dosen1.tahunBergabung = 2010;
        dosen1.statusAktif = true;

        dosen1.tampilkanInfo();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2024);
        dosen1.ubahBidangKeahlian("Sistem Informasi");
        dosen1.tampilkanInfo();

        Dosen20 dosen2 = new Dosen20("D002", "Candra Bella Vista, S.Kom., M.T.", "Basis Data", 2015, true);
        dosen2.tampilkanInfo();
    }
}
