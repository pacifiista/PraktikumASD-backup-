package Minggu11;

public class SingleLinkedList20 {
    Node20 head;
    Node20 tail;

    // method empty
    boolean IsEmpty() {
        return (head == null);
    }

    // method print 
    void print() {
        if (!IsEmpty()) {
            Node20 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi(); // Memanggil method tampil milik Mahasiswa20
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // method addFirst (Memasukkan di paling depan/head)
    void addFirst(Mahasiswa20 input) {
        Node20 ndInput = new Node20(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head; // Hubungkan node baru ke head lama
            head = ndInput;      // Pindahkan head ke node baru
        }
    }

    // method addLast (Memasukkan di paling belakang/tail)
    void addLast(Mahasiswa20 input) {
        Node20 ndInput = new Node20(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput; // Hubungkan tail lama ke node baru
            tail = ndInput;      // Pindahkan tail ke node baru
        }
    }

    // method insertAfter
    void insertAfter(String key, Mahasiswa20 input) {
        Node20 ndInput = new Node20(input, null);
        Node20 temp = head;
        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) { // Jika disisipkan di paling akhir
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    // method insertAt
    void insertAt(int index, Mahasiswa20 input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node20 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                temp.next = new Node20(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }

    // method getData
    void getData(int index) {
        Node20 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp != null) {
                tmp = tmp.next;
            }
        }
        if (tmp != null) {
            tmp.data.tampilkanInformasi();
        } else {
            System.out.println("Indeks tidak valid");
        }
    }

    // method indexOf
    int indexOf(String key) {
        Node20 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp = temp.next;
            index++;
        } 
        if (temp != null) {
            return -1; // Ditemukan, kembalikan indeks
        } else {
            return index; // Jika tidak ditemukan
        }
    }

    // method removeFirst
    void removeFirst() {
        if (IsEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus");
        } else if (head == tail) { // Hanya ada satu node
                head = null;
                tail = null;
            } else {
                head = head.next; // Pindahkan head ke node berikutnya
            }
    }
    
     // method removeLast
    void removeLast() {
        if (IsEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus");
        } else if (head == tail) { // Hanya ada satu node
                head = null;
                tail = null;
            } else {
                Node20 temp = head;
                while (temp.next != tail) {
                    temp = temp.next; // Cari node sebelum tail
                }
                temp.next = null; // Putuskan hubungan dengan tail lama
                tail = temp;      // Pindahkan tail ke node sebelumnya
            }
        }
        // method remove
    void remove(String key) {
        if (IsEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus");
        } else {
            Node20 temp = head;
            while (temp.next != null) {
                if (temp.data.nama.equalsIgnoreCase(key) && (temp == head)) { // Jika node yang akan dihapus adalah head
                   this.removeFirst(); // Panggil method removeFirst untuk menghapus head
                    break;
                } else if (temp.next.data.nama.equalsIgnoreCase(key)) { 
                    temp.next = temp.next.next; // Putuskan hubungan dengan node yang dihapus
                    if (temp.next == null) { // Jika node yang dihapus adalah tail
                        tail = temp; // Pindahkan tail ke node sebelumnya
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    // method removeAt
    void removeAt (int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node20 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
                
            }
            temp.next = temp.next.next; // Putuskan hubungan dengan node yang dihapus
            if (temp.next == null) { // Jika node yang dihapus adalah tail
                tail = temp; // Pindahkan tail ke node sebelumnya
            }
        }
    }
}
