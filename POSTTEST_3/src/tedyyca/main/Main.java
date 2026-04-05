package tedyyca.main;

import tedyyca.model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sepatu> dataSepatu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=======================================");
            System.out.println("  SISTEM PENJUALAN SEPATU OLAHRAGA ");
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
                    System.out.println("\n--- Pilih Merk ---");
                    System.out.println("1. Adidas\n2. Nike\n3. Puma\n4. Ortuseight\n5. Specs");
                    System.out.print("Pilih (1-5): ");
                    int pMerk = sc.nextInt();
                    String m = switch(pMerk) {
                        case 1 -> "Adidas"; case 2 -> "Nike"; case 3 -> "Puma";
                        case 4 -> "Ortuseight"; case 5 -> "Specs"; default -> "";
                    };
                    if (m.isEmpty()) break;

                    System.out.println("\n--- Pilih Kategori ---");
                    System.out.println("1. Running\n2. Football\n3. Futsal");
                    System.out.print("Pilih (1-3): ");
                    int pKat = sc.nextInt();

                    double h;
                    while (true) {
                        System.out.print("Masukkan Harga: "); h = sc.nextDouble();
                        if (h >= 0) break;
                    }
                    int s;
                    while (true) {
                        System.out.print("Masukkan Stok: "); s = sc.nextInt();
                        if (s >= 0) break;
                    }
                    sc.nextLine();

                    if (pKat == 1) {
                        System.out.println("\n--- Peruntukan Jenis Lari ---");
                        System.out.println("1. Easy Run\n2. Long Run\n3. Recovery Run");
                        System.out.print("Pilih (1-3): ");
                        int pLari = sc.nextInt(); sc.nextLine();
                        String jenis = switch(pLari) {
                            case 1 -> "Easy Run"; case 2 -> "Long Run";
                            case 3 -> "Recovery Run"; default -> "General Run";
                        };
                        dataSepatu.add(new SepatuLari(m, h, s, new Kategori("Running"), jenis));
                    } else if (pKat == 2) {
                        System.out.println("\n--- Pilih Jenis Pul ---");
                        System.out.println("1. FG\n2. SG\n3. AG");
                        System.out.print("Pilih (1-3): ");
                        int pPul = sc.nextInt(); sc.nextLine();
                        String pul = switch(pPul) {
                            case 1 -> "FG"; case 2 -> "SG"; case 3 -> "AG"; default -> "FG";
                        };
                        dataSepatu.add(new SepatuBola(m, h, s, new Kategori("Football"), pul));
                    } else if (pKat == 3) {
                        System.out.println("\n--- Pilih Tipe Upper ---");
                        System.out.println("1. Sintetis\n2. Kulit Asli\n3. Knit/Rajut");
                        System.out.print("Pilih (1-3): ");
                        int pUpper = sc.nextInt(); sc.nextLine();
                        String upper = switch(pUpper) {
                            case 1 -> "Sintetis"; case 2 -> "Kulit Asli"; case 3 -> "Knit/Rajut"; default -> "Sintetis";
                        };
                        dataSepatu.add(new SepatuFutsal(m, h, s, new Kategori("Futsal"), upper));
                    }
                }
                case 2 -> {
                    if (dataSepatu.isEmpty()) { System.out.println("Kosong."); }
                    else {
                        for (int i = 0; i < dataSepatu.size(); i++) {
                            System.out.println("\nNomor: " + (i + 1));
                            dataSepatu.get(i).tampilkan();
                        }
                    }
                }
                case 3 -> {
                    if (dataSepatu.isEmpty()) break;
                    System.out.print("Pilih nomor data yang ingin diubah total: ");
                    int idx = sc.nextInt() - 1;
                    if (idx >= 0 && idx < dataSepatu.size()) {
                        Sepatu sInput = dataSepatu.get(idx);

                        System.out.print("Merk Baru: "); sc.nextLine();
                        sInput.setMerk(sc.nextLine());
                        System.out.print("Harga Baru: "); sInput.setHarga(sc.nextDouble());
                        System.out.print("Stok Baru: "); sInput.setStok(sc.nextInt());

                        if (sInput instanceof SepatuLari lari) {
                            System.out.println("1. Easy Run\n2. Long Run\n3. Recovery Run");
                            System.out.print("Pilih Peruntukan Baru: ");
                            int p = sc.nextInt();
                            lari.setPeruntukanLari(p == 1 ? "Easy Run" : p == 2 ? "Long Run" : "Recovery Run");
                        } else if (sInput instanceof SepatuBola bola) {
                            System.out.println("1. FG\n2. SG\n3. AG");
                            System.out.print("Pilih Pul Baru: ");
                            int p = sc.nextInt();
                            bola.setJenisPul(p == 1 ? "FG" : p == 2 ? "SG" : "AG");
                        } else if (sInput instanceof SepatuFutsal futsal) {
                            System.out.println("1. Sintetis\n2. Kulit Asli\n3. Knit/Rajut");
                            System.out.print("Pilih Upper Baru: ");
                            int p = sc.nextInt();
                            futsal.setTipeUpper(p == 1 ? "Sintetis" : p == 2 ? "Kulit Asli" : "Knit/Rajut");
                        }
                        System.out.println("Data berhasil diupdate sepenuhnya!");
                    }
                }
                case 4 -> {
                    System.out.print("Nomor hapus: ");
                    int idx = sc.nextInt() - 1;
                    if (idx >= 0 && idx < dataSepatu.size()) dataSepatu.remove(idx);
                }
                case 5 -> System.out.println("Keluar...");
            }
        } while (pilihan != 5);
    }
}