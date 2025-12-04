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