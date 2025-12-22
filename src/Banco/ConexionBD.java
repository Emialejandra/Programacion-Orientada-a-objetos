package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL =
            "jdbc:mysql://uwgkx1hsqcgb06nl:qepiZrFVWZitjNdL1W87@bn9ozbbrpuvxgv5wkju6-mysql.services.clever-cloud.com:3306/bn9ozbbrpuvxgv5wkju6"
                    + "?useSSL=true"
                    + "&requireSSL=true"
                    + "&verifyServerCertificate=false"
                    + "&serverTimezone=UTC"
                    + "&allowPublicKeyRetrieval=true";

    private static final String USER = "uwgkx1hsqcgb06nl";
    private static final String PASSWORD = "qepiZrFVWZitjNdL1W87";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
