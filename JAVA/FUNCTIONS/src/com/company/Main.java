package com.company;
import org.sqlite.Function;

import java.io.File;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String fileDb = "C:/Users/Joel Caballero/Desktop/EXTERNALFUNCTIONS/JAVA/resources/sqlite3/test.db";
        Connection connection = Connection(fileDb);

        Function.create(connection, РING.class.getSimpleName(), new РING());
        Function.create(connection, PMT.class.getSimpleName(), new PMT());
        Function.create(connection, BIN2DEC.class.getSimpleName(), new BIN2DEC());
        Function.create(connection, DEC2BIN.class.getSimpleName(), new DEC2BIN());
        Function.create(connection, C2F.class.getSimpleName(), new C2F());
        Function.create(connection, F2C.class.getSimpleName(), new F2C());
        Function.create(connection, Factorial.class.getSimpleName(), new Factorial());
        Function.create(connection, HEX2DEC.class.getSimpleName(), new HEX2DEC());
        Function.create(connection, DEC2HEX.class.getSimpleName(), new DEC2HEX());
        Function.create(connection, COMPARESTRING.class.getSimpleName(), new COMPARESTRING());
        Function.create(connection, TRIM.class.getSimpleName(), new TRIM());
        Function.create(connection, REPEAT.class.getSimpleName(), new REPEAT());
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);  // set timeout to 30 sec.
        try {
            //ResultSet rs = statement.executeQuery("select PMT(0.08,10,10000) as b");
            ResultSet rs = statement.executeQuery("select РING('google.com') as b");
            while(rs.next())
            {
                System.out.println("b = " + rs.getString("b"));
            }
        }catch(Exception e)
        {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(connection != null)
                    connection.close();
            }
            catch(Exception e)
            {
                // connection close failed.
                System.err.println(e);
            }
        }
    }

    public static Connection Connection(String fileDb )
    {
        File file = new File(fileDb);
        if (file.exists())
        {
            Connection conn = null;
            try {
                Class.forName("org.sqlite.JDBC");
                String url = "jdbc:sqlite:" + fileDb;
                conn = DriverManager.getConnection(url);
                System.out.println("Connection to SQLite has been established.");
                return conn;
            }catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
        else
        {
            System.out.println("No se encontro la base de datos");
            return null;
        }
    }
}
