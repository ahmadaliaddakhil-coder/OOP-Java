package oop.inheritance;

public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    public void bersuara() {
        System.out.println(nama + " bersuara: meong");
    }
}
