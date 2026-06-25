-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Jun 2026 pada 12.28
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_manufaktur_231011400249`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `kode_produk` varchar(10) NOT NULL,
  `nama_produk` varchar(100) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `stok` int(11) NOT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`kode_produk`, `nama_produk`, `kategori`, `stok`, `keterangan`) VALUES
('PR001', 'Produk Muhamad Nurdin 231011400249', 'Plastik', 100, 'Data orisinal mahasiswa'),
('PR002', 'Botol Minum', 'Plastik', 67, 'Produk plastik'),
('PR003', 'Kursi Plastik', 'Furniture', 36, 'Kursi produksi'),
('PR004', 'Meja Lipat', 'Furniture', 20, 'Meja serbaguna'),
('PR005', 'Rak Sepatu', 'Furniture', 15, 'Rak rumah tangga'),
('PR006', 'Galon Air', 'Plastik', 40, 'Wadah air'),
('PR007', 'Tempat Sampah', 'Plastik', 25, 'Tempat sampah rumah'),
('PR008', 'Kotak Penyimpanan', 'Plastik', 35, 'Storage box'),
('PR009', 'Lemari Mini', 'Furniture', 10, 'Lemari kecil'),
('PR010', 'Ember Besar', 'Plastik', 50, 'Ember serbaguna');

-- --------------------------------------------------------

--
-- Struktur dari tabel `produksi`
--

CREATE TABLE `produksi` (
  `id_produksi` int(11) NOT NULL,
  `kode_produk` varchar(10) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal_produksi` date NOT NULL,
  `status` enum('Pending','Diproses','Selesai') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `produksi`
--

INSERT INTO `produksi` (`id_produksi`, `kode_produk`, `jumlah`, `tanggal_produksi`, `status`) VALUES
(1, 'PR001', 500, '2026-06-01', 'Selesai'),
(2, 'PR002', 300, '2026-06-02', 'Diproses'),
(3, 'PR003', 200, '2026-06-03', 'Pending'),
(4, 'PR004', 200, '2026-06-04', 'Selesai'),
(5, 'PR005', 120, '2026-06-05', 'Diproses'),
(6, 'PR006', 250, '2026-06-06', 'Selesai'),
(7, 'PR007', 180, '2026-06-07', 'Diproses'),
(8, 'PR008', 400, '2026-06-08', 'Pending'),
(9, 'PR009', 90, '2026-06-09', 'Selesai'),
(10, 'PR010', 220, '2026-06-10', 'Diproses');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
(1, 'admin', 'admin123');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`kode_produk`);

--
-- Indeks untuk tabel `produksi`
--
ALTER TABLE `produksi`
  ADD PRIMARY KEY (`id_produksi`),
  ADD KEY `kode_produk` (`kode_produk`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `produksi`
--
ALTER TABLE `produksi`
  MODIFY `id_produksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `produksi`
--
ALTER TABLE `produksi`
  ADD CONSTRAINT `produksi_ibfk_1` FOREIGN KEY (`kode_produk`) REFERENCES `produk` (`kode_produk`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
