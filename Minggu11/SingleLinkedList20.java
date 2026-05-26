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
}