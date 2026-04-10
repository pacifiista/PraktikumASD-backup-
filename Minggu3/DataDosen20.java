package Minggu3;
public class DataDosen20 {

    void dataSemuaDosen(Dosen20[] arrayOfDosen) {
        System.out.println("\n========== DATA SEMUA DOSEN ==========");
        for (Dosen20 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode); 
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Wanita" : "Pria"));
            System.out.println("Usia          : " + d.usia); //d untuk mengakses atribut usia dari objek Dosen20
            System.out.println("------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int wanita = 0, pria = 0;
        for (Dosen20 d : arrayOfDosen) {
            if (d.jenisKelamin) wanita++;
            else pria++;
        }
        System.out.println("\n========= JUMLAH PER GENDER =========");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    void rerataUsiaDosenPerjenisKelamin(Dosen20[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen20 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            } else {
                totalUsiaPria += d.usia;
                jmlPria++;
            }
        }
        System.out.println("\n========= RATA-RATA USIA =========");
        System.out.println("Rerata Pria   : " + (jmlPria > 0 ? (double) totalUsiaPria / jmlPria : 0));
        System.out.println("Rerata Wanita : " + (jmlWanita > 0 ? (double) totalUsiaWanita / jmlWanita : 0));
    }

    void infoDosenPalingTua(Dosen20[] arrayOfDosen) {
        Dosen20 tertua = arrayOfDosen[0];
        for (Dosen20 d : arrayOfDosen) {
            if (d.usia > tertua.usia) tertua = d;
        }
        System.out.println("\n========= DOSEN PALING TUA =========");
        System.out.println("Nama : " + tertua.nama + " (" + tertua.usia + " thn)");
    }

    void infoDosenPalingMuda(Dosen20[] arrayOfDosen) {
        Dosen20 termuda = arrayOfDosen[0];
        for (Dosen20 d : arrayOfDosen) {
            if (d.usia < termuda.usia) termuda = d;
        }
        System.out.println("\n========= DOSEN PALING MUDA =========");
        System.out.println("Nama : " + termuda.nama + " (" + termuda.usia + " thn)");
    }
}