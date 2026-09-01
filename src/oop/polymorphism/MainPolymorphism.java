package oop.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        Hewan[] daftarHewan = {
            new Kucing(),
            new Anjing()
        };

        System.out.println("[Polymorphism]");
        for (Hewan hewan : daftarHewan) {
            hewan.bersuara();
        }
    }
}
