package Minggu6_Praktikum05;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        Mahasiswa20 m1 = new Mahasiswa20("123", "zidan", "2A", 3.2);
        Mahasiswa20 m2 = new Mahasiswa20("124", "Ayu", "2A", 3.5);
        Mahasiswa20 m3 = new Mahasiswa20("125", "Sofi", "2A", 3.1);
        Mahasiswa20 m4 = new Mahasiswa20("126", "Sita", "2A", 3.9);
        Mahasiswa20 m5 = new Mahasiswa20("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);   
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Berprestasi sebelum diurutkan:");
        list.tampil();

        System.out.println("Data Mahasiswa Berprestasi setelah diurutkan berdasarkan IPK:");
        list.bubbleSort();
        list.tampil();
    }
}
