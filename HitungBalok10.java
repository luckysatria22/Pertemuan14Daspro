import java.util.Scanner;

public class HitungBalok10 {
    
    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
    
    public static int hitungVolume(int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int panjang = sc.nextInt();
        
        System.out.print("Masukkan lebar: ");
        int lebar = sc.nextInt();
        
        System.out.print("Masukkan tinggi: ");
        int tinggi = sc.nextInt();
        
        int luasPersegiPanjang = hitungLuas(panjang, lebar);
        
        int volumeBalok = hitungVolume(panjang, lebar, tinggi);
        
        System.out.println("\nLuas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Volume Balok: " + volumeBalok);
        
        sc.close();
    }
}