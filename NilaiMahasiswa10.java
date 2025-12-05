import java.util.Scanner;

public class NilaiMahasiswa10 {
    public static void isianArray(int[] arrayNilai, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== INPUT NILAI MAHASISWA =====");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = sc.nextInt();
        }
    }
    
    public static void tampilArray(int[] arrayNilai) {
        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }
    
    public static int hitTot(int[] arrayNilai) {
        int total = 0;
        for (int i = 0; i < arrayNilai.length; i++) {
            total += arrayNilai[i];
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== PROGRAM NILAI MAHASISWA =====");
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[n];
        
        isianArray(nilaiMahasiswa, n);
        
        tampilArray(nilaiMahasiswa);
        
        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\n===== HASIL =====");
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        System.out.println("Rata-rata nilai: " + (totalNilai / n));
        
        sc.close();
    }
}
