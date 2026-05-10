package Mingguke9;
import java.util.Scanner;

public class SuratMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat20 srt = new StackSurat20(10);
        int pilihan;

        do {
            System.out.println("\nMenu Layanan Surat Izin");
            System.out.println("1. Terima surat Izin (Push)");
            System.out.println("2. Proses surat Izin (Pop)");
            System.out.println("3. Lihat surat Izin teratas (Peek)");
            System.out.println("4. Cari surat Izin berdasarkan nama mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMhs = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Surat Izin (S/I): ");
                    char jenisSurat = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); // membersihkan buffer

                    Surat20 s = new Surat20(idSurat, namaMhs, kelas, jenisSurat, durasi);
                    srt.push(s); 
                    break;
                
                case 2:
                    Surat20 prosesSurat = srt.pop();
                    if (prosesSurat != null) {
                        System.out.println("Memproses surat dari " + prosesSurat.namaMhs);
                    }
                    break;
                
                case 3:
                    Surat20 lihatSurat = srt.peek();
                    if (lihatSurat != null) {
                        System.out.println("Surat teratas adalah dari " + lihatSurat.namaMhs);
                    } else {
                        System.out.println("Belum ada surat masuk.");
                    }
                    break;
                
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cariNama = sc.nextLine();
                    srt.cariSurat(cariNama);
                    break;
        
            }
        } while (pilihan != 5);
    }
}
