package hep.tramarefminsa;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CptDao {
    //variables

    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Cpt linea;
    String sql;
//    Cpt pac;
    CallableStatement cs;
    Statement stm;
    String sp;

    public List<Cpt> readAll() throws Exception {
        List<Cpt> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Cpt(rs.getString(44).trim(), rs.getString(45).trim(), rs.getString(46).trim(),
                        rs.getString(47).trim(), rs.getString(48).trim(), rs.getString(49).trim(),
                        rs.getString(50).trim(), rs.getString(51).trim(), rs.getString(52).trim());
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

    public Cpt findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new Cpt(rs.getString(44).trim(), rs.getString(45).trim(), rs.getString(46).trim(),
                        rs.getString(47).trim(), rs.getString(48).trim(), rs.getString(49).trim(),
                        rs.getString(50).trim(), rs.getString(51).trim(), rs.getString(52).trim());

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
