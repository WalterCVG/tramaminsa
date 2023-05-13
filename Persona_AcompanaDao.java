package hep.tramarefminsa;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Persona_AcompanaDao {

    //variables
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Persona_Acompana linea;
    String sql;
//    Persona_Acompana pac;
    CallableStatement cs;
    Statement stm;
    String sp;

    public List<Persona_Acompana> readAll() throws Exception {
        List<Persona_Acompana> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Persona_Acompana(rs.getString(23).trim(), rs.getString(24).trim(), rs.getString(25).trim(),
                        rs.getString(26).trim(), rs.getString(27).trim(), rs.getString(28).trim(),
                        rs.getString(29).trim(), rs.getString(30).trim(), rs.getString(31).trim());
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

    public Persona_Acompana findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new Persona_Acompana(rs.getString(23).trim(), rs.getString(24).trim(), rs.getString(25).trim(),
                        rs.getString(26).trim(), rs.getString(27).trim(), rs.getString(28).trim(),
                        rs.getString(29).trim(), rs.getString(30).trim(), rs.getString(31).trim());
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
