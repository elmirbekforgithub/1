package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecetion123 {
    private static final String url="jdbc:postgresql://localhost:5432/postgres";
    private static final String username="postgres";
    private static final String paswoord="1234";

    public static Connection connection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,username,paswoord);
         }catch (SQLException sqlException){
            System.out.println(sqlException);
        }
        return conn;
    }
}
