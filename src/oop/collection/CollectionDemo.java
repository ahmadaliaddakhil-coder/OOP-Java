package oop.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> namaMahasiswa = new ArrayList<>();
        namaMahasiswa.add("Ayu");
        namaMahasiswa.add("Bima");
        namaMahasiswa.add("Citra");

        System.out.println("[Collection]");
        for (String nama : namaMahasiswa) {
            System.out.println("- " + nama);
        }
    }
}
