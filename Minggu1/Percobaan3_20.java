package Minggu1;

import java.util.Scanner;

public class Percobaan3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // deklarasi mata kuliah dengan array
        String[] mataKuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        // Array untuk menyimpan nilai
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        int [] sks = {2, 3, 3, 3, 2, 4, 1, 2}; // Asumsi bobot SKS agar sesuai dengan mata kuliah

        System.out.println("================================");
        System.out.println(" Program Menghitung IP Semester ");
        System.out.println("================================");

        // Input nilai untuk setiap mata kuliah
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk mata kuliah " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            // Menentukan nilai huruf dan bobot nilai berdasarkan nilai angka
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A"; bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B"; bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+"; bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C"; bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D"; bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E"; bobotNilai[i] = 0.00;
            }
        }

        // output hasil konversi nilai dan perhitungan IP
        System.out.println("===============================================");  
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        // deklarasi variabel untuk perhitungan IP
        double totalBobotNilai = 0;
        int totalSks = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            
            // perhitungan IP: (Nilai Setara * SKS) / Total SKS
            totalBobotNilai += bobotNilai[i] * sks[i];
            totalSks += sks[i];
        }

        // hitung IP
        double ipSemester = totalBobotNilai / totalSks;
        System.out.println("===============================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        sc.close();
    }   
}
