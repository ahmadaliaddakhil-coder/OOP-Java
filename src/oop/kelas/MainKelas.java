package oop.kelas;

public class MainKelas {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Budi", "3124600001", 3.75);

        System.out.println("[Pembuatan Kelas]");
        mahasiswa.tampilkanInfo();
    }
}
