package tedyyca.model;

public class SepatuFutsal extends Sepatu {
    private String tipeUpper;

    public SepatuFutsal(String merk, double harga, int stok, Kategori kategori, String tipeUpper) {
        super(merk, harga, stok, kategori);
        this.tipeUpper = tipeUpper;
    }

    @Override
    public void tampilkanDetailSpesifik() {
        System.out.println("Tipe Upper: " + this.tipeUpper);
    }
}