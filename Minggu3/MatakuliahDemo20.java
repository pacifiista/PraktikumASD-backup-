import java.util.Scanner;
public class MataKuliahDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // instansiasi objek Matakuliah20

        // MODIFIKASI input jumlah elemen array of objek Matakuliah20
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMK = sc.nextInt();

        //membuat array 
        Matakuliah20[] arrayOfMatakuliah = new Matakuliah20[jmlMK];

        //LOOP untuk input data matakuliah
            for (int i = 0; i < arrayOfMatakuliah.length; i++) {
                arrayOfMatakuliah[i] = new Matakuliah20(); // instansiasi objek Matakuliah20
                System.out.println("Masukkan data Mata Kuliah ke-" + (i + 1) + ":");
    
                // memanggil method tambahData untuk input data matakuliah
                arrayOfMatakuliah[i].tambahData();
            }

            // loop untuk menampilkan data matakuliah
            System.out.println("Data Matakuliah:");
            for (int i = 0; i < arrayOfMatakuliah.length; i++) {
                System.out.println("Data Matakuliah ke-" + (i + 1) + ":");
                arrayOfMatakuliah[i].cetakInfo();
            }

           // menutup scanner
           sc.close();


        // Matakuliah20[] arrayOfMatakuliah = new Matakuliah20[3];
        // String kode, nama, dummy;
        // int sks, jmlJam;

        // // loop untuk input data matakuliah
        // for (int i = 0; i < arrayOfMatakuliah.length; i++) {
        //     arrayOfMatakuliah[i] = new Matakuliah20(); // instansiasi objek Matakuliah20
        //     System.out.println("Masukkan data Mata Kuliah ke-" + (i + 1) + ":");

        //     // memanggil method tambahData untuk input data matakuliah
        //     arrayOfMatakuliah[i].tambahData();
        // }
        
        // // loop untuk menampilkan data matakuliah
        // System.out.println("Data Matakuliah:");
        // for (int i = 0; i < arrayOfMatakuliah.length; i++) {
        //     System.out.println("Data Matakuliah ke-" + (i + 1) + ":");
        //     arrayOfMatakuliah[i].cetakInfo();
        // }

        //     nama = sc.nextLine();
        //     System.out.print("SKS" + ": ");
        //     dummy = sc.nextLine(); // membersihkan newline character
        //     sks = Integer.parseInt(dummy); // konversi string ke int
        //     System.out.print("Jumlah Jam" + ": ");
        //     dummy = sc.nextLine(); // membersihkan newline character
        //     jmlJam = Integer.parseInt(dummy); // konversi string ke int
        //     System.out.println("------------------------------");
        // }
        // for (int i = 0;i < 3; i++) {
        //     System.out.println("Data Matakuliah ke-" + (i + 1) + ":");
        //     System.out.print("Kode" + ": " + arrayOfMatakuliah[i].kode);
        //     System.out.print("Nama" + ": " + arrayOfMatakuliah[i].nama);
        //     System.out.print("SKS" + ": " + arrayOfMatakuliah[i].sks);
        //     System.out.print("Jumlah Jam" + ": " + arrayOfMatakuliah[i].jmlJam);
        //     System.out.println();
        // }
        
    
            // instansiasi objek Matakuliah20 dengan konstruktor berparameter
            // arrayOfMatakuliah[i] = new Matakuliah20(kode, nama, sks, jmlJam); 
        }
    }

