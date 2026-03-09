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
        System.out.println("1. Tambah Sepatu");
        System.out.println("2. Lihat Semua Sepatu");
        System.out.println("3. Ubah Data Sepatu");
        System.out.println("4. Hapus Sepatu ");
        System.out.println("5. Keluar Program");
        System.out.println("=======================================");
        System.out.print("Pilih Menu: ");
        pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.println("\n=======================================");
                System.out.println("          PILIH MERK SEPATU          ");
                System.out.println("=======================================");
                System.out.println("1. Adidas\n2. Nike\n3. Puma\n4. Ortuseight\n5. Specs");
                System.out.println("=======================================");
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

                System.out.println("\n=======================================");
                System.out.println("          PILIH KATEGORI             ");
                System.out.println("=======================================");
                System.out.println("1. Running\n2. Football\n3. Futsal");
                System.out.println("=======================================");
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
                System.out.println("Produk Sepatu " + m + " berhasil ditambahkan!");
            }
            case 2 -> {
                System.out.println("\n=======================================");
                System.out.println("          DAFTAR STOK SEPATU         ");
                System.out.println("=======================================");
                if (dataSepatu.isEmpty()) {
                    System.out.println("Sepatu kosong.");
                } else {
                    for (int i = 0; i < dataSepatu.size(); i++) {
                        dataSepatu.get(i).tampilkan(i + 1);
                    }
                }
                System.out.println("=======================================");
            }
            case 3 -> {
                if (dataSepatu.isEmpty()) {
                    System.out.println("Daftar kosong, tidak ada data untuk diubah.");
                } else {
                    System.out.println("\n=======================================");
                    System.out.println("       PILIH DATA UNTUK DIUBAH       ");
                    System.out.println("=======================================");
                    for (int i = 0; i < dataSepatu.size(); i++) {
                        dataSepatu.get(i).tampilkan(i + 1);
                    }
                    System.out.println("=======================================");
                    System.out.print("Pilih nomor data yang ingin diubah: ");
                    int idx = sc.nextInt() - 1;
                    sc.nextLine(); // Membersihkan buffer

                    if (idx >= 0 && idx < dataSepatu.size()) {
                        // Proses Input Data Baru
                        System.out.println("\n--- Masukkan Data Baru ---");
                        System.out.println("1. Adidas\n2. Nike\n3. Puma\n4. Ortuseight\n5. Specs");
                        System.out.print("Pilih Merk Baru (1-5): ");
                        int pilihanMerk = sc.nextInt();

                        String m = "";
                        if (pilihanMerk == 1) m = "Adidas";
                        else if (pilihanMerk == 2) m = "Nike";
                        else if (pilihanMerk == 3) m = "Puma";
                        else if (pilihanMerk == 4) m = "Ortuseight";
                        else if (pilihanMerk == 5) m = "Specs";

                        System.out.println("1. Running\n2. Football\n3. Futsal");
                        System.out.print("Pilih Kategori Baru (1-3): ");
                        int pilihanKategori = sc.nextInt();

                        String k = "";
                        if (pilihanKategori == 1) k = "Running";
                        else if (pilihanKategori == 2) k = "Football";
                        else if (pilihanKategori == 3) k = "Futsal";

                        if (m.equals("") || k.equals("")) {
                            System.out.println("Input tidak valid, perubahan dibatalkan!");
                        } else {
                            System.out.print("Masukkan Harga Baru: "); double h = sc.nextDouble();
                            System.out.print("Masukkan Stok Baru : "); int s = sc.nextInt();
                            sc.nextLine();


                            Sepatu spt = dataSepatu.get(idx);
                            spt.merk = m;
                            spt.kategori.namaKategori = k;
                            spt.harga = h;
                            spt.stok = s;

                            System.out.println("Data nomor " + (idx + 1) + " berhasil diperbarui!");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                }
            }
            case 4 -> {
                if (dataSepatu.isEmpty()) {
                    System.out.println("Daftar kosong, tidak ada data untuk dihapus.");
                } else {
                    System.out.println("\n=======================================");
                    System.out.println("      PILIH DATA UNTUK DIHAPUS       ");
                    System.out.println("=======================================");
                    for (int i = 0; i < dataSepatu.size(); i++) {
                        dataSepatu.get(i).tampilkan(i + 1);
                    }
                    System.out.println("=======================================");
                    System.out.print("Pilih nomor data yang ingin dihapus: ");
                    int idx = sc.nextInt() - 1;
                    if (idx >= 0 && idx < dataSepatu.size()) {
                        dataSepatu.remove(idx);
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                }
            }
            case 5 -> System.out.println("Keluar dari program. Terima kasih!");
            default -> System.out.println("Pilihan tidak valid!");
        }
    } while (pilihan != 5);
}