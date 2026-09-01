# Aturan Kolaborasi Kelompok - Tugas OOP (Java)

Kelompok: lupa kelompok berapa
Repo: GitHub

---

## 1. Format Commit Message

Format: `tipe: deskripsi singkat`

| Tipe     | Kapan dipakai                                       |
| -------- | --------------------------------------------------- |
| `add`    | Nambah fitur/class/method baru                      |
| `fix`    | Benerin bug/error                                   |
| `update` | Ubah kode yang udah ada (refactor, perbaikan logic) |
| `docs`   | Update dokumentasi/comment/README                   |
| `test`   | Nambah atau ubah testing                            |

Contoh:

```
add: class Animal dengan constructor dan attribute dasar
fix: error inheritance di class Dog
update: ganti method makan() jadi lebih OOP
docs: tambah penjelasan konsep polymorphism di README
```

Aturan tambahan:

- Bahasa Indonesia atau Inggris bebas, tapi **konsisten** dipakai satu bahasa terus sekelompok
- 1 commit = 1 perubahan logis. Jangan gabung "nambah class A + fix bug B" dalam 1 commit
- Jangan commit dengan pesan kosong atau asal kayak `"update"`, `"fix"`, `"asdf"` doang

---

## 2. Aturan Kerja

1. **Pull dulu sebelum mulai ngedit**, biar ga bentrok sama kerjaan temen
2. **Tulis nama pembuat** di atas class/file, misal komentar `// by: Rara`
3. **Jangan hapus/ubah kerjaan orang lain** tanpa diskusi dulu di grup
4. **Commit rutin**, jangan numpuk kerjaan seharian terus commit sekali gede-gedean

---

## 3. Struktur File

- 1 file `.java` per class (standar Java), nama file = nama class, misal `Animal.java`, `Dog.java`
- 1 folder per topik/konsep kalau perlu, misal `encapsulation/`, `inheritance/`, `polymorphism/`
- README isi: nama anggota, pembagian tugas, progress

---

## 4. Cara Push ke GitHub

```
git pull
git add .
git commit -m "add: class Animal dengan constructor dasar"
git push
```

Kalau `git push` error, biasanya karena ada perubahan baru dari temen. Jalanin `git pull` dulu, baru `git push` lagi. Kalau ada conflict di file yang sama, diskusiin dulu di grup sebelum lanjut.
