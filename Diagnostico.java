package hep.tramarefminsa;

public class Diagnostico {

    private String diagnostico;
    private String tipo_diagnostico;
    private Integer nro_diagnostico;

    public Diagnostico() {
    }

//    public List<String> diagnostico;
//     public Diagnostico(List<String> diagnostico) {
//        this.diagnostico = diagnostico;
//    }
//    
   
    
    public Diagnostico(String diagnostico, String tipo_diagnostico, Integer nro_diagnostico) {
        this.diagnostico = diagnostico;
        this.tipo_diagnostico = tipo_diagnostico;
        this.nro_diagnostico = nro_diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTipo_diagnostico() {
        return tipo_diagnostico;
    }

    public void setTipo_diagnostico(String tipo_diagnostico) {
        this.tipo_diagnostico = tipo_diagnostico;
    }

    public Integer getNro_diagnostico() {
        return nro_diagnostico;
    }

    public void setNro_diagnostico(Integer nro_diagnostico) {
        this.nro_diagnostico = nro_diagnostico;
    }

}
