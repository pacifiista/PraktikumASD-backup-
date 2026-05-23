package P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademik20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan20 antrian = new AntrianLayanan20(5); // Kapasitas antrian 5
        int pilihan;

        do {
            System.out.println("\n=== Menu Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian: ");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    // Tambah Antrian
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.next();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.next();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.next();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.next();
                    Mahasiswa20 mhs = new Mahasiswa20(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa20 mhsDilayani = antrian.layananMahasiswa();
                    if (mhsDilayani != null) {
                        System.out.println("Mahasiswa yang dilayani:");
                        mhsDilayani.tampilkanData();
                    }
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                // modifikasi
                    antrian.LihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan akademik.");
                    sc.close();
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
