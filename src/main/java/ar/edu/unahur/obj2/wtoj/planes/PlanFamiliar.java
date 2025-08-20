package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanFamiliar extends PlanBasico{

    public PlanFamiliar(Integer limite, Double valorFIjo) {
        super(limite, valorFIjo);
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        Double costoBase = super.costoPlan(usuario);
        return costoBase * 0.85;
    }
}
