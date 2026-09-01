package oop.kelas;

public class Mahasiswa {
    String nama;
    String nrp;
    double ipk;

    public Mahasiswa(String nama, String nrp, double ipk) {
        this.nama = nama;
        this.nrp = nrp;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NRP: " + nrp);
        System.out.println("IPK: " + ipk);
    }
}
