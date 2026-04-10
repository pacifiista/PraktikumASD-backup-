package Minggu1;

import java.util.Scanner;

public class Tugas2_20 {

    // Gunakan satu Scanner untuk semua fungsi agar hemat memori
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        // inisialisasi Array 2 dimensi
        String[][] jadwal = new String[n][4];

        int pilihanMMenu;
        do {
            System.out.println("\n=== MENU PENGELOLAAN JADWAL KULIAH ===");
            System.out.println("1. Input Jadwal Kuliah");
            System.out.println("2. Tampilkan seluruh Jadwal Kuliah");
            System.out.println("3. Cari jadwal kuliah berdasarkan hari");
            System.out.println("4. Cari jadwal kuliah berdasarkan mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda (1-5): ");
            pilihanMMenu = sc.nextInt();
            sc.nextLine(); // membersihkan buffer

            switch (pilihanMMenu) {
                case 1:
                    inputJadwalKuliah(jadwal);
                    break;
                case 2:
                    tampilkanJadwalKuliah(jadwal);
                    break;
                case 3:
                    cariJadwalBerdasarkanHari(jadwal);
                    break;
                case 4:
                    cariJadwalBerdasarkanMataKuliah(jadwal);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihanMMenu != 5);
    }

    public static void inputJadwalKuliah(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanJadwalKuliah(String[][] jadwal) {
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.printf("| %-25s | %-10s | %-10s | %-15s |\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-----------------------------------------------------------------------");
        for (String[] baris : jadwal) {
            System.out.printf("| %-25s | %-10s | %-10s | %-15s |\n", baris[0], baris[1], baris[2], baris[3]);
        }
        System.out.println("-----------------------------------------------------------------------");
    } // TUTUP KURUNG INI YANG TADI HILANG

    public static void cariJadwalBerdasarkanHari(String[][] jadwal) {
        System.out.print("Masukkan hari yang dicari: ");
        String hariDicari = sc.nextLine();
        boolean ditemukan = false;

        System.out.println("\nHasil Pencarian untuk hari: " + hariDicari);
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariDicari)) {
                System.out.printf("| %-25s | %-10s | %-10s | %-15s |\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ditemukan jadwal pada hari: " + hariDicari);
        }
    }

    public static void cariJadwalBerdasarkanMataKuliah(String[][] jadwal) {
        System.out.print("Masukkan nama mata kuliah yang dicari: ");
        String mataKuliahDicari = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mataKuliahDicari)) {
                System.out.printf("| %-25s | %-10s | %-10s | %-15s |\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + mataKuliahDicari + " tidak ditemukan.");
        }
    }
}