import java.util.Scanner;

public class HitungBalok10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int panjang = sc.nextInt();
        
        System.out.print("Masukkan lebar: ");
        int lebar = sc.nextInt();
        
        System.out.print("Masukkan tinggi: ");
        int tinggi = sc.nextInt();

        int luasPersegiPanjang = panjang * lebar;
        
        int volumeBalok = panjang * lebar * tinggi;

        System.out.println("\nLuas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Volume Balok: " + volumeBalok);
        
        sc.close();
    }
}

