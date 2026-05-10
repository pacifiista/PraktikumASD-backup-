package Mingguke9;

public class StackSurat20 {
    Surat20[] stack;
    int top;
    int size;

    // stack untuk menyimpan surat yang masuk, dengan tipe data surat20
    public StackSurat20(int size) {
        this.size = size;
        stack = new Surat20[size];
        top = -1;
    }

    // method untuk mengecek apakah stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // method untuk mengecek apakah stack penuh
    public boolean isFull() {
        return top == size - 1; 
    }

    // method untuk menambahkan surat ke stack
    public void push(Surat20 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    // method untuk mengambil surat dari stack
    public Surat20 pop() {
        if (!isEmpty()) {
            Surat20 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang bisa diambil.");
            return null;
        }
    }

     // method untuk melihat surat teratas tanpa menghapusnya
     public Surat20 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    // metod cari surat berdasarkan nama mahasiswa
    public Surat20 cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMhs.equalsIgnoreCase(nama)) {
                return stack[i]; // Janji ditepati, balikin objeknya
            }
        }
        return null; // Kalau nggak ketemu, balikin kosong
    }
}

