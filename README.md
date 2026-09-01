# OOP Praktikum

Repository ini berisi contoh kode Java untuk materi Praktikum Pemrograman Berorientasi Objek.

## Struktur Folder

```text
src/
└── oop/
    ├── Main.java
    ├── pengenalan/
    │   └── HelloWorld.java
    ├── dasarpemrograman/
    │   └── DasarPemrogramanDemo.java
    ├── array/
    │   └── ArrayDemo.java
    ├── kelas/
    │   ├── Mahasiswa.java
    │   └── MainKelas.java
    ├── enkapsulasi/
    │   ├── Animal.java
    │   └── MainEnkapsulasi.java
    ├── inheritance/
    │   ├── Hewan.java
    │   ├── Kucing.java
    │   └── MainInheritance.java
    ├── polymorphism/
    │   ├── Hewan.java
    │   ├── Kucing.java
    │   ├── Anjing.java
    │   └── MainPolymorphism.java
    ├── exception/
    │   └── ExceptionDemo.java
    ├── collection/
    │   └── CollectionDemo.java
    └── legacy/
        └── tempCodeRunnerFile.java.txt
```

File Java lama tetap dipertahankan di `src/` dan subfolder lamanya. File sementara `tempCodeRunnerFile.java` diarsipkan menjadi `.txt` karena isinya bukan kode Java valid.

## Cara Menjalankan

Compile semua file Java:

```powershell
javac -d bin (Get-ChildItem -Recurse src -Filter *.java | ForEach-Object FullName)
```

Jalankan semua demo materi baru:

```powershell
java -cp bin oop.Main
```

Jalankan materi tertentu:

```powershell
java -cp bin oop.pengenalan.HelloWorld
java -cp bin oop.kelas.MainKelas
java -cp bin oop.enkapsulasi.MainEnkapsulasi
java -cp bin oop.inheritance.MainInheritance
java -cp bin oop.polymorphism.MainPolymorphism
java -cp bin oop.collection.CollectionDemo
java -cp bin oop.exception.ExceptionDemo
```
