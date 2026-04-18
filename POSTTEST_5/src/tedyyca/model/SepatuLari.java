package tedyyca.model;

public class SepatuLari extends Sepatu {
    private String peruntukanLari;

    public SepatuLari(String merk, double harga, int stok, Kategori kategori, String peruntukanLari) {
        super(merk, harga, stok, kategori);
        this.peruntukanLari = peruntukanLari;
    }

    @Override
    public void tampilkanDetailSpesifik() {
        System.out.println("Peruntukan: " + this.peruntukanLari);
    }
}