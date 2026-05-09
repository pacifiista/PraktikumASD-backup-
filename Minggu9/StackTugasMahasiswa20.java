package Minggu9;
public class StackTugasMahasiswa20 {
    Mahasiswa20[] stack;
    int top;
    int size;

    public StackTugasMahasiswa20(int size) {
        this.size = size;
        stack = new Mahasiswa20[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa20 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa20 pop() {
        if (!isEmpty()) {
            Mahasiswa20 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang bisa diambil.");
            return null;
        }
    }

    // No. 4 modifikasi liat tugas terbawah (data yang pertama kali masuk)
    public Mahasiswa20 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; // melihat tugas terbawah (data yang pertama kali masuk)
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang bisa dilihat.");
            return null;
        }
    }

    // no 5 modifikasi hitung jumlah tugas saat ini
    public int jmlTugas() {
        return top + 1; // jumlah tugas saat ini adalah indeks top + 1
    }

    public void print() {
        // perbaikan kode agar LIFO (last in first out) sesuai dengan konsep stack
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
