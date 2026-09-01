package oop.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Oyen");

        System.out.println("[Inheritance]");
        kucing.makan();
        kucing.bersuara();
    }
}
