package dao;

import config.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    private Connection conn;

    public UserDAO() {
        conn = KoneksiDB.getConnection();
    }

    public boolean login(String username, String password) {

        String sql =
                "SELECT * FROM user "
                + "WHERE username=? "
                + "AND password=?";

        try {

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs =
                    ps.executeQuery();

            return rs.next();

        } catch (Exception e) {

            System.out.println(
                    "Login error : "
                    + e.getMessage());

            return false;
        }
    }
}