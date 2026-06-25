package dao;

import config.KoneksiDB;
import model.Produksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProduksiDAO {

    private Connection conn;

    public ProduksiDAO() {
        conn = KoneksiDB.getConnection();
    }
 
public boolean insert(Produksi produksi) {

    String sql =
            "INSERT INTO produksi "
            + "(kode_produk,jumlah,tanggal_produksi,status) "
            + "VALUES (?,?,?,?)";

    try {

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1,
                produksi.getKodeProduk());

        ps.setInt(2,
                produksi.getJumlah());

        ps.setString(3,
                produksi.getTanggalProduksi());

        ps.setString(4,
                produksi.getStatus());

        return ps.executeUpdate() > 0;

    } catch(Exception e) {

    e.printStackTrace();

    return false;
    }
}

public boolean update(Produksi produksi) {

    String sql =
            "UPDATE produksi SET "
            + "kode_produk=?, "
            + "jumlah=?, "
            + "tanggal_produksi=?, "
            + "status=? "
            + "WHERE id_produksi=?";

    try {

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1,
                produksi.getKodeProduk());

        ps.setInt(2,
                produksi.getJumlah());

        ps.setString(3,
                produksi.getTanggalProduksi());

        ps.setString(4,
                produksi.getStatus());

        ps.setInt(5,
                produksi.getIdProduksi());

        return ps.executeUpdate() > 0;

    } catch(Exception e) {

        System.out.println(
                "Update Produksi gagal : "
                + e.getMessage());

        return false;
    }
}

public boolean delete(int idProduksi) {

    String sql =
            "DELETE FROM produksi "
            + "WHERE id_produksi=?";

    try {

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(1,
                idProduksi);

        return ps.executeUpdate() > 0;

    } catch(Exception e) {

    e.printStackTrace();

    return false;
    }
}

public List<Produksi> getAll() {

    List<Produksi> list =
            new ArrayList<>();

    String sql =
            "SELECT * FROM produksi";

    try {

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            Produksi p =
                    new Produksi();

            p.setIdProduksi(
                    rs.getInt("id_produksi"));

            p.setKodeProduk(
                    rs.getString("kode_produk"));

            p.setJumlah(
                    rs.getInt("jumlah"));

            p.setTanggalProduksi(
                    rs.getString("tanggal_produksi"));

            p.setStatus(
                    rs.getString("status"));

            list.add(p);

        }

    } catch(Exception e) {

        System.out.println(
                "GetAll Produksi gagal : "
                + e.getMessage());

    }

    return list;
    }

public List<Produksi> cari(String keyword) {

    List<Produksi> list =
            new ArrayList<>();

    String sql =
            "SELECT * FROM produksi "
            + "WHERE kode_produk LIKE ? "
            + "OR status LIKE ?";

    try {

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, "%" + keyword + "%");
        ps.setString(2, "%" + keyword + "%");

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            Produksi p =
                    new Produksi();

            p.setIdProduksi(
                    rs.getInt("id_produksi"));

            p.setKodeProduk(
                    rs.getString("kode_produk"));

            p.setJumlah(
                    rs.getInt("jumlah"));

            p.setTanggalProduksi(
                    rs.getString("tanggal_produksi"));

            p.setStatus(
                    rs.getString("status"));

            list.add(p);
        }

    } catch(Exception e) {

        System.out.println(
                "Cari Produksi gagal : "
                + e.getMessage());

    }

    return list;
    }
}