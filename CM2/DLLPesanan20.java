package CM2;

public class DLLPesanan20 {
    nodePesanan20 head;
    nodePesanan20 tail;

    // method tambah Pesanan (addLast)
    void tambahPesanan(Pesanan20 ps){
        nodePesanan20 baru = new nodePesanan20(null,  ps, null);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    // method sorting nama pesanan
    // bubblesort
    void sortNamaPesanan(){
        if (head == null) return; 
        boolean tukar;

        do {
            tukar = false;
            nodePesanan20 sekarang = head;
         while (sekarang.next != null){
            if(sekarang.data.namaPesanan.compareTo(sekarang.next.data.namaPesanan) > 0) {
                Pesanan20 temp = sekarang.data;
                sekarang.data = sekarang.next.data;
                sekarang.next.data = temp;

                tukar = true;
                }
                sekarang = sekarang.next;
            }
        
         } while(tukar);
    }


    // cetak pesanan (Print)
    void tampilPesanan(){
        sortNamaPesanan();
        nodePesanan20 temp = head;
        int total = 0;

        while(temp != null){
            System.out.println(temp.data.kodePesanan + " | " + temp.data.namaPesanan + " | " + temp.data.harga);
            total += temp.data.harga;
            temp = temp.next;
        }
        System.out.println("Total Pendapatan: " + total);
    }

    // modifikasi Pesanan Termahal OPSI 1 SESI 3
    void pesananTermahal(){
        if (head == null) {
            System.out.println("Belum ada pesanan");
            return;
        }
        nodePesanan20 current = head;
        Pesanan20 max = head.data;
        while(current != null) {
            if(current.data.harga > max.harga) {
                max = current.data;
            
            }
            current = current.next;
        }
        System.out.println("Pesanan termahal:");
        System.out.println(max.kodePesanan + " | " + max.namaPesanan + " | " + max.harga); // menampilkan pesanan termahal
    }
    
}
