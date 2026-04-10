package Minggu6_Praktikum05;

import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine(); // membersihkan buffer
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // membersihkan buffer
            Mahasiswa20 mhs = new Mahasiswa20(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        
        System.out.println("Data Mahasiswa Berprestasi sebelum diurutkan:");
        list.tampil();
        System.out.println("Data Mahasiswa Berprestasi setelah diurutkan berdasarkan Insertion Sort IPK:");
        list.insertionSort();
        list.tampil();
        // System.out.println("Data Mahasiswa Berprestasi setelah diurutkan berdasarkan bubble sort IPK:");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data Mahasiswa Berprestasi setelah diurutkan berdasarkan Selection Sort IPK:");
        // list.selectionSort();
        // list.tampil();

        // MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        // Mahasiswa20 m1 = new Mahasiswa20("123", "zidan", "2A", 3.2);
        // Mahasiswa20 m2 = new Mahasiswa20("124", "Ayu", "2A", 3.5);
        // Mahasiswa20 m3 = new Mahasiswa20("125", "Sofi", "2A", 3.1);
        // Mahasiswa20 m4 = new Mahasiswa20("126", "Sita", "2A", 3.9);
        // Mahasiswa20 m5 = new Mahasiswa20("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);   
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
    }
}
