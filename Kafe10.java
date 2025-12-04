import java.util.Scanner;

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
       
        System.out.print("\nMasukkan pilihan menu (1-6): ");
        int pilihanMenu = sc.nextInt();
        
        System.out.print("Masukkan banyak item: ");
        int banyakItem = sc.nextInt();
    
        int totalBayar = hitungTotalHarga(pilihanMenu, banyakItem);
      
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        
        sc.close();
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaMenu = {15000, 20000, 22000, 12000, 18000};
        int hargaSatuan = hargaMenu[pilihanMenu - 1];
        int totalHarga = hargaSatuan * banyakItem;
        return totalHarga;
    }
}
