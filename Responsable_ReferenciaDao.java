package hep.tramarefminsa;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Responsable_ReferenciaDao {

    //variables
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Responsable_Referencia linea;
    String sql;
//    Persona_Establecimiento pac;
    CallableStatement cs;
    Statement stm;
    String sp;

    public List<Responsable_Referencia> readAll() throws Exception {
        List<Responsable_Referencia> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Responsable_Referencia(rs.getString(14), rs.getString(15), rs.getString(16),
                        rs.getString(17), rs.getString(18), rs.getString(19),
                        rs.getString(20), rs.getString(21), rs.getString(22));
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

    public Responsable_Referencia findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new Responsable_Referencia(rs.getString(14), rs.getString(15), rs.getString(16),
                        rs.getString(17), rs.getString(18), rs.getString(19),
                        rs.getString(20), rs.getString(21), rs.getString(22));
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
