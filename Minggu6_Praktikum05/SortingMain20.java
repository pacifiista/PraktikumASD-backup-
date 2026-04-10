package Minggu6_Praktikum05;

public class SortingMain20 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};

        // buat objek dari Sorting20
        Sorting20 dataurut1 = new Sorting20(a, a.length);
        Sorting20 dataurut2 = new Sorting20(b, b.length);

        // data pertama
        System.out.println("Data awal : ");
        dataurut1.tampilData();
        System.out.println("Data setelah diurutkan dengan bubble sort : ");
        dataurut1.bubbleSort();
        dataurut1.tampilData();

        // data kedua
        System.out.println("Data awal : ");
        dataurut2.tampilData();
        System.out.println("Data setelah diurutkan dengan bubble sort : ");
        dataurut2.bubbleSort();
        dataurut2.tampilData();
    }
}


