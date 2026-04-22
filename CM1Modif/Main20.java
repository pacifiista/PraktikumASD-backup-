package CM1Modif;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data Mahasiswa
        Mahasiswa20[] mhs = {
            new Mahasiswa20("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa20("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa20("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Data Buku
        Buku20[] buku = {
            new Buku20("B001", "Algoritma", 2020),
            new Buku20("B002", "Basis Data", 2019), 
            new Buku20("B003", "Pemrograman", 2021),
            new Buku20("B004", "Fisika", 2024)
        };

        //Data Peminjaman
        Peminjaman20[] peminjaman = {
            new Peminjaman20(mhs[0], buku[0], 7),   // Andi - Algoritma
            new Peminjaman20(mhs[1], buku[1], 3),   // Budi - Basis Data
            new Peminjaman20(mhs[2], buku[2], 10),  // Citra - Pemrograman
            new Peminjaman20(mhs[2], buku[3], 6),   // Citra - Fisika
            new Peminjaman20(mhs[0], buku[1], 4)    // Andi - Basis Data
        }; 

        // membuat menu
        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan Nama Mahasiswa"); // modif B3
            System.out.println("6. Rata-rata Lama Pinjam per Mahasiswa"); // modif C3
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa20 m : mhs) {
                        m.tampilData(); // menampilkan data mahasiswa
                    }
                    break;
                
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku20 b : buku) {
                        b.tampilData(); // menampilkan data buku
                    }
                    break;
                
                case 3: 
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman20 p : peminjaman) {
                        p.hitungDenda(); // menghitung denda untuk setiap peminjaman
                        p.tampilPeminjaman(); // menampilkan data peminjaman
                    }
                    break;
                
                case 4:
                    // Bubble sort 
                    for (Peminjaman20 p : peminjaman) {
                        p.hitungDenda(); // menghitung denda untuk setiap peminjaman sebelum diurutkan
                    }
                    for (int i = 0; i < peminjaman.length - 1; i++) {
                        for (int j = 0; j < peminjaman.length - 1 - i; j++) {
                            if (peminjaman[j].denda < peminjaman[j + 1].denda) {
                                // swap
                                Peminjaman20 temp = peminjaman[j];
                                peminjaman[j] = peminjaman[j + 1];
                                peminjaman[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman20 p : peminjaman) {
                        p.tampilPeminjaman(); // menampilkan data peminjaman setelah diurutkan
                    }
                    break;
                
                case 5:
                    //sequential search
                    // Modif B3
                    // mencari data peminjaman berdasarkan Nama Mahasiswa
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    sc.nextLine(); // membersihkan buffer
                    String cariNama = sc.nextLine();
                    
                    boolean ketemu = false;
                    for (Peminjaman20 p : peminjaman) {
                        if (p.mhs.nama.equalsIgnoreCase(cariNama)) {
                            p.hitungDenda(); // menghitung denda untuk peminjaman yang ditemukan
                            p.tampilPeminjaman(); // menampilkan data peminjaman yang ditemukan
                            ketemu = true;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Data peminjaman tidak ditemukan.");
                    }
                    break;

                case 6:
                    // Modif C3
                    //Menghitung rata rata lama pinjam untuk setiap mahasiswa
                    System.out.println("\nRata-rata Lama Pinjam untuk Setiap Mahasiswa:");
                    for (Mahasiswa20 m : mhs) { // iterasi untuk setiap mahasiswa
                        int totalLamaPinjam = 0;
                        int jmlLama = 0;
                        for (Peminjaman20 p : peminjaman) { // iterasi untuk setiap peminjaman
                            if (p.mhs.nim.equals(m.nim)) { 
                                totalLamaPinjam += p.lamaPinjam;
                                jmlLama++;
                            }
                        }
                        double rataRata = 0;
                        if (jmlLama > 0) {
                            rataRata = (double) totalLamaPinjam / jmlLama; // menghitung rata-rata lama pinjam
                        }
                        System.out.println(m.nama + ": " + rataRata + " hari");
                    }
            }
        } while (pilih != 0);
    }
}
