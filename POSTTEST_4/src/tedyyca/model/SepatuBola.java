package tedyyca.model;

public class SepatuBola extends Sepatu {
    private String jenisPul;

    public SepatuBola(String merk, double harga, int stok, Kategori kategori, String jenisPul) {
        super(merk, harga, stok, kategori);
        this.jenisPul = jenisPul;
    }

    public String getJenisPul() { return jenisPul; }
    public void setJenisPul(String jenisPul) { this.jenisPul = jenisPul; }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println("Jenis Pul: " + this.jenisPul);
    }
}