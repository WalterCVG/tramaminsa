/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hep.tramarefminsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDb {
      public static Connection getConnection() throws SQLException, Exception {
        Connection cn = null;
        try {
            // Parámetros de Connexión
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url = "jdbc:sqlserver://HPVALQUI\\SQLEXPRESS:1433;databaseName=Hep_refcon";
//            String url = "jdbc:sqlserver://192.168.1.15:1433;databaseName=Hep_refcon";
            String user = "sa";
            String pwd = "P4ssw0rd";
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(url, user, pwd);

        } catch (Exception e) {
            throw e;
        }
        return cn;
    }

    public static Connection getConnectionDatos() throws SQLException, Exception {
        Connection cn = null;
        try {
            // Parámetros de Connexión
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url = "jdbc:sqlserver://HPVALQUI\\SQLEXPRESS:1433;databaseName=hepasistencial";
//            String url = "jdbc:sqlserver://192.168.1.15:1433;databaseName=hepasistencial";
            String user = "sa";
            String pwd = "P4ssw0rd";
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(url, user, pwd);

        } catch (Exception e) {
            throw e;
        }
        return cn;
    }

}
