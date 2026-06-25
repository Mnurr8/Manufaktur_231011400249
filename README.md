# Sistem Informasi Manajemen Produksi Manufaktur

## Identitas Mahasiswa

- **Nama:** Muhamad Nurdin
- **NIM:** 231011400249
- **Mata Kuliah:** Pemrograman II
- **Project Akhir:** Sistem Informasi Manajemen Produksi Manufaktur

---

## Deskripsi Project

Sistem Informasi Manajemen Produksi Manufaktur merupakan aplikasi desktop berbasis Java Swing yang digunakan untuk mengelola data produk dan data produksi pada perusahaan manufaktur. Aplikasi ini menerapkan konsep CRUD (Create, Read, Update, Delete), Login, MVC, DAO, JDBC, pencarian data, serta pembuatan laporan yang dapat dicetak.

---

## Fitur

- Login User
- Menu Utama
- CRUD Data Produk
- CRUD Data Produksi
- Pencarian Data Produk dan Produksi
- Laporan Produk
- Laporan Produksi
- Cetak Laporan
- Logout

---

## Teknologi

- Java
- Java Swing
- MySQL
- JDBC
- MVC (Model View Controller)
- DAO (Data Access Object)
- Apache NetBeans

---

## Database

File database terdapat pada:

```text
db_manufaktur_231011400249.sql
```

Import file tersebut ke MySQL sebelum menjalankan aplikasi.

---

## Cara Menjalankan

1. Import database `db_manufaktur_231011400249.sql` ke MySQL.
2. Buka project menggunakan Apache NetBeans.
3. Sesuaikan konfigurasi database pada `KoneksiDB.java`.
4. Jalankan aplikasi melalui `LoginForm.java`.

---

## Screenshot

### Login

![Login](screenshots/login.png)

### Menu Utama

![Menu Utama](screenshots/menu-utama.png)

### Data Produk

![Data Produk](screenshots/produk.png)

### Data Produksi

![Data Produksi](screenshots/produksi.png)

### Laporan

![Laporan](screenshots/Laporan.png)

---

## Struktur Project

```text
src/
├── config
├── dao
├── model
└── view
```

---

## Author

**Muhamad Nurdin**  
NIM: **231011400249**
