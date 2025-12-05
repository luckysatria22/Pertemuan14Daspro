public class PengunjungCafe10 {
    
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("===== Daftar Pengunjung Kafe =====");
        System.out.println("Jumlah pengunjung: " + namaPengunjung.length);
        System.out.println("\nDaftar Nama:");
        
        int nomor = 1;
        for (String nama : namaPengunjung) {
            System.out.println(nomor + ". " + nama);
            nomor++;
        }
        System.out.println("==================================\n");
    }
    
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Doni", "Eka", "Fitri", "Gina");
        daftarPengunjung("Hana");
    }
}