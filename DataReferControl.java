
package hep.tramarefminsa;
import java.util.List;

public class DataReferControl {

      //variable de clase HistoriaDao
    DataReferDao datrefdao;
    
    //constructor
    public DataReferControl() {
        datrefdao = new DataReferDao();
    }
       //metodos de negocio
    public List<DataRefer> DatRefListar() throws Exception {
        return datrefdao.readAll();
    }
    
  public DataRefer DatRefLeer() throws Exception {
        return datrefdao.findReg();
    }   
}
