
package hep.tramarefminsa;

import java.util.List;


public class MotivoReferenciaControl {
         //variable de clase HistoriaDao
    Motivo_ReferenciaDao motrefdao;
       //constructor
    public MotivoReferenciaControl() {
        motrefdao = new Motivo_ReferenciaDao();
    }
       //metodos de negocio
    public List<Motivo_Referencia> MotRefListar() throws Exception {
        return motrefdao.readAll();
    }
    
  public Motivo_Referencia MotRefLeer() throws Exception {
        return motrefdao.findReg();
    }
}
