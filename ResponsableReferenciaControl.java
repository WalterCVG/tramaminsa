
package hep.tramarefminsa;

import java.util.List;


public class ResponsableReferenciaControl {
       //variable de clase HistoriaDao
    Responsable_ReferenciaDao RespRdao;
    
    //constructor
    public ResponsableReferenciaControl() {
        RespRdao = new Responsable_ReferenciaDao();
    }
       //metodos de negocio
    public List<Responsable_Referencia> RespRefListar() throws Exception {
        return  RespRdao.readAll();
    }
    
  public Responsable_Referencia RespRefLeer() throws Exception {
        return RespRdao.findReg();
    }
}
