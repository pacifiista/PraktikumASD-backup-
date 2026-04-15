package Minggu7;

public class MahasiswaBerprestasi20 {
    Mahasiswa20 [] listMhs = new Mahasiswa20[5];
    int idx;

    // method untuk menambah data mahasiswa
    void tambah(Mahasiswa20 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // method untuk menampilkan data mahasiswa berprestasi
    void tampil() {
        for (Mahasiswa20 m : listMhs) {
            m.tampilData();
            System.out.println("-------------------");
        }
    }

    // method sequential search 
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    // method tampil posisi mahasiswa yang dicari
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    // method tampil mahasiswa yang dicari
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    // method bubble sort berdasarkan IPK
    // void bubbleSort() {
    //     for (int i = 0; i < listMhs.length - 1; i++) {
    //         for (int j = 1; j < listMhs.length - i; j++) {
    //             if (listMhs[j].ipk < listMhs[j - 1].ipk) {
    //                 // swap
    //                 Mahasiswa20 temp = listMhs[j];
    //                 listMhs[j] = listMhs[j - 1];
    //                 listMhs[j - 1] = temp;
    //             }
    //         }
    //     }
    // }

    // method selection sort berdasarkan IPK
    // void selectionSort() {
    //     for (int i = 0; i < listMhs.length; i++) {
    //         int idxMin = i;
    //         for (int j = i + 1; j < listMhs.length; j++) {
    //             if (listMhs[j].ipk < listMhs[idxMin].ipk) {
    //                 idxMin = j;
    //             }
    //         }
    //         // swap
    //         Mahasiswa20 temp = listMhs[i];
    //         listMhs[i] = listMhs[idxMin];
    //         listMhs[idxMin] = temp;

    //     }
    // }

    // Method ascending insertion sort berdasarkan IPK
    // void insertionSort() {
    //     for (int i = 1; i < listMhs.length; i++) {
    //         Mahasiswa20 temp = listMhs[i];
    //         int j = i;
    //         // Ubah tanda perbandingan "<" untuk descending
    //         while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
    //             listMhs[j] = listMhs[j - 1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // }
}


