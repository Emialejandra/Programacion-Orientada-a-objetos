import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLOutput;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/almacen";

        String user = "root";
        String password = "@Lilo2025*";
        Connection connection = DriverManager.getConnection(url,user,password);

        if(connection !=null ){
            System.out.println("Coneccion  establecida");
            connection.close();

        }else{
            System.out.println("No conectado");
            connection.close();
        }

    }
}
