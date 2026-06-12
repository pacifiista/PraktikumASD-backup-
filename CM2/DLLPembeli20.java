package CM2;

public class DLLPembeli20 {
    
    nodePembeli20 head;
    nodePembeli20 tail;

    int nomor = 1;

    // tambah antrian (addLast)
    void tambahAntrian(Pembeli20 p) {
        nodePembeli20 baru = new nodePembeli20(null, nomor++, p, null);

        if(head == null){
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

    }

    // cetak antrian (print)
    void tampilAntrian(){
        nodePembeli20 temp = head; // pointer bantu untuk menelusuri list

        while(temp != null){
            System.out.println(temp.noAntrian + " | " + temp.data.namaPembeli + " | " + temp.data.noHp);
            temp = temp.next;
        }

    }

    // hapus antrian (removeFirst)
    public Pembeli20 hapusAntrian(){
        if (head == null) {
            return null;
        }
        Pembeli20 p = head.data;
        if (head == tail) {
            head = tail = null; // klo cuma 1 org list jadi kosong
        } else {
            head = head.next; // klo lebih dr 1 kepala maju
            head.prev =null; // ponter belakang diputus
            //naura-rizal-ayla
            //rizal-ayla
        }
        return p; // mengembalikan data pembeli yang dihapus

    }
}
