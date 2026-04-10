import java.util.Scanner;
public class Matakuliah20 {
    // atribut
    public String kode;
    public String nama;
    public int sks;
    public int jmlJam;

    // konstruktor berparameter
    // public Matakuliah20(String kode, String nama, int sks, int jmlJam) {
    //     this.kode = kode;
    //     this.nama = nama;
    //     this.sks = sks;
    //     this.jmlJam = jmlJam;

        //method untuk tambah data matakuliah
        void tambahData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Kode" + ": ");
            this.kode = sc.nextLine();
            System.out.print("Nama" + ": ");
            this.nama = sc.nextLine();
            System.out.print("SKS" + ": ");
            this.sks = sc.nextInt();
            System.out.print("Jumlah Jam" + ": ");
            this.jmlJam = sc.nextInt();
            System.out.println("------------------------------");
        }

        //method untuk menampilkan data matakuliah
        void cetakInfo() {
            System.out.println("Kode: " + this.kode);
            System.out.println("Nama: " + this.nama);
            System.out.println("SKS: " + this.sks);
            System.out.println("Jumlah Jam: " + this.jmlJam);
            System.out.println("------------------------------");

    }
}
