import java.util.Scanner;

public class RekapPenjualanCafe10 {
    
    public static void inputDataPenjualan(int[][] penjualan, String[] namaMenu, int jumlahHari) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===== INPUT DATA PENJUALAN =====");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("\nMenu: " + namaMenu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void tampilkanDataPenjualan(int[][] penjualan, String[] namaMenu, int jumlahHari) {
        System.out.println("\n===== DATA PENJUALAN KAFE =====");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= jumlahHari; i++) {
            System.out.print("Hari-" + i + "\t");
        }
        System.out.println();
        System.out.println("=".repeat(80));
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(namaMenu[i] + "\t");
            if (namaMenu[i].length() < 8) System.out.print("\t");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=".repeat(80));
    }
    
    public static void tampilkanMenuTertinggi(int[][] penjualan, String[] namaMenu, int jumlahHari) {
        int maxTotal = 0;
        int indexMax = 0;
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }
        
        System.out.println("\n===== MENU DENGAN PENJUALAN TERTINGGI =====");
        System.out.println("Menu: " + namaMenu[indexMax]);
        System.out.println("Total Penjualan: " + maxTotal);
    }
    
    public static void tampilkanRataRata(int[][] penjualan, String[] namaMenu, int jumlahHari) {
        System.out.println("\n===== RATA-RATA PENJUALAN SETIAP MENU =====");
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / jumlahHari;
            System.out.printf("%s: %.2f\n", namaMenu[i], rataRata);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine(); 
        String[] namaMenu = new String[jumlahMenu];
        System.out.println("\n===== INPUT NAMA MENU =====");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }
        
        int[][] penjualan = new int[jumlahMenu][jumlahHari];
        tampilkanDataPenjualan(penjualan, namaMenu, jumlahHari);
        tampilkanMenuTertinggi(penjualan, namaMenu, jumlahHari);
        tampilkanRataRata(penjualan, namaMenu, jumlahHari);
        
        sc.close();
    }
}
