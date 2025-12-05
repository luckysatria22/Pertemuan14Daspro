public class PengunjungCafe10 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("===== Daftar Pengunjung Kafe =====");
        System.out.println("Jumlah pengunjung: " + namaPengunjung.length);
        System.out.println("\nDaftar Nama:");
        
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println((i + 1) + ". " + namaPengunjung[i]);
        }
        System.out.println("==================================\n");
    }
    
    public static void main(String[] args) {
        
        daftarPengunjung("Ali", "Budi", "Citra");
        
        daftarPengunjung("Doni", "Eka", "Fitri", "Gina");
        
        daftarPengunjung("Hana");
    }
}
