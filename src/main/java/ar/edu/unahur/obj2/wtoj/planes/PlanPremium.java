package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanPremium implements Planeable {

    private Double valorFijo = 12.0;

    public PlanPremium(Double valorFijo) {
        this.valorFijo = valorFijo;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        return valorFijo;
    }
    
}
