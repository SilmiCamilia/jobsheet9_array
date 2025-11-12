Percobaan 1 
Pertanyaan 1:

Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

Jawaban:
Akan terjadi error tipe data karena array bil bertipe integer (int) tidak dapat menyimpan nilai desimal seperti 5.0 dan 7.5. Nilai bertipe double atau float harus disimpan pada array dengan tipe data yang sama, misalnya double[].

Pertanyaan 2:

Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array. Apa keluaran dari program? Jelaskan maksud dari statement tersebut.

Jawaban:
Keluaran program tetap menampilkan isi array 5, 13, -7, 17.
Statement inisialisasi langsung seperti:

int[] bil = {5, 13, -7, 17};


berarti array langsung diberi nilai saat dideklarasikan tanpa perlu pengisian elemen satu per satu.

Pertanyaan 3:

Jika kondisi pada statement for-loop diubah menjadi i <= 4, apa keluaran dari program? Mengapa demikian?

Jawaban:
Program akan menghasilkan error ArrayIndexOutOfBoundsException, karena indeks array hanya valid dari 0 sampai 3.
Jika i <= 4, program mencoba mengakses elemen indeks 4 yang tidak ada.

Percobaan 2 
Pertanyaan 1:

Ubah statement pada langkah nomor 5 menjadi i <= nilaiAkhir.length. Jalankan program. Apakah terjadi perubahan? Mengapa demikian?

Jawaban:
Ya, terjadi error indeks keluar batas (ArrayIndexOutOfBoundsException).
Karena jika i <= nilaiAkhir.length, maka loop berjalan sampai i = 10, padahal indeks terakhir array hanya 9.

Pertanyaan 2:

Apa yang dimaksud dengan kondisi i < nilaiAkhir.length?

Jawaban:
Kondisi i < nilaiAkhir.length artinya perulangan akan berjalan sebanyak panjang array (length) dikurangi satu.
Dengan kata lain, selama i masih lebih kecil dari jumlah elemen array, loop akan terus berjalan.

Pertanyaan 3:

Ubah statement pada langkah nomor 6 sehingga hanya menampilkan nilai mahasiswa yang lulus saja (nilai > 70). Jalankan program dan jelaskan alur program!

Jawaban:
Program hanya menampilkan nilai mahasiswa yang lebih dari 70.
Alurnya:

Program membaca input nilai mahasiswa dan menyimpannya ke array.

Program melakukan perulangan untuk menampilkan nilai.

Di dalam perulangan, digunakan if (nilaiAkhir[i] > 70) untuk menyeleksi mahasiswa yang lulus.

Hanya nilai yang memenuhi syarat (>70) yang ditampilkan.

Pertanyaan 4:

Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai.

Jawaban:
Program menampilkan status tiap mahasiswa, apakah LULUS atau TIDAK LULUS berdasarkan nilai masing-masing.
Alurnya sama, tetapi ditambahkan percabangan if:

Jika nilaiAkhir[i] > 70, tampilkan “LULUS”.

Jika tidak, tampilkan “TIDAK LULUS”.

Percobaan 3
Pertanyaan 1:

Modifikasi kode program agar dapat menampilkan banyaknya mahasiswa yang lulus (nilai > 70).

Jawaban:
Program perlu menambahkan penghitung jumlah mahasiswa yang memiliki nilai > 70.
Setiap kali ditemukan nilai > 70, variabel penghitung (lulus++) ditambah 1.
Hasil akhirnya adalah jumlah mahasiswa yang lulus.

Pertanyaan 2:

Modifikasi program agar menerima jumlah elemen berdasarkan input dari pengguna dan menampilkan output seperti contoh.

Jawaban:
Dengan input jumlah mahasiswa dari pengguna, ukuran array menjadi dinamis (menyesuaikan jumlah yang dimasukkan).
Program kemudian menghitung rata-rata nilai mahasiswa yang lulus dan tidak lulus secara terpisah.
Hasil akhirnya seperti contoh di jobsheet:

Rata-rata nilai lulus = 85.0
Rata-rata nilai tidak lulus = 62.5


Artinya nilai mahasiswa dikelompokkan berdasarkan kelulusan, lalu dihitung rata-ratanya masing-masing.

Percobaan 4 
Pertanyaan 1:

Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4.

Jawaban:
break; digunakan untuk menghentikan perulangan saat nilai yang dicari telah ditemukan.
Tanpa break;, program akan tetap memeriksa seluruh elemen array meskipun data sudah ditemukan.

Pertanyaan 2:

Modifikasi kode program sehingga dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari.

Jawaban:
Program meminta input:

Jumlah elemen array,

Nilai-nilai mahasiswa,

Nilai yang ingin dicari (key).
Kemudian program menggunakan linear search untuk mencari nilai tersebut dan menampilkan posisinya.
Contoh hasil sesuai jobsheet:

Nilai 78 ketemu, merupakan nilai mahasiswa ke-5

Pertanyaan 3:

Modifikasi program agar memberikan pesan “Nilai yang dicari tidak ditemukan” jika nilai tidak ada di dalam array.

Jawaban:
Tambahkan variabel logika (boolean found = false).
Jika setelah perulangan nilai belum ditemukan (found tetap false), program mencetak:

Nilai yang dicari tidak ditemukan.


Hal ini memastikan program memberi umpan balik meskipun data tidak ada di array.