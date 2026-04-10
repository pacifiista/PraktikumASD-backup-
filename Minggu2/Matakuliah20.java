public class Matakuliah20 {
    //Deklarasi atribut
    String kodeMK, namaMK;
    int sks, jmlJam;

    void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jmlJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS " + namaMK + " telah diubah menjadi: " + sks);
    }

    void tambahJam(int jamTambahan) {
        jmlJam += jamTambahan;
        System.out.println("Jumlah jam baru setelah ditambah: " + jmlJam);
    }

    void kurangiJam(int jamPengurangan) {
        if (jmlJam - jamPengurangan >= 0) { // pengecekan agar jumlah jam tidak menjadi negatif
            jmlJam -= jamPengurangan;
            System.out.println("Pengurangan berhasil. Jumlah jam saat ini: " + jmlJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi!");
        }
    }

     public Matakuliah20() {
        // Konstruktor default
    }

    public Matakuliah20(String kodeMK, String namaMK, int sks, int jmlJam) {
        this.kodeMK = kodeMK; // Konstruktor Parameter
        this.namaMK = namaMK; // menggunakan this untuk menyimpan nilai parameter ke atribut kelas
        this.sks = sks;
        this.jmlJam = jmlJam;
    }
}
