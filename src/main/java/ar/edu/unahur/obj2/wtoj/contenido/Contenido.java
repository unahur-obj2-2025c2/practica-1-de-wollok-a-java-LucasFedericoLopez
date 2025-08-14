package ar.edu.unahur.obj2.wtoj.contenido;

public abstract class Contenido {
    private final String titulo;
    private Double costoBase;

    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    //Template method
    public Double costo() {
        return costoBase + this.doCosto();
    }

    protected abstract Double doCosto();
    
    
}
