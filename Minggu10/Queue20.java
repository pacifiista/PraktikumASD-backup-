package Minggu10;
public class Queue20 {

    int [] data;
    int front;
    int rear;
    int size; 
    int max;

    public Queue20(int n) {
        max = n;
        data = new int[max];
        front = rear = -1;
        size = 0;
    }

    // method empty
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // method full
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // method peek
    public int peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    // method print
    public void print () {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    // method clear
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // method Enqueue
    // modified: jika queue penuh, tampilkan pesan dan hentikan program (Queue overflow)
    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.out.println("Program dihentikan (Queue overflow)");
            System.exit(0); // Menghentikan program jika queue penuh
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
        }
    }

    // method Dequeue
    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.out.println("Program dihentikan (Queue underflow)");
            System.exit(0); // Menghentikan program jika queue kosong
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

}