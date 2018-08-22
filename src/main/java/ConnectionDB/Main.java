package ConnectionDB;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String debug  = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch (ClassNotFoundException e){
            System.out.println("JDBC DRIVER ADA DIMANA?");
            e.printStackTrace();
            return;
        }

        System.out.println("MYSQL JDBC Driver Registered");
        Connection conn = null;
        try{
            //jdbc:mysql://localhost:3306/NAMADATABASE,USER,PASSWORD
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/diannodejs","root","");
        }catch (SQLException e){
            debug = e.getCause().toString();
            System.out.println("Gagal Terhubung ke DB!!");
            e.printStackTrace();
            return;
        }

        if(conn!=null){
            System.out.println("Berhasil Terkoneksi!");
        } else {
            System.out.println("Gagal Koneksi Ke DB!!!");
            System.out.println(debug);
        }
    }
}
