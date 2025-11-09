# TugasPBOPert12

## LAPORAN TUGAS KULIAH PEMROGRAMAN BERORIENTASI OBJEK PERTEMUAN KEDUABELAS

Disusun guna memenuhi tugas mata kuliah **Pemrograman Berorientasi Objek**

---

## Dosen Pembimbing
**Bayu Adhi Nugroho, Ph.D**

## Disusun Oleh
**Muhamad Dhauvir Arkan**  
(09020624044)

**Program Studi Sistem Informasi**  
Fakultas Sains dan Teknologi  
Universitas Islam Negeri Sunan Ampel  
Surabaya – Tahun 2025

---

## LATAR BELAKANG

Perkembangan teknologi informasi di sektor transportasi khususnya kereta api menuntut adanya sistem manajemen data yang efisien dan terstruktur. Data armada kereta dan perawatannya harus dicatat secara akurat agar operasional kereta tetap aman, terjadwal, dan sesuai standar keselamatan.

Salah satu cara untuk mengelola data tersebut adalah melalui laporan digital yang terintegrasi dengan basis data (database). Laporan ini tidak hanya berfungsi sebagai dokumentasi, tetapi juga sebagai alat monitoring dan evaluasi bagi pihak manajemen, seperti kepala depo atau petugas perawatan.

Dalam praktikum ini, mahasiswa mempelajari implementasi **JasperReports**, sebuah library Java yang digunakan untuk membuat laporan berbasis data, yang dapat menghasilkan file dalam format PDF, HTML, atau Excel. Praktikum ini menekankan pembuatan laporan perawatan kereta, termasuk penataan elemen teks, tabel, dan tanggal, serta menangani layout agar laporan dapat dicetak dengan rapi dan tanpa error.

---

## DASAR TEORI

### 1. JasperReports
JasperReports adalah library open-source untuk menghasilkan laporan dari data yang tersimpan dalam database atau sumber data lainnya. Laporan ini bisa berupa tabel, grafik, atau dokumen dengan format PDF, HTML, XLS, dan lainnya.

**Komponen utama JasperReports:**
- **JRXML**: File template XML yang berisi definisi laporan, layout, font, dan elemen-elemen laporan.  
- **JasperReport**: Hasil compile dari JRXML, berupa objek yang dapat diisi dengan data.  
- **JasperPrint**: Objek laporan siap cetak, berisi data yang sudah diisi.  
- **JasperViewer**: Komponen GUI untuk menampilkan laporan secara visual.  

### 2. Band dalam JasperReports
Laporan JasperReports terdiri dari beberapa **band (area)**:
- **Title**: Menampilkan judul laporan.  
- **Page Header**: Menampilkan header tiap halaman.  
- **Column Header**: Menampilkan judul kolom tabel.  
- **Detail**: Menampilkan data baris per baris dari database.  
- **Column Footer / Page Footer**: Menampilkan footer atau informasi tambahan.  
- **Summary**: Menampilkan kesimpulan, tanda tangan, atau catatan akhir.  

> Setiap band memiliki tinggi tertentu. Jika elemen dalam band melebihi tinggi band, JasperReports akan menampilkan warning:  
> “element bottom reaches outside band area”  
> Sehingga perlu penyesuaian layout.

### 3. Database dan Query
Laporan dihasilkan berdasarkan query SQL, contohnya:
```sql
SELECT * FROM perawatan_kereta;

Sebelum Insert

Setelah Insert
