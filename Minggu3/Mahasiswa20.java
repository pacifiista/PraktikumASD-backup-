public class Mahasiswa20 {
   // atribut
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    // // method untuk menampilkan data mahasiswa
    // public void tampilkanDataMahasiswa(Mahasiswa20[] arrayOfMahasiswa) {
    // for (int i = 0; i < 3; i++) {
    //             System.out.println("Data Mahasiswa ke-" + (i + 1) + ":");
    //             System.out.println("NIM: " + arrayOfMahasiswa[i].nim);
    //             System.out.println("Nama: " + arrayOfMahasiswa[i].nama);
    //             System.out.println("Kelas: " + arrayOfMahasiswa[i].kelas);
    //             System.out.println("IPK: " + arrayOfMahasiswa[i].ipk);
    //             System.out.println("------------------------------");
    //         }

    // method modifikasi untuk menampilkan data mahasiswa
    void cetakInfo(){
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Kelas: " + this.kelas);
        System.out.println("IPK: " + this.ipk);
        System.out.println("------------------------------");
    }
    // method untuk menampilkan data mahasiswa 
    void tampilkanDataMahasiswa(Mahasiswa20[] arrayOfMahasiswa) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1) + ":");
            // memanggil method tampil
            arrayOfMahasiswa[i].cetakInfo();
        }

    }

}