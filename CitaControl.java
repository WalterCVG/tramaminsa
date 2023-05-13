

package hep.tramarefminsa;

import java.util.List;


public class CitaControl {
        //variable de clase HistoriaDao
    CitaDao citdao;
    
    //constructor
    public CitaControl() {
        citdao = new CitaDao();
    }
       //metodos de negocio
    public List<Cita> CitaListar() throws Exception {
        return citdao.readAll();
    }
    
  public Cita CitaLeer() throws Exception {
        return citdao.findReg();
    }

}
