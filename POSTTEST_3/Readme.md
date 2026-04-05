# Laporan Posttest 3 - Sistem Penjualan Sepatu Olahraga (Inheritance)

### **Nama: M.TEDY AZHARI**
### **NIM: 2409106003**
### **Kelas: A1'24**

---

## Deskripsi Program
### **Ini tuh program apa sihh?**
Jadi, program ini tuh gunanya buat ngatur stok sepatu olahraga.
Kita bisa nambahin data sepatu baru, ngeliat daftar sepatu yang udah ada,
trus bisa ngedit (kalo ada typo atau harga naik),
dan bisa ngehapus data kalo sepatunya udah laku terjual.
Semuanya disimpen pake **ArrayList**, jadi datanya dinamis banget!

---

## Fitur Utama
1. **Tambah Stok Sepatu**: Memasukkan data sepatu baru dengan sistem pilihan merk (1-5) dan kategori (1-3).
2. **Lihat Semua Sepatu**: Menampilkan seluruh daftar sepatu yang tersedia beserta detail harga, stok, dan kategorinya.
3. **Ubah Data Sepatu (Full Update)**: Memperbarui informasi secara total mulai dari merk, harga, stok, hingga atribut spesifik tiap jenis sepatu.
4. **Hapus Sepatu**: Menghapus data sepatu secara permanen dari daftar stok dengan menginput nomor pada tabel stok sepatu.

---

## 🆕 Update Terbaru: Konsep Inheritance (Modul 4)
Di update kali ini, programnya makin "pintar" karena sudah menerapkan **Inheritance (Pewarisan)**. Sekarang, setiap kategori sepatu punya ciri khas masing-masing yang nggak asal-asalan:

*   **Sepatu Lari**: Sekarang punya atribut **Peruntukan Jenis Lari** (Easy Run, Long Run, Recovery Run).
*   **Sepatu Bola**: Sekarang punya atribut **Jenis Pul** (FG, SG, AG) buat nentuin jenis lapangan.
*   **Sepatu Futsal**: Sekarang punya atribut **Tipe Upper** (Sintetis, Kulit Asli, Knit) buat kenyamanan kontrol bola.

Dengan konsep ini, kita pake satu induk (Superclass) yaitu `Sepatu`, lalu sifat-sifatnya diturunin ke anak-anaknya (Subclass) yaitu `SepatuLari`, `SepatuBola`, dan `SepatuFutsal`.

---

## Berikut Screenshot fitur-fitur yang ada

### 🏠 **MENU UTAMA**
Ini adalah tampilan awal buat milih fitur-fitur yang ada di program:
<div align="left">
  <img src="ssfitur/ssmenuutama.png" width="500">
</div>

### ➕ **MENU TAMBAH DATA (WITH INHERITANCE)**
Sekarang pas nambah data, kita bisa milih spesifikasi unik tiap jenis sepatu menggunakan menu angka:
<div align="left">
  <img src="ssfitur/jenislari.png" width="250">
  <img src="ssfitur/jenispul.png" width="250">
  <img src="ssfitur/jenisupper.png" width="250">
</div>

### 📋 **MENU TAMPILKAN DATA TERBARU**
Daftar stok sekarang lebih detail nampilin spek khusus tiap sepatu berkat polimorfisme:
<div align="left">
  <img src="ssfitur/tampilandatabaru.png" width="500">
</div>

### ✏️ **MENU EDIT DATA (TOTAL UPDATE)**
Kalo ada salah input, sekarang bisa edit semuanya termasuk atribut uniknya:
<div align="left">
  <img src="ssfitur/ssedit1.png" width="500">
</div>

### 🗑️ **MENU DELETE DATA**
Kalo udh ga butuh, data yang lama hapus aja:
<div align="left">
  <img src="ssfitur/sshapus1.png" width="500">
</div>

### ⚠️ **INPUT NEGATIF (VALIDASI SETTER)**
Tampilan kalo input harga negatif,
program bakal nolak dan minta input ulang:
<div align="left">
  <img src="ssfitur/ssnegatif.png" width="500">
</div>

---
*Laporan POSTTEST 3 Pemrograman Berorientasi Objek - Universitas Mulawarman.*