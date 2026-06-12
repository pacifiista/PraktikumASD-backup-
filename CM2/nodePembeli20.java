package CM2;

public class nodePembeli20 {
    int noAntrian;
    Pembeli20 data; 

    nodePembeli20 prev;
    nodePembeli20 next;

    public nodePembeli20(nodePembeli20 prev, int noAntrian, Pembeli20 data, nodePembeli20 next){
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.data = data;
        this.next =next;

    }
}
