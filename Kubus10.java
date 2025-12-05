import java.util.Scanner;

public class Kubus10 {
    public static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    
    public static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== PROGRAM HITUNG KUBUS =====");
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();
        
        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);
        
        System.out.println("\n===== HASIL =====");
        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        
        sc.close();
    }
} 
