import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<Sepatu> dataSepatu = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int pilihan;

    do {
        System.out.println("\n=======================================");
        System.out.println("  SISTEM PENJUALAN SEPATU OLAHRAGA  ");
        System.out.println("=======================================");
        System.out.println("1. Tambah Stok ");
        System.out.println("2. Lihat Semua Sepatu ");
        System.out.println("3. Ubah Data Sepatu ");
        System.out.println("4. Hapus Sepatu ");
        System.out.println("5. Keluar Program");
        System.out.print("Pilih Menu: ");
        pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.println("\n--- Pilih Merk Sepatu ---");
                System.out.println("1. Adidas\n2. Nike\n3. Puma\n4. Ortuseight\n5. Specs");
                System.out.print("Pilih (1-5): ");
                int pilihanMerk = sc.nextInt();

                String m = "";
                if (pilihanMerk == 1) m = "Adidas";
                else if (pilihanMerk == 2) m = "Nike";
                else if (pilihanMerk == 3) m = "Puma";
                else if (pilihanMerk == 4) m = "Ortuseight";
                else if (pilihanMerk == 5) m = "Specs";

                if (m.equals("")) {
                    System.out.println("Pilihan tidak valid!");
                    break;
                }

                System.out.println("\n--- Pilih Kategori ---");
                System.out.println("1. Running\n2. Football\n3. Futsal");
                System.out.print("Pilih (1-3): ");
                int pilihanKategori = sc.nextInt();

                String k = "";
                if (pilihanKategori == 1) k = "Running";
                else if (pilihanKategori == 2) k = "Football";
                else if (pilihanKategori == 3) k = "Futsal";

                if (k.equals("")) {
                    System.out.println("Pilihan tidak valid!");
                    break;
                }

                System.out.print("Masukkan Harga: "); double h = sc.nextDouble();
                System.out.print("Masukkan Stok: "); int s = sc.nextInt();
                sc.nextLine();

                dataSepatu.add(new Sepatu(m, h, s, new Kategori(k)));
                System.out.println("Data " + m + " berhasil ditambahkan!");
            }
            case 2 -> {
                System.out.println("\n--- DAFTAR STOK SEPATU ---");
                if (dataSepatu.isEmpty()) {
                    System.out.println("Stok kosong.");
                } else {
                    for (int i = 0; i < dataSepatu.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        dataSepatu.get(i).tampilkan();
                    }
                }
            }
            case 3 -> {
                System.out.print("Pilih nomor data yang ingin diubah harganya: ");
                int idx = sc.nextInt() - 1;
                if (idx >= 0 && idx < dataSepatu.size()) {
                    System.out.print("Masukkan Harga Baru: ");
                    dataSepatu.get(idx).harga = sc.nextDouble();
                    System.out.println("Harga berhasil diperbarui!");
                } else {
                    System.out.println("Pilihan tidak valid!");
                }
            }
            case 4 -> {
                System.out.print("Pilih nomor data yang ingin dihapus: ");
                int idx = sc.nextInt() - 1;
                if (idx >= 0 && idx < dataSepatu.size()) {
                    dataSepatu.remove(idx);
                    System.out.println("Data berhasil dihapus!");
                } else {
                    System.out.println("Pilihan tidak valid!");
                }
            }
            case 5 -> System.out.println("Keluar dari program. Terima kasih!");
            default -> System.out.println("Pilihan tidak valid!");
        }
    } while (pilihan != 5);
}