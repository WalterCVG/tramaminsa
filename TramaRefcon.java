package hep.tramarefminsa;

import java.util.ArrayList;
import java.util.List;

public class TramaRefcon {
    private Paciente paciente;
    private Responsable_Referencia responsable_referencia;
    private Persona_Establecimiento persona_establecimiento;
    private Persona_Acompana persona_acompana;
    private Cita cita;
    private List<Diagnostico> diagnostico;
    private List<Tratamiento> tratamiento;
    private Cpt cpt;
    private Datos_Referencia datos_referencia;

    public TramaRefcon() {
    }

    public TramaRefcon( Paciente paciente, Responsable_Referencia responsable_referencia, Persona_Establecimiento persona_establecimiento, Persona_Acompana persona_acompana, Cita cita, String[] diagnostico, String[] tratamiento, Cpt cpt, Datos_Referencia datos_referencia) {
        this.paciente = paciente;
        this.responsable_referencia = responsable_referencia;
        this.persona_establecimiento = persona_establecimiento;
        this.persona_acompana = persona_acompana;
        this.cita = cita;
        this.diagnostico = new ArrayList();
        this.tratamiento = new ArrayList();
        this.cpt = cpt;
        this.datos_referencia = datos_referencia;
    }
    
   
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Responsable_Referencia getResponsable_referencia() {
        return responsable_referencia;
    }

    public void setResponsable_referencia(Responsable_Referencia responsable_referencia) {
        this.responsable_referencia = responsable_referencia;
    }

    public Persona_Establecimiento getPersona_establecimiento() {
        return persona_establecimiento;
    }

    public void setPersona_establecimiento(Persona_Establecimiento persona_establecimiento) {
        this.persona_establecimiento = persona_establecimiento;
    }

    public Persona_Acompana getPersona_acompana() {
        return persona_acompana;
    }

    public void setPersona_acompana(Persona_Acompana persona_acompana) {
        this.persona_acompana = persona_acompana;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public List<Diagnostico> getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(List<Diagnostico> diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<Tratamiento> getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(List<Tratamiento> tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Cpt getCpt() {
        return cpt;
    }

    public void setCpt(Cpt cpt) {
        this.cpt = cpt;
    }

    public Datos_Referencia getDatos_Referencia() {
        return datos_referencia;
    }

    public void setDatos_Referencia(Datos_Referencia datos_referencia) {
        this.datos_referencia = datos_referencia;
    }

}
