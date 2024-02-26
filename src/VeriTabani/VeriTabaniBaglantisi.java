package VeriTabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeriTabaniBaglantisi {
    private static final String hostname = "localhost";
    private static final String sqlInstanceName = "ILAYDA"; // Bilgisayar adi
    private static final String sqlDatabase = "ligShop"; // SQL Server veritabani adi
    private static final String sqlUser = "sa";
    private static final String sqlPassword = "sasa"; // sa hesabinin parolasi

    static {
        try {
            // JDBC sürücüsünü yükle
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VeriTabaniBaglantisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection baglantiAl() {
        Connection conn = null;

        try {         
            // Veritabanina baglanti URL si olusturulur
            String connectURL = "jdbc:sqlserver://" + hostname + ":1433" + ";instance=" + sqlInstanceName
                    + ";databaseName=" + sqlDatabase;

            // Bağlanti acilir
            conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}

