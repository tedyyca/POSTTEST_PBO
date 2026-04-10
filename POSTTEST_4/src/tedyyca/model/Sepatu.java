package tedyyca.model;

public class Sepatu {
    private String merk;
    private double harga;
    private int stok;
    protected Kategori kategori;

    public Sepatu(String merk, double harga, int stok, Kategori kategori) {
        this.merk = merk;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    // Overloading 1
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Overloading 2
    public void setHarga(double harga, double diskon) {
        this.harga = harga - (harga * diskon / 100);
    }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    // Override Base
    public void tampilkan() {
        System.out.println("Merk     : " + this.merk);
        System.out.println("Kategori : " + this.kategori.getNamaKategori());
        System.out.println("Stok     : " + this.stok);
        System.out.println("Harga    : Rp " + (int) this.harga);
    }
}