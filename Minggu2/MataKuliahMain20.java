public class MataKuliahMain20 {
    public static void main(String[] args) {
        Matakuliah20 mk1 = new Matakuliah20();
        mk1.kodeMK = "SI123";
        mk1.namaMK = "Dasar Pemrograman Java";
        mk1.sks = 3;
        mk1.jmlJam = 48;

        mk1.tampilkanInfo();
        mk1.ubahSKS(4);
        mk1.tambahJam(16);
        mk1.tampilkanInfo();

        Matakuliah20 mk2 = new Matakuliah20("TI456", "Basis Data", 3, 48);
        mk2.kurangiJam(8);
        mk2.tampilkanInfo();

         Matakuliah20 mkAlgoritma = new Matakuliah20("SI789", "Algoritma dan Struktur Data", 4, 64);
         mkAlgoritma.tampilkanInfo();
    }
}
