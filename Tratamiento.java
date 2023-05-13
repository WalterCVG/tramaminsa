package hep.tramarefminsa;

public class Tratamiento {

    private Integer nro_tratamiento;
    private Integer cantidad;
    private String codigo_medicamento;
    private String frecuencia;
    private String periodo;
    private String unidad_tiempo;
    private Integer nro_diagnostico;

    public Tratamiento() {
    }

    public Tratamiento(Integer nro_tratamiento, Integer cantidad, String codigo_medicamento, String frecuencia, String periodo, String unidad_tiempo, Integer nro_diagnostico) {
        this.nro_tratamiento = nro_tratamiento;
        this.cantidad = cantidad;
        this.codigo_medicamento = codigo_medicamento;
        this.frecuencia = frecuencia;
        this.periodo = periodo;
        this.unidad_tiempo = unidad_tiempo;
        this.nro_diagnostico = nro_diagnostico;
    }

    public Integer getNro_tratamiento() {
        return nro_tratamiento;
    }

    public void setNro_tratamiento(Integer nro_tratamiento) {
        this.nro_tratamiento = nro_tratamiento;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public void setCodigo_medicamento(String codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getUnidad_tiempo() {
        return unidad_tiempo;
    }

    public void setUnidad_tiempo(String unidad_tiempo) {
        this.unidad_tiempo = unidad_tiempo;
    }

    public Integer getNro_diagnostico() {
        return nro_diagnostico;
    }

    public void setNro_diagnostico(Integer nro_diagnostico) {
        this.nro_diagnostico = nro_diagnostico;
    }

}
