class Sepatu {
    String merk;
    double harga;
    int stok;
    Kategori kategori; // Relasi antar class untuk poin nilai tambah

    // Sesuai modul: Constructor dengan 4 argumen [cite: 147]
    Sepatu(String merk, double harga, int stok, Kategori kategori) {
        this.merk = merk;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    // Sesuai modul: Method tanpa nilai kembalian (void) [cite: 43, 44]
    void tampilkan() {
        System.out.println("Merk: " + merk + " | Harga: " + harga + " | Stok: " + stok + " | Kat: " + kategori.namaKategori);
    }
}