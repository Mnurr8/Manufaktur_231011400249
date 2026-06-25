package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDB {

    private static Connection conn;

    public static Connection getConnection() {

        try {

            if (conn == null) {

                String url =
                    "jdbc:mysql://localhost:3306/db_manufaktur_231011400249";

                String user = "root";
                String password = "";

                conn =
                    DriverManager.getConnection(
                        url,
                        user,
                        password
                    );

                System.out.println("Koneksi berhasil");

            }

        } catch (Exception e) {

            System.out.println(
                "Koneksi gagal : " +
                e.getMessage()
            );

        }

        return conn;
    }
}