package oop.inheritance;

public class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan");
    }
}
