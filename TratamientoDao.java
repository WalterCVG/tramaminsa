package hep.tramarefminsa;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TratamientoDao {

    //variables
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Tratamiento linea;
    String sql;
//    Tratamiento pac;
    CallableStatement cs;
    Statement stm;
    String sp;

    public List<Tratamiento> readAll() throws Exception {
        List<Tratamiento> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rTratamiento";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Tratamiento(Integer.parseInt(rs.getString(2)), Integer.parseInt(rs.getString(3)), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), Integer.parseInt(rs.getString(8)));
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

    public Tratamiento findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rtratamiento";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {    
                linea = new Tratamiento(Integer.parseInt(rs.getString(2)), Integer.parseInt(rs.getString(3)), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), Integer.parseInt(rs.getString(8)));
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
