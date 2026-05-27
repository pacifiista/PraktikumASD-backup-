package Minggu11.TugasJB11;
  import java.util.Scanner;

public class MainQueueSLL20 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QueueLinkedList antrian = new QueueLinkedList(10);

        int pilih;

        do {
            System.out.println("\n=== SISTEM ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian sudah penuh!");
                    } else {
                        System.out.print("Masukkan NIM      : ");
                        String nim = sc.nextLine();

                        System.out.print("Masukkan Nama     : ");
                        String nama = sc.nextLine();

                        System.out.print("Masukkan Jurusan  : ");
                        String jurusan = sc.nextLine();

                        Mahasiswa20 mhs = new Mahasiswa20(nim, nama, jurusan); // Membuat objek mahasiswa dengan data yang diinput

                        antrian.enqueue(mhs);
                    }
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.printQueue();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;

                case 8:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 0);

        sc.close();
    }
}

