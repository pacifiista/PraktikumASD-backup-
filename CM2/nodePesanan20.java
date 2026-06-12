package CM2;

public class nodePesanan20 {
    Pesanan20 data; 

    nodePesanan20 prev;
    nodePesanan20 next;

    public nodePesanan20(nodePesanan20 prev, Pesanan20 data, nodePesanan20 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
