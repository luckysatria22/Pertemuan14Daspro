Percobaan 1
1. Tidak, fungsi tanpa parameter tidak selalu harus bertipe void.
Fungsi tanpa parameter bisa memiliki tipe kembalian apa saja (int, double, String, boolean, dll.) selama fungsi tersebut mengembalikan nilai dengan statement return.
2. Ya, bisa ditampilkan langsung tanpa fungsi.
3. Dapat digunakan ulang, mudah dipelihara, dan mudah dibaca.
4. Alur Eksekusi Program:
```
1. Program dijalankan (java KafeNoAbsen)
   ↓
2. JVM mencari dan menjalankan fungsi main()
   ↓
3. Di dalam main(), ditemukan pemanggilan Menu()
   ↓
4. Eksekusi berpindah ke fungsi Menu()
   ↓
5. Fungsi Menu() mengeksekusi baris per baris:
   - System.out.println("===== MENU KAFE =====");
   - System.out.println("1. Kopi Hitam - Rp 15.000");
   - System.out.println("2. Cappuccino - Rp 20.000");
   - ... dan seterusnya
   ↓
6. Daftar menu ditampilkan di layar (console)
   ↓
7. Fungsi Menu() selesai dieksekusi
   ↓
8. Kontrol kembali ke fungsi main() (baris setelah Menu())
   ↓
9. Jika tidak ada perintah lain, program selesai
```

Percobaan 2
1. Menerima input/data dari pemanggil fungsi, membuat fungsi lebih fleksibel dan dinamis, menghindari penggunaan variabel global, dan Meningkatkan reusability.
2. 
```
1. Parameter namaPelanggan (String):
    - Untuk personalisasi tampilan menu
    - Menampilkan sapaan dengan nama pelanggan yang spesifik
    - Membuat pengalaman pelanggan lebih personal dan ramah
Contoh: "Selamat datang, Budi!" lebih personal daripada "Selamat datang!"
2. Parameter isMember (boolean):
    - Untuk menentukan status keanggotaan pelanggan
    - Menampilkan informasi diskon atau benefit khusus member
    - Memberikan perlakuan berbeda antara member dan non-member
```
3. Ya, parameter pada dasarnya adalah jenis khusus dari variabel. Keduanya memiliki persamaan yaitu sama-sama menyimpan data, memiliki tipe data, memiliki nama/identifier, dan memiliki scope (ruang lingkup).
Namun, parameter dan variabel lokal memiliki perbedaan penting. Parameter didefinisikan di dalam tanda kurung fungsi, sedangkan variabel lokal didefinisikan di dalam body fungsi. Parameter mendapatkan nilainya dari argumen saat fungsi dipanggil, sementara variabel lokal mendapatkan nilainya melalui deklarasi atau assignment di dalam fungsi. Tujuan parameter adalah untuk menerima data dari luar fungsi, sedangkan variabel lokal digunakan untuk menyimpan data keperluan internal fungsi. Scope parameter berlaku di seluruh body fungsi, sedangkan variabel lokal berlaku dari titik deklarasi hingga akhir block.
4. Cara kerja parameter isMember:
Parameter isMember bertipe boolean yang menyimpan dua kemungkinan nilai: true atau false. Parameter ini digunakan dalam struktur kondisional (if-else) untuk menentukan output yang berbeda.
5. Program akan ERROR saat kompilasi (Compile-time Error).
6. Done.
7. Done.
8. Ya, penggunaan parameter membuat program lebih baik.

Percobaan 3
1. Kapan Fungsi Membutuhkan Return Value:
Fungsi membutuhkan nilai kembalian (return value) ketika fungsi tersebut melakukan perhitungan atau pemrosesan data yang hasilnya akan digunakan oleh bagian program lain. Fungsi yang mengembalikan nilai harus memiliki tipe data (int, double, String, boolean, dll.) sesuai dengan nilai yang dikembalikan.
Contoh dari program kafe - PERLU return value:
```
public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
    int[] hargaMenu = {15000, 20000, 22000, 12000, 18000};
    int hargaSatuan = hargaMenu[pilihanMenu - 1];
    int totalHarga = hargaSatuan * banyakItem;
    return totalHarga;  
}

int totalBayar = hitungTotalHarga(2, 3);  
System.out.println("Total: Rp " + totalBayar);
```
Fungsi ini HARUS mengembalikan nilai karena hasil perhitungan total harga akan digunakan untuk ditampilkan atau diproses lebih lanjut.
Kapan Fungsi Tidak Perlu Return Value (void):
Fungsi tidak perlu mengembalikan nilai ketika tugasnya hanya untuk menampilkan informasi atau melakukan aksi tanpa perlu memberikan hasil ke pemanggil fungsi.
Contoh dari program kafe - TIDAK PERLU return value:
```
public static void Menu(String namaPelanggan, boolean isMember) {
    System.out.println("===== MENU KAFE =====");
    System.out.println("Selamat datang, " + namaPelanggan + "!");
    System.out.println("1. Kopi Hitam - Rp 15.000");
}

Menu("Budi", true);  
```
Fungsi ini bertipe void karena hanya menampilkan menu ke layar, tidak perlu mengembalikan nilai apa pun.
2. Tipe Data Nilai Kembalian: int
Fungsi mengembalikan nilai bertipe int karena total harga dalam Rupiah merupakan bilangan bulat.
Dua Parameter yang Digunakan:
```
1. Parameter pilihanMenu (tipe data: int)

Menyimpan nomor menu yang dipilih oleh pelanggan (nilai 1-5)
Digunakan sebagai indeks untuk mengakses harga di array hargaMenu
Dalam konteks program kafe: angka ini merepresentasikan menu apa yang dipesan (1=Kopi Hitam, 2=Cappuccino, 3=Latte, 4=Teh Tarik, 5=Mie Goreng)
Contoh: jika pelanggan memilih Cappuccino, maka pilihanMenu = 2

2. Parameter banyakItem (tipe data: int)

Menyimpan jumlah porsi atau kuantitas item yang dipesan
Digunakan sebagai pengali untuk menghitung total harga (harga satuan × jumlah)
Dalam konteks program kafe: angka ini merepresentasikan berapa banyak porsi menu yang sama dipesan
Contoh: jika pelanggan pesan 3 gelas Cappuccino, maka banyakItem = 3.
```
3. Done.
4. Done.