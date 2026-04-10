package Minggu6_Praktikum05;

public class SortingMain20 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        // buat objek dari Sorting20
        Sorting20 dataurut1 = new Sorting20(a, a.length);

        System.out.println("Data awal : ");
        dataurut1.tampilData();

        System.out.println("Data setelah diurutkan dengan bubble sort : ");
        dataurut1.bubbleSort();
        dataurut1.tampilData();
    }
}


