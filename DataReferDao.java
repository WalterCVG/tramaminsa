
package hep.tramarefminsa;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DataReferDao {
        //variables

    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    DataRefer linea;
    String sql;
//    Datos_Referencia pac;
    CallableStatement cs;
    Statement stm;
    String sp;

    public List<DataRefer> readAll() throws Exception {
        List<DataRefer> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rdatos_referencia";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new DataRefer(rs.getString(2).trim(), rs.getString(3).trim(), rs.getString(4).trim(), rs.getString(5).trim(),
                        rs.getString(6).trim(), rs.getString(7).trim(), rs.getString(8).trim(), rs.getString(9).trim(), rs.getString(10).trim(), rs.getString(11).trim(),
                        rs.getString(12).trim(), rs.getString(13).trim(), rs.getString(14).trim(), rs.getString(15).trim(), rs.getString(16).trim());
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

    public DataRefer findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rDatos_referencia";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new DataRefer(rs.getString(2).trim(), rs.getString(3).trim(), rs.getString(4).trim(), rs.getString(5).trim(),
                        rs.getString(6).trim(), rs.getString(7).trim(), rs.getString(8).trim(), rs.getString(9).trim(), rs.getString(10).trim(), rs.getString(11).trim(),
                        rs.getString(12).trim(), rs.getString(13).trim(), rs.getString(14).trim(), rs.getString(15).trim(), rs.getString(16).trim());

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
