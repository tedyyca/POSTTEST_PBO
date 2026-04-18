package tedyyca.model;

public class SepatuBola extends Sepatu {
    private String jenisPul;

    public SepatuBola(String merk, double harga, int stok, Kategori kategori, String jenisPul) {
        super(merk, harga, stok, kategori);
        this.jenisPul = jenisPul;
    }

    @Override
    public void tampilkanDetailSpesifik() {
        System.out.println("Jenis Pul : " + this.jenisPul);
    }
}