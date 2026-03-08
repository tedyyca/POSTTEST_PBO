class Sepatu {
    String merk;
    double harga;
    int stok;
    Kategori kategori;

    Sepatu(String merk, double harga, int stok, Kategori kategori) {
        this.merk = merk;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    void tampilkan(int no) {

        System.out.println("Nomor    : " + no);
        System.out.println("Merk     : " + merk);
        System.out.println("Kategori : " + kategori.namaKategori);
        System.out.println("Stok     : " + stok);
        System.out.println("Harga    : Rp " + (int) harga);
        System.out.println("---------------------------------------");
    }
}