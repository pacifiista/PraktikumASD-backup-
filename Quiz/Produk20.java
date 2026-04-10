public class Produk20 {
    // deklarasi atribut
    String nama20;
    int stok20;
    double harga20, diskon20; 

    // constructor default
    public Produk20() {
    }

    // constructor dengan parameter
    public Produk20(String nama, int stok, double harga, double diskon) {
        this.nama20 = nama; // menggunakan this untuk menyimpan nilai parameter ke atribut kelas
        this.stok20 = stok;
        this.harga20 = harga;
        this.diskon20 = diskon;
    }

    // method untuk tampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("======== INFORMASI PRODUK =======");
        System.out.println("Nama Produk\t: " + nama20); //menampilkan nama produk
        System.out.println("Stok\t\t: " + stok20); //menampilkan stok produk
        System.out.println("Harga\t\t: " + harga20); //menampilkan harga produk
        System.out.println("Diskon\t\t: " + diskon20 + " %"); //menampilkan diskon produk
    }

    // method untuk menghitung harga setelah diskon
    public double hitungHargaSetelahDiskon(){
        // menghitung harga setelah diskon dengan rumus: harga setelah diskon = harga - (harga * diskon / 100)
        double hitungHargaSetelahDiskon = harga20 - (harga20 * diskon20 / 100); 
        return hitungHargaSetelahDiskon; // mengembalikan nilai harga setelah diskon
    }
    
}