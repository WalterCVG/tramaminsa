
package hep.tramarefminsa;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Persona_EstablecimientoDao {
     //variables
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Persona_Establecimiento linea;
    String sql;  
//    Persona_Establecimiento pac;
    CallableStatement cs;
    Statement stm;
    String sp;
    
     public List<Persona_Establecimiento> readAll() throws Exception {
        List<Persona_Establecimiento> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpersona_establecimiento";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Persona_Establecimiento(rs.getString(2).trim(), rs.getString(3).trim(), rs.getString(4).trim(),
                        rs.getString(5).trim(), rs.getString(6).trim(), rs.getString(7).trim(),
                        rs.getString(8).trim(), rs.getString(9).trim(), rs.getString(10).trim()  );
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
  
      public Persona_Establecimiento findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpersona_establecimiento";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                 linea = new Persona_Establecimiento(rs.getString(2).trim(), rs.getString(3).trim(), rs.getString(4).trim(),
                        rs.getString(5).trim(), rs.getString(6).trim(), rs.getString(7).trim(),
                        rs.getString(8).trim(), rs.getString(9).trim(), rs.getString(10).trim()  );
                                
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
