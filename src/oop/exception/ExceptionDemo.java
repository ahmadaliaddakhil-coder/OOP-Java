package oop.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("[Exception]");

        try {
            int hasil = bagi(10, 0);
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException error) {
            System.out.println("Terjadi error: " + error.getMessage());
        } finally {
            System.out.println("Blok finally tetap dijalankan");
        }
    }

    public static int bagi(int angka, int pembagi) {
        return angka / pembagi;
    }
}
