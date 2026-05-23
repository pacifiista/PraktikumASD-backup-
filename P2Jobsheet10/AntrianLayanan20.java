package P2Jobsheet10;


public class AntrianLayanan20 {
    Mahasiswa20[] data; // Disamakan menjadi Mahasiswa20
    int front;
    int rear;
    int size; 
    int max;

    public AntrianLayanan20(int n) {
        max = n;
        data = new Mahasiswa20[max];
        front = 0;   // Inisialisasi front idealnya mulai dari 0 untuk circular queue
        rear = -1;
        size = 0;
    }

    // Method empty
    public boolean IsEmpty() {
        return size == 0;
    }

    // Method full
    public boolean IsFull() {
        return size == max;
    }

    // Method peek (Melihat data terdepan)
    public void lihatTerdepan() {
        if (IsEmpty()) { // Diperbaiki: kalau kosong tampilkan teks kosong
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    // Method menampilkan semua antrian
    public void tampilkanSemua() {
        if (IsEmpty()) { // Diperbaiki: IsEmpty (huruf besar I) sesuai nama method atas
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        
        // Loop circular queue yang benar
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
            index = (index + 1) % max; // Geser indeks secara circular
        }
    }

    // Method get jumlah antrian
    public int getJumlahAntrian() {
        return size;
    }

    // Method clear
    public void clear() {
        if (!IsEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue memang sudah kosong");
        }
    }

    // Method Enqueue (Tambah data)
    public void tambahAntrian(Mahasiswa20 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    // Method Dequeue (Mengeluarkan/melayani data)
    // Diperbaiki: Return type-nya diganti Mahasiswa20, bukan int!
    public Mahasiswa20 layananMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        } 
        Mahasiswa20 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    // modifikasi
    // Tambahkan method ini di dalam class AntrianLayanan20
    public void LihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData(); // Mengambil data di posisi rear (paling belakang)
        }
    }
}
