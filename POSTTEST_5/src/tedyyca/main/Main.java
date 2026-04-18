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
            System.out.println("3. Ubah Data Sepatu (Diskon/Normal)");
            System.out.println("4. Hapus Sepatu");
            System.out.println("5. Keluar");
            System.out.println("=======================================");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1 -> {
                    System.out.println("\n--- Input Data Sepatu ---");
                    String m = "";
                    while (true) {
                        System.out.println("Pilih Merk:");
                        System.out.println("1. Adidas\n2. Nike\n3. Puma\n4. Ortuseight\n5. Specs");
                        System.out.print("Pilih (1-5): ");
                        int pMerk = sc.nextInt();
                        m = switch(pMerk) {
                            case 1 -> "Adidas";
                            case 2 -> "Nike";
                            case 3 -> "Puma";
                            case 4 -> "Ortuseight";
                            case 5 -> "Specs";
                            default -> "";
                        };
                        if (!m.isEmpty()) break;
                        System.out.println("[!] Merk tidak tersedia.");
                    }

                    int pKat;
                    while (true) {
                        System.out.println("\nPilih Kategori:");
                        System.out.println("1. Running\n2. Football\n3. Futsal");
                        System.out.print("Pilih (1-3): ");
                        pKat = sc.nextInt();
                        if (pKat >= 1 && pKat <= 3) break;
                        System.out.println("[!] Kategori tidak tersedia.");
                    }

                    System.out.print("Harga Dasar: "); double h = sc.nextDouble();
                    System.out.print("Stok: "); int s = sc.nextInt();

                    if (pKat == 1) {
                        int pLari;
                        while (true) {
                            System.out.println("\n--- Peruntukan Jenis Lari ---");
                            System.out.println("1. Easy Run\n2. Long Run\n3. Recovery Run");
                            System.out.print("Pilih (1-3): ");
                            pLari = sc.nextInt();
                            if (pLari >= 1 && pLari <= 3) break;
                        }
                        String jenis = (pLari == 1) ? "Easy Run" : (pLari == 2) ? "Long Run" : "Recovery Run";
                        dataSepatu.add(new SepatuLari(m, h, s, new Kategori("Running"), jenis));
                    } else if (pKat == 2) {
                        int pPul;
                        while (true) {
                            System.out.println("\n--- Pilih Jenis Pul ---");
                            System.out.println("1. FG\n2. SG\n3. AG");
                            System.out.print("Pilih (1-3): ");
                            pPul = sc.nextInt();
                            if (pPul >= 1 && pPul <= 3) break;
                        }
                        String pul = (pPul == 1) ? "FG" : (pPul == 2) ? "SG" : "AG";
                        dataSepatu.add(new SepatuBola(m, h, s, new Kategori("Football"), pul));
                    } else if (pKat == 3) {
                        int pUpper;
                        while (true) {
                            System.out.println("\n--- Pilih Tipe Upper ---");
                            System.out.println("1. Sintetis\n2. Kulit Asli\n3. Knit/Rajut");
                            System.out.print("Pilih (1-3): ");
                            pUpper = sc.nextInt();
                            if (pUpper >= 1 && pUpper <= 3) break;
                        }
                        String upper = (pUpper == 1) ? "Sintetis" : (pUpper == 2) ? "Kulit Asli" : "Knit/Rajut";
                        dataSepatu.add(new SepatuFutsal(m, h, s, new Kategori("Futsal"), upper));
                    }
                    System.out.println("\n[√] Berhasil!");
                }
                case 2 -> {
                    if (dataSepatu.isEmpty()) {
                        System.out.println("\n[!] Belum ada sepatu.");
                    } else {
                        for (int i = 0; i < dataSepatu.size(); i++) {
                            System.out.println("\nNomor: " + (i + 1));
                            dataSepatu.get(i).tampilkan();
                        }
                    }
                }
                case 3 -> {
                    if (dataSepatu.isEmpty()) {
                        System.out.println("\n[!] Belum ada sepatu.");
                    } else {
                        for (int i = 0; i < dataSepatu.size(); i++) {
                            System.out.println((i + 1) + ". " + dataSepatu.get(i).getMerk() + " [" + dataSepatu.get(i).getKategori().getNamaKategori() + "]");
                        }
                        System.out.print("\nPilih nomor: ");
                        int idx = sc.nextInt() - 1;
                        if (idx >= 0 && idx < dataSepatu.size()) {
                            System.out.println("\n1. Normal\n2. Diskon");
                            int pUp = sc.nextInt();
                            if (pUp == 1) {
                                System.out.print("Harga Baru: ");
                                dataSepatu.get(idx).setHarga(sc.nextDouble());
                            } else {
                                System.out.print("Harga Dasar: "); double hD = sc.nextDouble();
                                System.out.print("Diskon (%): "); double d = sc.nextDouble();
                                dataSepatu.get(idx).setHarga(hD, d);
                            }
                        }
                    }
                }
                case 4 -> {
                    if (dataSepatu.isEmpty()) {
                        System.out.println("\n[!] Belum ada sepatu.");
                    } else {
                        for (int i = 0; i < dataSepatu.size(); i++) {
                            System.out.println((i + 1) + ". " + dataSepatu.get(i).getMerk() + " [" + dataSepatu.get(i).getKategori().getNamaKategori() + "]");
                        }
                        System.out.print("\nHapus nomor: ");
                        int idx = sc.nextInt() - 1;
                        if (idx >= 0 && idx < dataSepatu.size()) dataSepatu.remove(idx);
                    }
                }
            }
        } while (pilihan != 5);
    }
}