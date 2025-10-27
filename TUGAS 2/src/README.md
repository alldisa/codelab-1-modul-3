# 🐾 Sistem Pemesanan Penitipan Hewan

Program ini merupakan implementasi dari **Sistem Pemesanan Penitipan Hewan** yang menggunakan prinsip **Pemrograman Berorientasi Objek (OOP)** dalam bahasa **Java**.  
Aplikasi ini memungkinkan pengguna untuk memasukkan data pemilik hewan, jenis hewan, lama penitipan, serta harga per hari. Program kemudian menghitung total biaya, memberikan potongan harga otomatis (diskon) jika memenuhi syarat, dan menampilkan nota hasil pemesanan.

---

## 🎯 Tujuan Program
Tujuan dari program ini adalah untuk mempermudah proses pengelolaan penitipan hewan, khususnya dalam menghitung total biaya secara otomatis dan memberikan informasi yang rapi kepada pelanggan.  
Selain itu, program ini juga menunjukkan implementasi konsep **OOP**, **JavaDoc documentation**, dan **struktur modular** dalam pemrograman Java.

---

## 🧱 Struktur Program
Program ini terdiri dari **tiga kelas utama**:

### 1. `Main.java`
- Menjadi titik awal eksekusi program.
- Mengambil input dari pengguna (nama pemilik, jenis hewan, lama penitipan, dan harga per hari).
- Membuat objek dari kelas `Pet` dan `Booking`.
- Memanggil method `displayInfo()` untuk menampilkan hasil pemesanan.

### 2. `Pet.java`
- Bertanggung jawab menyimpan data hewan dan pemiliknya.
- Menggunakan konsep **Encapsulation** dengan field `private` dan method `getter`.
- Atribut yang dimiliki:
    - `ownerName` → Nama pemilik
    - `petType` → Jenis hewan
    - `days` → Lama penitipan (hari)
    - `dailyRate` → Biaya penitipan per hari

### 3. `Booking.java`
- Mengelola proses perhitungan total biaya penitipan.
- Menghitung **diskon otomatis** jika total biaya lebih dari Rp200.000.
- Menampilkan detail pemesanan hewan (nota).
- Menggunakan prinsip **modular design** dan **constant variable** untuk menghindari magic number.

---

## 💻 Cuplikan Kode Utama
Contoh kode dari kelas `Booking.java`:

```java
public double calculateDiscount() {
    double total = calculateTotal();
    return total > 200000 ? total * DISCOUNT_RATE : 0;
}
