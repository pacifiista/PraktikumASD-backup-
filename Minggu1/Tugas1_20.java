package Minggu1;

import java.util.Scanner;
public class Tugas1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi Array kode plat nomor kendaraan (1 dimensi)
        char[] kodePlat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Deklarasi Array nama kota (2 dimensi)
        char[][] namaKota = {
            {'B', 'A', 'N', 'T', 'E', 'N'}, // kode plat A
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'}, // kode plat B
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'}, // kode plat D
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'}, // kode plat E
            {'B', 'O', 'G', 'O', 'R'}, // kode plat  F
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'}, // kode plat G
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'}, // kode plat H
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'}, // kode plat L
            {'M', 'A', 'L', 'A', 'N', 'G'}, // kode plat N
            {'T', 'E', 'G', 'A', 'L'} // kode plat T

        };

        // input kode plat nomor kendaraan
        System.out.print("Masukkan kode plat nomor kendaraan (A, B, D, E, F, G, H, L, N, T): ");
        char inputKodePlat = sc .next().charAt(0);

        // Mencari indeks kode plat yang sesuai
        boolean ditemukan = false; // Flag untuk menandai apakah kode plat ditemukan
        for (int i = 0; i < kodePlat.length; i++) {
            if (inputKodePlat == kodePlat[i]) {
                System.out.print("Kota: ");
                for (int j = 0; j < namaKota[i].length; j++) {
                    System.out.print(namaKota[i][j]);
                }
                System.out.println();
                ditemukan = true; // Set flag menjadi true jika kode plat ditemukan
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
        sc.close();
    }
}
