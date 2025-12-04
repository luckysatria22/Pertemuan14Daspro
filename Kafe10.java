import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Kafe10 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member. Dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo != null) {
            if (kodePromo.equals("DISKON50")) {
                System.out.println("Kode promo berlaku: DISKON50. Anda mendapatkan diskon 50%!");
            } else if (kodePromo.equals("DISKON30")) {
                System.out.println("Kode promo berlaku: DISKON30. Anda mendapatkan diskon 30%!");
            } else {
                System.out.println("Kode promo invalid.");
            }
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 10,000");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Menu("Budi", true, "DISKON30");

        System.out.print("\nMasukkan pilihan menu yang ingin dipesan (pisahkan dengan koma, mis. 1,3,5): ");
        String linePilihan = sc.nextLine();
        String[] parts = linePilihan.split(",");

        List<Integer> pilihanList = new ArrayList<>();
        List<Integer> banyakList = new ArrayList<>();

        for (String p : parts) {
            p = p.trim();
            if (p.isEmpty()) continue;
            try {
                int pilihan = Integer.parseInt(p);
                if (pilihan < 1 || pilihan > 6) {
                    System.out.println("Pilihan menu '" + pilihan + "' tidak valid dan akan diabaikan.");
                    continue;
                }
                System.out.print("Masukkan banyak item untuk menu " + pilihan + ": ");
                int qty = 0;
                try {
                    qty = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException nfe) {
                    System.out.println("Jumlah tidak valid. Menggunakan 0 untuk menu " + pilihan + ".");
                    qty = 0;
                }
                if (qty > 0) {
                    pilihanList.add(pilihan);
                    banyakList.add(qty);
                } else {
                    System.out.println("Jumlah 0, menu " + pilihan + " diabaikan.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input '" + p + "' bukan angka. Diabaikan.");
            }
        }

        if (pilihanList.isEmpty()) {
            System.out.println("Tidak ada pesanan. Program selesai.");
            sc.close();
            return;
        }

        System.out.print("Masukkan kode promo (ketik ENTER jika tidak ada): ");
        String kodePromo = sc.nextLine();
        if (kodePromo != null && kodePromo.trim().isEmpty()) {
            kodePromo = null;
        }

        // Convert lists to arrays
        int[] pilihanArr = new int[pilihanList.size()];
        int[] banyakArr = new int[banyakList.size()];
        for (int i = 0; i < pilihanList.size(); i++) {
            pilihanArr[i] = pilihanList.get(i);
            banyakArr[i] = banyakList.get(i);
        }

        int totalBayar = hitungTotalHargaNoAbsen(pilihanArr, banyakArr, kodePromo);

        System.out.println("\nTotal keseluruhan yang harus dibayar: Rp " + totalBayar);

        sc.close();
    }

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 10000};
        if (pilihanMenu < 1 || pilihanMenu > hargaMenu.length) {
            System.out.println("Pilihan menu tidak valid. Mengembalikan 0.");
            return 0;
        }

        int hargaSatuan = hargaMenu[pilihanMenu - 1];
        int totalHarga = hargaSatuan * banyakItem;

        if (kodePromo != null) {
            if (kodePromo.equals("DISKON50")) {
                int diskon = (int) (totalHarga * 0.50);
                System.out.println("Kode promo berlaku: DISKON50. Diskon: Rp " + diskon);
                return totalHarga - diskon;
            } else if (kodePromo.equals("DISKON30")) {
                int diskon = (int) (totalHarga * 0.30);
                System.out.println("Kode promo berlaku: DISKON30. Diskon: Rp " + diskon);
                return totalHarga - diskon;
            } else {
                System.out.println("Kode promo invalid.");
                return totalHarga;
            }
        } else {
            System.out.println("Kode promo invalid.");
            return totalHarga;
        }
    }

    // Overloaded method: hitung untuk banyak pilihan sekaligus dan terapkan kode promo pada total keseluruhan
    public static int hitungTotalHargaNoAbsen(int[] pilihanMenus, int[] banyakItems, String kodePromo) {
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 10000};
        if (pilihanMenus == null || banyakItems == null || pilihanMenus.length != banyakItems.length) {
            System.out.println("Data pesanan tidak valid.");
            return 0;
        }

        int subtotal = 0;
        for (int i = 0; i < pilihanMenus.length; i++) {
            int pilihan = pilihanMenus[i];
            int qty = banyakItems[i];
            if (pilihan < 1 || pilihan > hargaMenu.length) {
                System.out.println("Pilihan menu " + pilihan + " tidak valid. Dilewati.");
                continue;
            }
            int hargaSatuan = hargaMenu[pilihan - 1];
            int totalUntukItem = hargaSatuan * qty;
            System.out.println("Menu " + pilihan + " x" + qty + " = Rp " + totalUntukItem);
            subtotal += totalUntukItem;
        }

        System.out.println("Subtotal: Rp " + subtotal);

        if (kodePromo != null) {
            if (kodePromo.equals("DISKON50")) {
                int diskon = (int) (subtotal * 0.50);
                System.out.println("Kode promo berlaku: DISKON50. Diskon: Rp " + diskon);
                return subtotal - diskon;
            } else if (kodePromo.equals("DISKON30")) {
                int diskon = (int) (subtotal * 0.30);
                System.out.println("Kode promo berlaku: DISKON30. Diskon: Rp " + diskon);
                return subtotal - diskon;
            } else {
                System.out.println("Kode promo invalid. Tidak ada pengurangan harga.");
                return subtotal;
            }
        } else {
            System.out.println("Kode promo invalid. Tidak ada pengurangan harga.");
            return subtotal;
        }
    }
}
