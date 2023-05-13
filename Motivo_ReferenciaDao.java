package hep.tramarefminsa;

//import Entidades.Motivo_Referencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Motivo_ReferenciaDao {

    //variables
    Connection cn;
//    PreparedStatement ps;
    ResultSet rs;
    Motivo_Referencia linea;
    String sql;
//    PacienteDao pacdao;
//    CallableStatement cs;
    Statement stm;
//    String sp;

    public List<Motivo_Referencia> readAll() throws Exception {
        List<Motivo_Referencia> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rdatos_referencia";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Motivo_Referencia(Integer.parseInt(rs.getString(17)), rs.getString(18));
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

    public Motivo_Referencia findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rDatos_Referencia";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new Motivo_Referencia(Integer.parseInt(rs.getString(17)), rs.getString(18));
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
