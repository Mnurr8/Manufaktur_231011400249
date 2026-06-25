package dao;

import config.KoneksiDB;
import model.Produk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdukDAO {

    private Connection conn;

    public ProdukDAO() {
        conn = KoneksiDB.getConnection();
    }

    // INSERT
    public boolean insert(Produk produk) {

        String sql =
                "INSERT INTO produk "
                + "(kode_produk,nama_produk,kategori,stok,keterangan) "
                + "VALUES (?,?,?,?,?)";

        try {

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, produk.getKodeProduk());
            ps.setString(2, produk.getNamaProduk());
            ps.setString(3, produk.getKategori());
            ps.setInt(4, produk.getStok());
            ps.setString(5, produk.getKeterangan());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Insert gagal : "
                    + e.getMessage());

            return false;
        }
    }

    // UPDATE
    public boolean update(Produk produk) {

        String sql =
                "UPDATE produk SET "
                + "nama_produk=?, "
                + "kategori=?, "
                + "stok=?, "
                + "keterangan=? "
                + "WHERE kode_produk=?";

        try {

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, produk.getNamaProduk());
            ps.setString(2, produk.getKategori());
            ps.setInt(3, produk.getStok());
            ps.setString(4, produk.getKeterangan());
            ps.setString(5, produk.getKodeProduk());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Update gagal : "
                    + e.getMessage());

            return false;
        }
    }

    // DELETE
    public boolean delete(String kodeProduk) {

        String sql =
                "DELETE FROM produk "
                + "WHERE kode_produk=?";

        try {

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, kodeProduk);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Delete gagal : "
                    + e.getMessage());

            return false;
        }
    }

    // GET ALL
    public List<Produk> getAll() {

        List<Produk> list =
                new ArrayList<>();

        String sql =
                "SELECT * FROM produk";

        try {

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while (rs.next()) {

                Produk p =
                        new Produk();

                p.setKodeProduk(
                        rs.getString("kode_produk"));

                p.setNamaProduk(
                        rs.getString("nama_produk"));

                p.setKategori(
                        rs.getString("kategori"));

                p.setStok(
                        rs.getInt("stok"));

                p.setKeterangan(
                        rs.getString("keterangan"));

                list.add(p);
            }

        } catch (Exception e) {

            System.out.println(
                    "GetAll gagal : "
                    + e.getMessage());
        }

        return list;
    }

    public List<Produk> cari(String keyword) {

        List<Produk> list = new ArrayList<>();

        String sql =
                "SELECT * FROM produk "
                + "WHERE kode_produk LIKE ? "
                + "OR nama_produk LIKE ? "
                + "OR kategori LIKE ?";

        try {

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ps.setString(3, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Produk p = new Produk();

                p.setKodeProduk(rs.getString("kode_produk"));
                p.setNamaProduk(rs.getString("nama_produk"));
                p.setKategori(rs.getString("kategori"));
                p.setStok(rs.getInt("stok"));
                p.setKeterangan(rs.getString("keterangan"));

                list.add(p);
            }

        } catch (Exception e) {

            System.out.println("Cari gagal : " + e.getMessage());

        }

        return list;
    }
}