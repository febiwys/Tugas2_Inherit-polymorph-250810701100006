# Tugas 2 Praktikum Pemrograman Berorientasi Objek

## Identitas Mahasiswa

- Nama: Zahra Febi Maharani
- NPM:250810701100006
- Mata Kuliah: Praktikum Pemrograman Berorientasi Objek

## Deskripsi Project

Project ini berisi implementasi konsep Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java. Project terdiri dari empat soal yang membahas hierarki kelas, inheritance, polymorphism, composition, defensive copy, serta simulasi toko digital.

## Daftar Soal

1. Soal 1 – Hierarki Perangkat Elektronik 
   Implementasi kelas `Perangkat`, `Laptop`, `Ponsel`, dan `LaptopGaming` untuk menerapkan inheritance dan penggunaan method pada kelas turunan.

2. Soal 2 – Pewarisan dan Polimorfisme 
   Pengujian kelas induk dan kelas turunan, overriding method, serta contoh hubungan kelas `Lingkaran` dan `Titik`.

3. Soal 3 – Titik dan Garis  
   Implementasi hubungan objek titik dan garis menggunakan composition serta defensive copy.

4. Soal 4 – Toko Digital
   Implementasi kelas `Produk`, `ProdukFisik`, `ProdukDigital`, `Langganan`, dan `Keranjang` dengan inheritance, polymorphism, composition, serta exception handling.

## Konsep Pemrograman Berorientasi Objek

| Konsep | Penerapan |
|---|---|
| Class dan Object | Membuat kelas dan objek sesuai kebutuhan setiap soal. |
| Encapsulation | Mengatur akses atribut menggunakan access modifier. |
| Inheritance | Menggunakan kelas induk dan kelas turunan. |
| Polymorphism | Memanggil method yang di-override melalui referensi kelas induk. |
| Method Overriding | Mendefinisikan ulang method dari kelas induk pada kelas turunan. |
| Composition | Menggunakan objek lain sebagai bagian dari suatu kelas. |
| Defensive Copy | Melindungi data internal objek dari perubahan melalui salinan objek. |
| Exception Handling | Menangani kondisi tidak valid menggunakan exception. |

## Struktur Project

```text
Tugas2_Inherit-polymorph-250810701100006/
├── .gitignore
├── README.md
├── src/
│   ├── Soal1/
│   ├── Soal2/
│   ├── Soal3/
│   └── Soal4/
└── out/ (hasil kompilasi, tidak disertakan di Git)
```

## Kebutuhan Sistem

- Java Development Kit (JDK)
- Visual Studio Code atau IDE Java lainnya
- Terminal atau Command Prompt
- Git untuk pengelolaan repository

## Cara Menjalankan Program

Jalankan perintah berikut melalui terminal pada folder utama project.

### Soal 1

```bash
javac -d out src/Soal1/*.java
java -cp out soal1.TesSoal1
```

### Soal 2

```bash
javac -d out src/Soal2/*.java
java -cp out soal2.TesSoal2
```

### Soal 3

```bash
javac -d out src/Soal3/*.java
java -cp out soal3.TesSoal3
```

### Soal 4

```bash
javac -d out src/Soal4/*.java
java -cp out soal4.TesSoal4
```

## Dokumentasi Pengujian

Dokumentasi pengujian berisi screenshot proses kompilasi dan hasil eksekusi program dari setiap soal.

Screenshot yang disertakan meliputi:

- Soal 1: hasil pengujian hierarki perangkat elektronik.
- Soal 2: hasil pengujian inheritance dan polymorphism.
- Soal 3: hasil pengujian titik, garis, dan defensive copy.
- Soal 4: hasil struk belanja, perhitungan total, jumlah produk berdasarkan jenis, dan pengujian exception.

## Analisis

Berdasarkan implementasi keempat soal, konsep PBO dapat diterapkan untuk menyusun program menggunakan kelas dan objek.

- Inheritance: memungkinkan kelas turunan mewarisi atribut dan method dari kelas induk.
- Polymorphism: memungkinkan pemanggilan method yang sama menghasilkan perilaku berbeda sesuai objek yang digunakan.
- Composition: memungkinkan sebuah kelas menggunakan dan mengelola objek dari kelas lain.
- Defensive Copy: menjaga agar perubahan pada objek salinan tidak memengaruhi data internal objek asli.
- Exception Handling: membantu menangani kondisi yang tidak valid sehingga program dapat memberikan pesan kesalahan yang sesuai.

## Repository

Repository GitHub project ini:

https://github.com/febiwys/Tugas2_Inherit-polymorph-250810701100006

## Keterbatasan

Project ini merupakan implementasi praktikum untuk menerapkan konsep Pemrograman Berorientasi Objek menggunakan Java. Program dibuat berdasarkan kebutuhan masing-masing soal dan diuji melalui proses kompilasi serta eksekusi pada lingkungan pengembangan lokal.