package ar.edu.unahur.obj2.wtoj.contenido;

public class Documental extends Contenido{

    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    @Override
    protected Double doCosto() {
        return IDRA.getInstance().getValor();
    }

}
