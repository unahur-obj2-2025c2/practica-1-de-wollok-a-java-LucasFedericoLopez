package ar.edu.unahur.obj2.wtoj.contenido;

public class Episodio {
    private Integer numero;
    private final String titulo;
    private Double costo;

    public Episodio(Integer numero, String titulo, Double costo) {
        this.numero = numero;
        this.titulo = titulo;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}
