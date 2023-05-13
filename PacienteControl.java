package hep.tramarefminsa;

import java.util.List;

public class PacienteControl {

    //variable de clase HistoriaDao
    PacienteDao pacdao;

    //constructor
    public PacienteControl() {
        pacdao = new PacienteDao();
    }
    //metodos de negocio

    public List<Paciente> PacListar() throws Exception {
        return pacdao.readAll();
    }

    public Paciente PacienteLeer() throws Exception {
        return pacdao.findReg();
    }

    public String CogeNro() throws Exception {
        return pacdao.findNro();
    }

}
