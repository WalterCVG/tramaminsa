
package hep.tramarefminsa;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DiagnosticoDao {

     //variables
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Diagnostico linea;
    String sql;  
//    Diagnostico pac;
    CallableStatement cs;
    Statement stm;
    String sp;
    
     public List<Diagnostico> readAll() throws Exception {
        List<Diagnostico> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rDiagnostico";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Diagnostico(rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4)) );
                listar.add(linea);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return listar;

    }   
   
      public Diagnostico findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rdiagnostico";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new Diagnostico(rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4)) );
                                
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return linea;
    }
   
   
}
