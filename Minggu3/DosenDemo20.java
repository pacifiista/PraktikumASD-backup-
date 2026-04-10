import java.util.Scanner;

public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data Dosen yang ingin diinput : ");
        int jumlahData = Integer.parseInt(sc.nextLine()); 

        Dosen20[] arrayDosen20 = new Dosen20[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            String kode = sc.nextLine();
            System.out.print("Nama           : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jkInput = sc.nextLine();
            boolean jenisKelamin = jkInput.equalsIgnoreCase("Wanita");
            System.out.print("Usia           : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------------");

            arrayDosen20[i] = new Dosen20(kode, nama, jenisKelamin, usia);
        }

        // Menampilkan data menggunakan For-Each (Sesuai tugas)
        int nomor = 1;
        System.out.println("\n--- Tampilan Awal (Looping For-Each) ---");
        for (Dosen20 d : arrayDosen20) {
            System.out.println("Data Dosen ke-" + nomor++);
            System.out.println("Nama : " + d.nama + " [" + (d.jenisKelamin ? "Wanita" : "Pria") + "]");
        }
        
        // Memanggil Method dari DataDosen20
        DataDosen20 dataDosen = new DataDosen20();
        dataDosen.dataSemuaDosen(arrayDosen20);
        dataDosen.jumlahDosenPerJenisKelamin(arrayDosen20);
        dataDosen.rerataUsiaDosenPerjenisKelamin(arrayDosen20);
        dataDosen.infoDosenPalingTua(arrayDosen20);
        dataDosen.infoDosenPalingMuda(arrayDosen20);

        sc.close();
    }
}