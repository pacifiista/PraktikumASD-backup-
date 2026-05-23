package Minggu10.TugasJobsheet10;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS20 antrian = new AntrianKRS20();
        int pilihan;

        do {
            System.out.println("\n=================================================");
            System.out.println("     SISTEM ANTRIAN PERSETUJUAN KRS - DPA        ");
            System.out.println("=================================================");
            System.out.println("1. Tambah Mahasiswa ke Antrian (Enqueue)");
            System.out.println("2. Panggil & Proses KRS (Dequeue 2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian Aktif");
            System.out.println("7. Cetak Statistik Pelayanan KRS (Sudah/Belum)");
            System.out.println("8. Kosongkan Semua Antrian (Clear)");
            System.out.println("9. Keluar Program");
            System.out.println("=================================================");
            System.out.print("Masukkan pilihan Anda (1-9): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan token sisa enter

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Masukkan Data Mahasiswa Baru ---");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    MahasiswaKRS20 mhs = new MahasiswaKRS20(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilProsesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.panggilProsesKRS();
                    break;
                case 5:
                    antrian.tampilkanPalingAkhir();
                    break;
                case 6:
                    antrian.cetakJumlahAntrian();
                    break;
                case 7:
                    antrian.cetakStatistikKRS();
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu 1-9.");
            }
        } while (pilihan != 9);

        sc.close();
    }
}