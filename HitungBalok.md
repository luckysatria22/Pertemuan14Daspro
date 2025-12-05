1. Tahapan eksekusi program:

Program dijalankan (java HitungBalokNoAbsen)
JVM mencari dan menjalankan fungsi main()
Scanner dibuat untuk input
Program meminta input panjang dari user
User memasukkan nilai panjang
Program meminta input lebar dari user
User memasukkan nilai lebar
Program meminta input tinggi dari user
User memasukkan nilai tinggi
Program memanggil fungsi hitungLuas(panjang, lebar)
Eksekusi berpindah ke fungsi hitungLuas()
Fungsi hitungLuas() menghitung luas = panjang × lebar
Fungsi hitungLuas() mengembalikan nilai luas ke main()
Nilai luas disimpan di variabel luasPersegiPanjang
Program memanggil fungsi hitungVolume(panjang, lebar, tinggi)
Eksekusi berpindah ke fungsi hitungVolume()
Fungsi hitungVolume() menghitung volume = panjang × lebar × tinggi
Fungsi hitungVolume() mengembalikan nilai volume ke main()
Nilai volume disimpan di variabel volumeBalok
Program menampilkan luas persegi panjang ke layar
Program menampilkan volume balok ke layar
Scanner ditutup
Program selesai
2. 
Masukkan panjang: 4
Masukkan lebar: 3
Masukkan tinggi: 5

Luas Persegi Panjang: 12
Volume Balok: 60

Alur jalannya program:

Program dimulai dari fungsi main()
User diminta input panjang, memasukkan nilai 4
User diminta input lebar, memasukkan nilai 3
User diminta input tinggi, memasukkan nilai 5
Program memanggil hitungLuas(4, 3)
Fungsi hitungLuas() menghitung: 4 × 3 = 12, mengembalikan 12
Nilai 12 disimpan di variabel luasPersegiPanjang
Program memanggil hitungVolume(4, 3, 5)
Fungsi hitungVolume() menghitung: 4 × 3 × 5 = 60, mengembalikan 60
Nilai 60 disimpan di variabel volumeBalok
Program menampilkan "Luas Persegi Panjang: 12"
Program menampilkan "Volume Balok: 60"
3. Alur jalannya program:

Program dijalankan, JVM menjalankan fungsi main()
Variabel p dibuat dan diberi nilai 8
Variabel l dibuat dan diberi nilai 5
Variabel t dibuat dan diberi nilai 3
Program memanggil fungsi hitungLuas(8, 5)
Eksekusi berpindah ke fungsi hitungLuas()
Parameter panjang = 8, lebar = 5
Menghitung luas = 8 × 5 = 40
Return nilai 40 ke main()
Nilai 40 disimpan di variabel luas
Program memanggil fungsi hitungVolume(8, 5, 3)
Eksekusi berpindah ke fungsi hitungVolume()
Parameter panjang = 8, lebar = 5, tinggi = 3
Menghitung volume = 8 × 5 × 3 = 120
Return nilai 120 ke main()
Nilai 120 disimpan di variabel volume
Program menampilkan "Luas: 40"
Program menampilkan "Volume: 120"
Program selesai
4. 
Kapan fungsi harus menggunakan parameter:
Fungsi harus menggunakan parameter ketika membutuhkan data dari luar untuk melakukan tugasnya. Parameter membuat fungsi lebih fleksibel karena bisa bekerja dengan nilai yang berbeda-beda setiap kali dipanggil.
Contoh butuh parameter:
javastatic int hitungLuas(int panjang, int lebar) {  // Butuh input panjang & lebar
    return panjang * lebar;
}
Contoh tidak butuh parameter:
javastatic void tampilkanJudul() {  // Tidak butuh input, tugasnya fixed
    System.out.println("===== PROGRAM HITUNG BALOK =====");
}
Kapan fungsi harus memiliki nilai kembalian:
Fungsi harus memiliki nilai kembalian (return value) ketika hasil prosesnya akan digunakan oleh bagian program lain untuk perhitungan atau proses selanjutnya. Fungsi yang mengembalikan nilai menggunakan tipe data (int, double, String, dll).
Contoh butuh return value:
javastatic int hitungVolume(int p, int l, int t) {  // Hasilnya akan digunakan
    return p * l * t;
}
// Di main: int vol = hitungVolume(4, 3, 5);
Contoh tidak butuh return value (void):
javastatic void tampilkanHasil(int luas, int volume) {  // Hanya menampilkan
    System.out.println("Luas: " + luas);
    System.out.println("Volume: " + volume);
}