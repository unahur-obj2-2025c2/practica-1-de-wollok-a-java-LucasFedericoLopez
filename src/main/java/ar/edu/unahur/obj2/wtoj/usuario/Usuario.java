package ar.edu.unahur.obj2.wtoj.usuario;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.planes.*;
import ar.edu.unahur.obj2.wtoj.contenido.*;
public class Usuario {
    private Planeable planActual;
    private List<Contenido> contenidoVisto = new ArrayList<>();

    public Usuario(Planeable planActual) {
        this.planActual = planActual;
    }

    public void verContenido(Contenido contenido) {
        contenidoVisto.add(contenido);
    }

    public List<Contenido> getContenidoVisto() {
        return contenidoVisto;
    }

    public Planeable getPlanActual() {
        return planActual;
    }

    public void setPlanActual(Planeable planActual) {
        this.planActual = planActual;
    }
    
    public Double costoMensual() {
        return planActual.costoPlan(this);
    }

    public void limpiarContenido() {
        contenidoVisto.clear();
    }

}
