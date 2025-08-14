package ar.edu.unahur.obj2.wtoj.contenido;

public class Pelicula extends Contenido {
    public Pelicula(String titulo, double costoBase) {
        super(titulo, costoBase);
    }
    
    @Override
    public Double doCosto() {
        return 0.0;
    }
}
