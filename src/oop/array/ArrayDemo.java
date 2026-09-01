package oop.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] nilai = {80, 85, 90, 95};
        int total = 0;

        for (int n : nilai) {
            total += n;
        }

        double rataRata = (double) total / nilai.length;

        System.out.println("[Array]");
        System.out.println("Jumlah data: " + nilai.length);
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
