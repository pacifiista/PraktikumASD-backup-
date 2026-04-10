package Minggu1;

import java.util.Scanner;
public class Percobaan1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;

        // input nilai
        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextInt();  
        System.out.print("Masukkan nilai Kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();
        System.out.println("------------------------------------------");

        // validasi input nilai
        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
        } else {
            // hitung nilai akhir
            nilaiAkhir = (int)(0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.4 * nilaiUAS);

            // output nilai akhir
            String nilaiHuruf;
            if (nilaiAkhir> 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            System.out.println("Nilai Akhir Mahasiswa: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);

            System.out.println("------------------------------------------");

            // output keterangan lulus atau tidak
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C")) {
                System.out.println("Keterangan: Lulus");
            } else {
                System.out.println("Keterangan: Tidak Lulus");
            }
        }
        




        
    }
}
