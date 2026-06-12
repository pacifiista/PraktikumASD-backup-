package CM2;

import java.util.Scanner;
public class main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli20 antrian = new DLLPembeli20();
        DLLPesanan20 daftarPesanan = new DLLPesanan20();

        int pilih;

        do {
            System.out.println("\n=== ROYAL DELISH ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Layani Pembeli");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();

                    System.out.print("No HP: ");
                    String noHp = sc.nextLine();

                    Pembeli20 p = new Pembeli20(nama, noHp); // objek pembeli
                    antrian.tambahAntrian(p);
                    System.out.println("Pembeli berhasil masuk antrian!");
                    break;
                
                case 2:
                    System.out.println("\nDAFTAR ANTRIAN");
                    antrian.tampilAntrian();
                    break;
                
                case 3:
                    Pembeli20 dilayani = antrian.hapusAntrian(); // mengambil pemnbeli paling depan

                    if (dilayani == null) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Melayani: " + dilayani.namaPembeli);
                        System.out.print("Kode Pesanan: ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga: ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan20 ps = new Pesanan20(kodePesanan, namaPesanan, harga);
                        daftarPesanan.tambahPesanan(ps); // masukkan DLL pesanan
                        System.out.println("Pesanan Berhasil ditambahkan!");
                    }
                    break;
                
                case 4:
                    System.out.println("\nLAPORAN PESANAN");
                    daftarPesanan.tampilPesanan();
                    break;
                
                case 5:
                    System.out.println("Program selesai");
                    break;
                
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 5);
        // selama ga milih 5 program akan trs berjalan
    }
    
}
