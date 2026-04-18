package tedyyca.model;

public abstract class Sepatu implements ManajemenStok {
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

    public abstract void tampilkanDetailSpesifik();

    @Override
    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    @Override
    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        }
    }

    public void tampilkan() {
        System.out.println("Merk     : " + this.merk);
        System.out.println("Kategori : " + this.kategori.getNamaKategori());
        System.out.println("Stok     : " + this.stok);
        System.out.println("Harga    : Rp " + (int) this.harga);
        tampilkanDetailSpesifik();
    }

    public String getMerk() { return merk; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }
    public Kategori getKategori() { return kategori; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setHarga(double harga, double diskon) {
        this.harga = harga - (harga * diskon / 100);
    }
}