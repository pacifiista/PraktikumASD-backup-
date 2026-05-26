package Minggu11;

public class SLLMain20 {
    public static void main(String[] args) {
        SingleLinkedList20 sll = new SingleLinkedList20();
        // Scanner sc = new Scanner(System.in);

        // System.out.println("=== INPUT DATA MAHASISWA KE LINKED LIST ===");

        // System.out.print("NIM: ");
        // String nim = sc.nextLine();
        // System.out.print("Nama: ");
        // String nama = sc.nextLine();
        // System.out.print("Kelas: ");
        // String kelas = sc.nextLine();
        // System.out.print("IPK: ");
        // double ipk = sc.nextDouble();

        // Mahasiswa20 mhs = new Mahasiswa20(nim, nama, kelas, ipk);
        // sll.addLast(mhs);
        // sll.print();

        // sc.close();

        // Inisialisasi objek mahasiswa 
        Mahasiswa20 mhs1 = new Mahasiswa20("21212203", "Dirga", "4D", 3.6);
        Mahasiswa20 mhs2 = new Mahasiswa20("22212202", "Cintia", "3C", 3.5);
        Mahasiswa20 mhs3 = new Mahasiswa20("23212201", "Bimon", "2B", 3.8);
        Mahasiswa20 mhs4 = new Mahasiswa20("24212200", "Alvaro", "1A", 4.0);

        // 1. Cetak awal (Linked list kosong)
        sll.print(); 
        
        // 2. Alvaro dimasukkan pertama kali menggunakan addFirst
        sll.addFirst(mhs4);
        sll.print();
        
        // 3. Dirga dimasukkan di akhir menggunakan addLast
        sll.addLast(mhs1);
        sll.print();
        
        // 4. Masukkan Bimon SETELAH Dirga
        sll.insertAfter("Dirga", mhs3);
        
        // 5. Masukkan Cintia di INDEKS KE-2 (posisi setelah Dirga sebelum Bimon)
        sll.insertAt(2, mhs2);
        
        // 6. Cetak hasil akhir struktur list
        sll.print();

        // penghapusan & pengaksesan data
        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst(); // Menghapus Alvaro
        sll.removeLast();  // Menghapus Dirga
        sll.print(); // Cetak hasil akhir setelah penghapusan
        sll.removeAt(0); // Menghapus Cintia (sekarang di indeks 0 setelah penghapusan sebelumnya)
        sll.print(); // Cetak hasil akhir setelah penghapusan Cintia
    }
}