public class ProdukMain20 {
    
    public static void main(String[] args) {
        Produk20 produk1 = new Produk20();
        
        // Mengisi atribut produk1 dengan nilai
        produk1.nama20 = "beras";
        produk1.stok20 = 23;
        produk1.harga20 = 75000;
        produk1.diskon20 = 5.0;
        produk1.tampilkanInfo();

        // Membuat objek produk2,produk3, dan produk4 menggunakan construktor dengan parameter
        Produk20 produk2 = new Produk20("Gula", 58, 175000, 5.0);
        produk2.tampilkanInfo();

        Produk20 produk3 = new Produk20("Roti", 22, 260000, 2.0);
        produk3.tampilkanInfo();

        Produk20 produk4 = new Produk20("Susu", 64, 12000, 3.0);
        produk4.tampilkanInfo();

        // Memanggil method hitungHargaSetelahDiskon untuk produk1
        double hargaSetelahDiskon = produk1.hitungHargaSetelahDiskon();
        System.out.println("========== POTONGAN HARGA ==========");
        System.out.println("Harga setelah diskon untuk " + produk1.nama20 + ": Rp." + hargaSetelahDiskon);
        System.out.println("-------------------------------------");
        
        // Memanggil method hitungHargaSetelahDiskon untuk produk2
        double hargaSetelahDiskon2 = produk2.hitungHargaSetelahDiskon();
        System.out.println("Harga setelah diskon untuk " + produk2.nama20 + ": Rp." + hargaSetelahDiskon2);
        System.out.println("-------------------------------------");

        // Memanggil method hitungHargaSetelahDiskon untuk produk3
        double hargaSetelahDiskon3 = produk3.hitungHargaSetelahDiskon();
        System.out.println("Harga setelah diskon untuk " + produk3.nama20 + ": Rp." + hargaSetelahDiskon3);
        System.out.println("-------------------------------------");

        // Memanggil method hitungHargaSetelahDiskon untuk produk4
        double hargaSetelahDiskon4 = produk4.hitungHargaSetelahDiskon();
        System.out.println("Harga setelah diskon untuk " + produk4.nama20 + ": Rp." + hargaSetelahDiskon4);
        System.out.println("-------------------------------------");


    }
}
