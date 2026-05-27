package Minggu11.TugasJB11;

public class QueueLinkedList {
    NodeMhs20 front;
    NodeMhs20 rear;
    int size;
    int max;

    QueueLinkedList(int max) {
        this.max = max;
        front = rear = null;
        size = 0;
    }

    // cek kosong
    boolean isEmpty() {
        return front == null;
    }

    // cek penuh
    boolean isFull() {
        return size == max;
    }

    // tambah antrian
    void enqueue(Mahasiswa20 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        NodeMhs20 baru = new NodeMhs20(mhs);

        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }

    // panggil antrian
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");
        front.data.tampilData();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    // tampil depan
    void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian Terdepan:");
            front.data.tampilData();
        }
    }

    // tampil belakang
    void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian Paling Akhir:");
            rear.data.tampilData();
        }
    }

    // tampil semua antrian
    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        NodeMhs20 temp = front;

        System.out.println("=== DAFTAR ANTRIAN ===");

        while (temp != null) {
            temp.data.tampilData();
            System.out.println("-------------------");
            temp = temp.next;
        }
    }

    // jumlah antrian
    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    // kosongkan antrian
    void clear() {
        front = rear = null;
        size = 0;

        System.out.println("Antrian berhasil dikosongkan.");
    }
}