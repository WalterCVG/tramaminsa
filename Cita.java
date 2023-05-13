package hep.tramarefminsa;

public class Cita {

    private String resumeanamnesis;
    private String resumeexfisico;
    private String id_financiador;
    private String num_afil;
    private Double peso;
    private Double talla;
    private Double temperatura;
    private Integer presion_arterial_sistolica;
    private Integer presion_arterial_diastolica;
    private Integer frecuencia_cardiaca;
    private Integer frecuencia_respiratoria;
    private String fecha_vencimiento_sis;

    public Cita() {
    }

    public Cita(String resumeanamnesis, String resumeexfisico, String id_financiador, String num_afil, Double peso, Double talla, Double temperatura, Integer presion_arterial_sistolica, Integer presion_arterial_diastolica, Integer frecuencia_cardiaca, Integer frecuencia_respiratoria, String fecha_vencimiento_sis) {
        this.resumeanamnesis = resumeanamnesis;
        this.resumeexfisico = resumeexfisico;
        this.id_financiador = id_financiador;
        this.num_afil = num_afil;
        this.peso = peso;
        this.talla = talla;
        this.temperatura = temperatura;
        this.presion_arterial_sistolica = presion_arterial_sistolica;
        this.presion_arterial_diastolica = presion_arterial_diastolica;
        this.frecuencia_cardiaca = frecuencia_cardiaca;
        this.frecuencia_respiratoria = frecuencia_respiratoria;
        this.fecha_vencimiento_sis = fecha_vencimiento_sis;
    }

    public String getResumeanamnesis() {
        return resumeanamnesis;
    }

    public void setResumeanamnesis(String resumeanamnesis) {
        this.resumeanamnesis = resumeanamnesis;
    }

    public String getResumeexfisico() {
        return resumeexfisico;
    }

    public void setResumeexfisico(String resumeexfisico) {
        this.resumeexfisico = resumeexfisico;
    }

    public String getId_financiador() {
        return id_financiador;
    }

    public void setId_financiador(String id_financiador) {
        this.id_financiador = id_financiador;
    }

    public String getNum_afil() {
        return num_afil;
    }

    public void setNum_afil(String num_afil) {
        this.num_afil = num_afil;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getPresion_arterial_sistolica() {
        return presion_arterial_sistolica;
    }

    public void setPresion_arterial_sistolica(Integer presion_arterial_sistolica) {
        this.presion_arterial_sistolica = presion_arterial_sistolica;
    }

    public Integer getPresion_arterial_diastolica() {
        return presion_arterial_diastolica;
    }

    public void setPresion_arterial_diastolica(Integer presion_arterial_diastolica) {
        this.presion_arterial_diastolica = presion_arterial_diastolica;
    }

    public Integer getFrecuencia_cardiaca() {
        return frecuencia_cardiaca;
    }

    public void setFrecuencia_cardiaca(Integer frecuencia_cardiaca) {
        this.frecuencia_cardiaca = frecuencia_cardiaca;
    }

    public Integer getFrecuencia_respiratoria() {
        return frecuencia_respiratoria;
    }

    public void setFrecuencia_respiratoria(Integer frecuencia_respiratoria) {
        this.frecuencia_respiratoria = frecuencia_respiratoria;
    }

    public String getFecha_vencimiento_sis() {
        return fecha_vencimiento_sis;
    }

    public void setFecha_vencimiento_sis(String fecha_vencimiento_sis) {
        this.fecha_vencimiento_sis = fecha_vencimiento_sis;
    }
    
}
