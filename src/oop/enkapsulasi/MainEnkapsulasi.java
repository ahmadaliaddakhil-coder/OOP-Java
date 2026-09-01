package oop.enkapsulasi;

public class MainEnkapsulasi {
    public static void main(String[] args) {
        Animal animal = new Animal("Milo", 3);
        animal.setUmur(4);

        System.out.println("[Enkapsulasi]");
        animal.tampilkanInfo();
    }
}
