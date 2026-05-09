package ModifUTS;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        // Data Mahasiswa
        Mahasiswa20[] mhs = new Mahasiswa20[jumMhs];
        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Masukkan NIM Mahasiswa ke-" + (i + 1) + ": ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Jurusan Mahasiswa ke-" + (i + 1) + ": ");
            String jurusan = sc.nextLine();
            mhs[i] = new Mahasiswa20(nim, nama, jurusan);
        }

        // Data Buku
        System.out.print("Masukkan Jumlah buku: ");
        int jmlBuku = sc.nextInt();
        sc.nextLine(); // membersihkan buffer
        Buku20[] buku = new Buku20[jmlBuku];
        for (int i = 0; i < jmlBuku; i++) {
            System.out.print("Masukkan Kode Buku ke-" + (i + 1) + ": ");
            String kode = sc.nextLine();
            System.out.print("Masukkan Judul Buku ke-" + (i + 1) + ": ");
            String judul = sc.nextLine();
            System.out.print("Masukkan Tahun Terbit Buku ke-" + (i + 1) + ": ");
            int tahun = sc.nextInt();
            sc.nextLine(); // membersihkan buffer
            buku[i] = new Buku20(kode, judul, tahun);
        }
        

        //Data Peminjaman
        System.out.print("Masukkan jumlah peminjaman: ");
        int jmlPinjam = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        Peminjaman20[] peminjaman = new Peminjaman20[jmlPinjam];
        for (int i = 0; i < jmlPinjam; i++) {
            System.out.print("Masukkan NIM Mahasiswa ke-" + (i + 1) + ": ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Kode Buku ke-" + (i + 1) + ": ");
            String kode = sc.nextLine();
            System.out.print("Masukkan Lama Pinjam (hari) ke-" + (i + 1) + ": ");
            int lamaPinjam = sc.nextInt();
            sc.nextLine(); // membersihkan buffer
            Mahasiswa20 mhsPinjam = null;
            Buku20 bukuPinjam = null;
            for (Mahasiswa20 m : mhs) {
                if (m.nim.equals(nim)) {
                    mhsPinjam = m;
                    break;
                }
            }
            for (Buku20 b : buku) {
                if (b.kodeBuku.equals(kode)) {
                    bukuPinjam = b;
                    break;
                }
            }
            peminjaman[i] = new Peminjaman20(mhsPinjam, bukuPinjam, lamaPinjam);
        }

        // membuat menu
        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Total Denda");
            System.out.println("7. Total Denda Per Mahasiswa");
            System.out.println("8. Cari Buku Berdasarkan Judul");
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
                            // if (peminjaman[j].denda < peminjaman[j + 1].denda) { // klo ubah ke ascending tinggal ganti tanda "<" jadi ">"
                            // sorting berdasarkan nama mahasiswa secara ascending
                            // if (peminjaman[j].mhs.nama.compareTo(peminjaman[j + 1].mhs.nama) > 0) { // modif e warda buat sorting berdasarkan nama mahasiswa secara ascending
                            if (peminjaman[j].denda > peminjaman[j+1].denda ||
                                (peminjaman[j].denda == peminjaman[j+1].denda &&
                                peminjaman[j].mhs.nama.compareTo(peminjaman[j+1].mhs.nama) > 0)) { // modif e warda buat sorting berdasarkan denda secara descending, kalo denda sama baru diurutkan berdasarkan nama mahasiswa secara ascending
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
                    System.out.print("Masukkan NIM: ");
                    sc.nextLine(); // membersihkan buffer
                    String cariNim = sc.nextLine();
                    boolean ketemu = false;
                    for (Peminjaman20 p : peminjaman) {
                        if (p.mhs.nim.equals(cariNim)) { //klo cari prodi ya tinggal nim diganti prodi, klo cari nama ya tinggal nim diganti nama   
                            p.hitungDenda(); // menghitung denda untuk peminjaman yang ditemukan
                            p.tampilPeminjaman(); // menampilkan data peminjaman yang ditemukan
                            ketemu = true;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Data peminjaman tidak ditemukan.");
                    }
                    break;
                
                    // modif e warda
                case 6:
                    // total semua denda
                    int totalDenda = 0;
                    for (Peminjaman20 p : peminjaman) {
                        p.hitungDenda();
                        totalDenda = p.totalDenda(totalDenda); // menambahkan denda setiap peminjaman ke total denda
                    }
                    // rata rata denda
                    double rataDenda = (double) totalDenda / peminjaman.length;
                    System.out.println("Rata-rata Denda: " + rataDenda);
                    System.out.println("Total Denda: " + totalDenda);
                    break;
                
                case 7:
                    // total denda per mahasiswa
                    for (Mahasiswa20 m : mhs) {
                        int totalMhsDenda = 0;
                        for (Peminjaman20 p : peminjaman) {
                            if (p.mhs.nim.equals(m.nim)) {
                                totalMhsDenda = p.totalDenda(totalMhsDenda); // menambahkan denda setiap peminjaman mahasiswa ke total denda mahasiswa
                            }
                        }
                        System.out.println("Total Denda " + m.nama + ": " + totalMhsDenda);
                    }
                    break;

                case 8:
                //  modifikasi cari buku
                System.out.print("Masukkan judul buku: ");
                String cariJudul = sc.nextLine();
                boolean ditemukan = false;
                for (Buku20 b : buku) {
                    if (b.judulBuku.equalsIgnoreCase(cariJudul)) {
                        System.out.println("Buku ditemukan:");
                        System.out.println("Judul: " + b.judulBuku);
                        System.out.println("Tahun Terbit: " + b.tahunTerbit);
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Buku tidak ditemukan.");
                }
                break;
            }
        } while (pilih != 0);
    }
}
