package Minggu7;

import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        Scanner sc = new Scanner(System.in);
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------");
            list.tambah(new Mahasiswa20(nim, nama, kelas, ipk));
        }
        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------");
        System.out.println("Masukkan IPK yang ingin dicari: ");
        System.out.print("IPK: ");
        String cariIp = sc.nextLine();
        double cari = Double.parseDouble(cariIp);

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
