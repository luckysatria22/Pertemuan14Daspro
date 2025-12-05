1. Penulisan String... namaPengunjung menggunakan sintaks varargs (variable arguments) di Java. Tiga titik ... adalah sintaks khusus yang menandakan bahwa parameter ini dapat menerima jumlah argumen yang bervariasi (0 atau lebih argumen bertipe String). Varargs memungkinkan fungsi dipanggil dengan jumlah parameter yang fleksibel tanpa harus membuat array secara eksplisit. Di dalam fungsi, namaPengunjung akan diperlakukan sebagai array String, sehingga bisa diakses menggunakan indeks atau loop. Keuntungan varargs adalah membuat pemanggilan fungsi lebih sederhana dan fleksibel, misalnya bisa dipanggil dengan daftarPengunjung("Ali"), daftarPengunjung("Ali", "Budi"), atau daftarPengunjung("Ali", "Budi", "Citra") tanpa perlu membuat array terlebih dahulu.
2. Done.
3. Tidak, tidak bisa menggunakan dua tipe data varargs dalam satu fungsi. Berdasarkan aturan varargs di Java, hanya boleh ada SATU parameter varargs dalam sebuah fungsi, dan parameter varargs harus berada di posisi TERAKHIR dalam daftar parameter. Alasannya adalah karena varargs dapat menerima jumlah argumen yang tidak terbatas, sehingga jika ada dua varargs, compiler tidak akan bisa menentukan argumen mana yang masuk ke varargs pertama dan mana yang masuk ke varargs kedua.
Contoh yang SALAH (ERROR):
java// ERROR: Tidak boleh ada 2 varargs
static void contoh(String... nama, int... umur) {
    // Ini akan error saat kompilasi
}
Contoh yang BENAR:
java// BENAR: Varargs hanya 1 dan di posisi terakhir
static void daftarPengunjung(String kodeKafe, boolean isMember, String... namaPengunjung) {
    System.out.println("Kafe: " + kodeKafe);
    System.out.println("Member: " + isMember);
    System.out.println("Pengunjung:");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
}

// Pemanggilan:
daftarPengunjung("K001", true, "Ali", "Budi", "Citra");
Aturan Varargs:

Hanya boleh 1 varargs per fungsi
Varargs harus di posisi parameter terakhir
Parameter lain boleh ada sebelum varargs
Varargs diperlakukan sebagai array di dalam fungsi


4. Program tetap berjalan tanpa error. Varargs memungkinkan fungsi dipanggil dengan 0 argumen atau lebih, sehingga pemanggilan daftarPengunjung() tanpa argumen adalah valid dan legal di Java. Ketika dipanggil tanpa argumen, parameter namaPengunjung akan menjadi array kosong dengan panjang 0 (namaPengunjung.length = 0). Loop di dalam fungsi tidak akan dieksekusi karena tidak ada elemen untuk diiterasi, tetapi bagian lain dari fungsi tetap berjalan normal.
Contoh Kode:
javapublic class PengunjungCafeNoAbsen {
    
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("===== Daftar Pengunjung Kafe =====");
        System.out.println("Jumlah pengunjung: " + namaPengunjung.length);
        System.out.println("\nDaftar Nama:");
        
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        System.out.println("==================================\n");
    }
    
    public static void main(String[] args) {
        // Panggil tanpa argumen
        daftarPengunjung();
        
        // Panggil dengan argumen
        daftarPengunjung("Ali", "Budi");
    }
}
```

**Output yang Dihasilkan:**
```
===== Daftar Pengunjung Kafe =====
Jumlah pengunjung: 0

Daftar Nama:
==================================

===== Daftar Pengunjung Kafe =====
Jumlah pengunjung: 2

Daftar Nama:
- Ali
- Budi
==================================
Penjelasan:

Tidak error saat kompilasi ✓
Tidak error saat dijalankan ✓
Program tetap berjalan normal ✓
namaPengunjung.length akan bernilai 0
Loop tidak akan dijalankan (karena array kosong)
Output menunjukkan "Jumlah pengunjung: 0" dan daftar nama kosong