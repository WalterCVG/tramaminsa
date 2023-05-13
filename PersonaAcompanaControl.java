
package hep.tramarefminsa;

import java.util.List;

public class PersonaAcompanaControl {
       //variable de clase HistoriaDao
    Persona_AcompanaDao peracodao;
    
    //constructor
    public PersonaAcompanaControl() {
        peracodao = new Persona_AcompanaDao();
    }
       //metodos de negocio
    public List<Persona_Acompana> PersAcoListar() throws Exception {
        return peracodao.readAll();
    }
    
  public Persona_Acompana PersAcoLeer() throws Exception {
        return peracodao.findReg();
    }
}
