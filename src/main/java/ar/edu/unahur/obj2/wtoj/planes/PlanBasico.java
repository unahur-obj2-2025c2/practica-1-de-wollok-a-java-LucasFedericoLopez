package ar.edu.unahur.obj2.wtoj.planes;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.usuario.*;

public class PlanBasico implements Planeable{
    private Integer limite;
    private Double valorFijo;
    public PlanBasico(Integer limite, Double valorFijo) {
        this.limite = limite;
        this.valorFijo = valorFijo;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        List<Contenido> vistos = usuario.getContenidoVisto();
        if(vistos.size() <= limite) {
            return valorFijo;
        } else {
            List<Contenido> contenidosExcedente = vistos.subList(limite, vistos.size());
            Double extra = 0.0;
            for (Contenido contenido : contenidosExcedente) {
                extra += contenido.getCostoBase();
            }
            return valorFijo + extra;
        }
    }

}
