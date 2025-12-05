import java.util.Scanner;

public class RekapPenjualanCafe10 {
    
    public static void inputDataPenjualan(int[][] penjualan, String[] namaMenu) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== INPUT DATA PENJUALAN =====");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("\nMenu: " + namaMenu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void tampilkanDataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== DATA PENJUALAN KAFE =====");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Hari-" + i + "\t");
        }
        System.out.println();
        System.out.println("=".repeat(80));
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(namaMenu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=".repeat(80));
    }
    
    public static void tampilkanMenuTertinggi(int[][] penjualan, String[] namaMenu) {
        int maxTotal = 0;
        int indexMax = 0;
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
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
    
    public static void tampilkanRataRata(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== RATA-RATA PENJUALAN SETIAP MENU =====");
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println(namaMenu[i] + ": " + rataRata);
        }
    }
    
    public static void main(String[] args) {
        String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] penjualan = new int[5][7]; 
        inputDataPenjualan(penjualan, namaMenu);
        tampilkanDataPenjualan(penjualan, namaMenu);
        tampilkanMenuTertinggi(penjualan, namaMenu);
        tampilkanRataRata(penjualan, namaMenu);
    }
}
