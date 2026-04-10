package Minggu1;

public class Percobaan4_20 {
    
    // Deklarasi data sebagai static agar bisa diakses langsung oleh fungsi
    // Baris = Cabang (RoyalGarden 1-4), Kolom = Bunga (Aglonema, Keladi, Alocasia, Mawar) 
    static int[][] stockBunga = {
        {10, 5, 15, 7},   // RoyalGarden 1 
        {6, 11, 9, 12},   // RoyalGarden 2 
        {2, 10, 10, 5},   // RoyalGarden 3 
        {5, 7, 12, 9}     // RoyalGarden 4 
    };

    // Harga Bunga sesuai rincian harga di Jobsheet 
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar 

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Pendapatan Setiap Cabang RoyalGarden");
        System.out.println("================================");
        tampilkanPendapatanCabang();
    }

    // Fungsi untuk menghitung dan menampilkan pendapatan setiap cabang 
    public static void tampilkanPendapatanCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatanCabang = 0;

            // perulangan untuk menghitung total pendapatan satu cabang
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatanCabang += stockBunga[i][j] * hargaBunga[j];
            }

            // Memanggil fungsi tentukanStatus (Nama harus sama dengan yang di bawah)
            String status = tentukanStatus(pendapatanCabang);

            System.out.printf("RoyalGarden %d : Rp%,d [%s]\n", (i + 1), pendapatanCabang, status);
        }
    }

    // Fungsi untuk menentukan status berdasarkan pendapatan 
    public static String tentukanStatus(int pendapatan) {
        // Aturan a: Jika pendapatan > Rp1.500.000, status "Sangat Baik" 
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            // Aturan b: Jika pendapatan <= Rp1.500.000, status "Perlu Evaluasi" 
            return "Perlu Evaluasi";
        }
    }
}