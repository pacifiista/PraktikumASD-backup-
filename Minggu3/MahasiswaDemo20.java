
import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        // deklarasi array of objek Mahasiswa20
        Mahasiswa20[] arrayOfMahasiswa = new Mahasiswa20[3];
        String dummy; // variabel dummy untuk menampung inputan enter
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa20(); // instansiasi objek Mahasiswa20

            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM" + ": ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama" + ": ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas" + ": ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK" + ": ");
            dummy = sc.nextLine(); // membersihkan newline character
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy); // konversi
            System.out.println("------------------------------");
        }

        // // instansiasi objek Mahasiswa20
        // arrayOfMahasiswa[0] = new Mahasiswa20();
        // arrayOfMahasiswa[0].nim = "254107020007";
        // arrayOfMahasiswa[0].nama = "NAURA FADHILLA ADITYA PUTRI";
        // arrayOfMahasiswa[0].kelas = "TI-1C";
        // arrayOfMahasiswa[0].ipk = 3.90f;

        // // instansiasi objek Mahasiswa20 mahasiswa kedua
        // arrayOfMahasiswa[1] = new Mahasiswa20();
        // arrayOfMahasiswa[1].nim = "254107020008";
        // arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiswa[1].kelas = "TI-2A";
        // arrayOfMahasiswa[1].ipk = 3.36f;

        // // instansiasi objek Mahasiswa20 mahasiswa ketiga
        // arrayOfMahasiswa[2] = new Mahasiswa20();
        // arrayOfMahasiswa[2].nim = "254107020009";
        // arrayOfMahasiswa[2].nama = "FARHAN ALFARIZQI";
        // arrayOfMahasiswa[2].kelas = "TI-2B";
        // arrayOfMahasiswa[2].ipk = 3.45f;

        // System.out.println("NIM\t\t\t: " + arrayOfMahasiswa[0].nim);
        // System.out.println("Nama\t\t\t: " + arrayOfMahasiswa[0].nama);
        // System.out.println("Kelas\t\t\t: " + arrayOfMahasiswa[0].kelas);
        // System.out.println("IPK\t\t\t: " + arrayOfMahasiswa[0].ipk);
        // System.out.println("---------------------------------------------");
        // System.out.println("NIM\t\t\t: " + arrayOfMahasiswa[1].nim);
        // System.out.println("Nama\t\t\t: " + arrayOfMahasiswa[1].nama);
        // System.out.println("Kelas\t\t\t: " + arrayOfMahasiswa[1].kelas);
        // System.out.println("IPK\t\t\t: " + arrayOfMahasiswa[1].ipk);
        // System.out.println("---------------------------------------------");
        // System.out.println("NIM\t\t\t: " + arrayOfMahasiswa[2].nim);
        // System.out.println("Nama\t\t\t: " + arrayOfMahasiswa[2].nama);
        // System.out.println("Kelas\t\t\t: " + arrayOfMahasiswa[2].kelas);
        // System.out.println("IPK\t\t\t: " + arrayOfMahasiswa[2].ipk);
        // System.out.println("---------------------------------------------");

    }
}
