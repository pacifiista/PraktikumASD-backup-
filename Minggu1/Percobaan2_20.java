package Minggu1;

import java.util.Scanner;

public class Percobaan2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input NIM
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();

        //Mengambil 2 digit terakhir NIM
        int n = (int)(nim % 100);

        // aturan: jika n < 10 maka n += 10
        if (n < 10) {
            n += 10;
        }
        System.out.println("Nilai n adalah: " + n);
        System.out.println("Output: ");

        // perulangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {
        // aturan d: Bilangan 10 dan 15 tidak dicetak
            if (i == 10 || i == 15) {
                continue; // skip ke angka berikutnya
            }

            // aturan a: jika i habis dibagi 3, cetak "#"
            if (i % 3 == 0) {
                System.out.print("#");
            }
            // aturan b: Bilangan genap selain kelipatan 3 dicetak sesuai angkanya
            else if (i % 2 == 0) {
                System.out.print("" + i);
            }
            // aturan c: Bilangan ganjil dicetak dengan simbol "*"
            else {
                System.out.print("*");
            }
        }
        sc.close();
    }
}
