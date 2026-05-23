package Minggu10.TugasJobsheet10;

public class AntrianKRS20 {
    MahasiswaKRS20[] data;
    int front;
    int rear;
    int size;
    int max;

    // Variable tambahan sesuai ketentuan tugas
    int totalSelesaiKRS;
    final int MAX_DPA_HANDLED = 30;
    //batas maksimal DPA yang dapat menangani KRS

    public AntrianKRS20() {
        max = 10;
        data = new MahasiswaKRS20[max];
        front = 0;
        rear = -1;
        size = 0;
        totalSelesaiKRS = 0; // Inisialisasi total selesai KRS
    }
 
    // method empty
    public boolean IsEmpty() {
        return size == 0;
    }   

    // method full
    public boolean IsFull() {
        return size == max;
    }

    // method clear
    public void clear() {
        if (!IsEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian memang sudah kosong.");
        }
    }

    // method Enqueue
    public void tambahAntrian(MahasiswaKRS20 mhs) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh (Maksimal 10)! Tidak dapat menambahkan mahasiswa.");
            return;
        } 
        // cek apakaah DPA sudah menangani 30 KRS
        if (totalSelesaiKRS >= MAX_DPA_HANDLED) {
            System.out.println("DPA sudah menangani 30 KRS. Tidak dapat menambahkan mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa dengan Nama " + mhs.nama + " berhasil ditambahkan ke antrian.");

    }
    // method Dequeue
    public void panggilProsesKRS() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat diproses.");
            return;
        }

        // Menentukan jumlah yang dipanggil 
        int jumlahDipanggil = Math.min(2, size); // Panggil maksimal 2 mahasiswa atau sesuai jumlah yang ada
        System.out.println("\n--- MEMANGGIL MAHASISWA UNTUK PROSES KRS ---");

        for (int i = 0; i < jumlahDipanggil; i++) {
            // cek kembali batas maksimal DPA sebelum memproses setiap mahasiswa
            if (totalSelesaiKRS >= MAX_DPA_HANDLED) {
                System.out.println("DPA sudah menangani 30 KRS. Tidak dapat memproses lebih banyak mahasiswa.");
                break; // Hentikan proses jika DPA sudah menangani 30 KRS
        }
            MahasiswaKRS20 mhs = data[front];
            System.out.println("Memproses KRS ke- " + (totalSelesaiKRS + 1) + ": ");
            mhs.tampilkanData(); // Tampilkan data mahasiswa yang sedang diproses

            // hapus dari antrian
            front = (front + 1) % max;
            size--;
            totalSelesaiKRS++; // Increment total selesai KRS setiap kali memproses KRS
        }
    }

    // method tampilkan semua antrian
    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat ditampilkan.");
            return;
        }
        System.out.println("\n--- DAFTAR MAHASISWA DALAM ANTRIAN KRS ---");
        System.out.println("NO. \t NIM - NAMA - PRODI - KELAS");
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ".  \t");
            data[index].tampilkanData();
            index = (index + 1) % max; // Geser indeks secara circular
        }
    }

    // method tampilkan paling akhir
    public void tampilkanPalingAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat ditampilkan.");
            return;
        }
        System.out.println("\n--- MAHASISWA TERAKHIR DALAM ANTRIAN KRS ---");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }

    // method cetak jumlah mahasiswa dalam antrian
    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian KRS: " + size);
    }

    // method cetakStatistik
    public void cetakStatistikKRS() {
        int belumProses = MAX_DPA_HANDLED - totalSelesaiKRS; // Hitung sisa KRS yang belum diproses
        System.out.println("\n--- STATISTIK LAYANAN KRS DPA ---");
        System.out.println("1. Jumlah mahasiswa dalam antrian aktif: " + size);
        System.out.println("2. Jumlah mahasiswa Sudah proses KRS: " + totalSelesaiKRS + " / " + MAX_DPA_HANDLED);
        System.out.println("3. Sisa kuota tambahan Belum proses KRS: " + belumProses + " KRS");
    }
}
