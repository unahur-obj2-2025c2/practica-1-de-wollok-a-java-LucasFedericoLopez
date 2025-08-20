package ar.edu.unahur.obj2.wtoj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.contenido.Documental;
import ar.edu.unahur.obj2.wtoj.contenido.Pelicula;
import ar.edu.unahur.obj2.wtoj.contenido.Serie;
import ar.edu.unahur.obj2.wtoj.planes.*;
import ar.edu.unahur.obj2.wtoj.usuario.*;

public class PlataformaTest {
        @Test
        void dadaUnaPelicula_SeCalculaElCosto() {
                Contenido pelicula = new Pelicula("Superman",10.5);
                assertEquals(10.5, pelicula.costo());
        }

        @Test
        void dadoUnDocumental_SeCalculaElCosto() {
                Contenido documental = new Documental("WW2", 5.3);
                assertEquals(5.8, documental.costo());
        }
         @Test
    public void testPlanBasicoDentroDelLimite() {
        Planeable plan = new PlanBasico(3, 5.0); // límite 3, costo fijo $5
        Usuario usuario = new Usuario(plan);

        usuario.verContenido(new Pelicula("Peli1", 2.0));
        usuario.verContenido(new Serie("Serie1", 3.0));
        usuario.verContenido(new Documental("Doc1", 1.0));

        assertEquals(5.0, usuario.costoMensual(), 0.01); // Solo paga el fijo
    }

    @Test
    public void testPlanBasicoConExcedentes() {
        Planeable plan = new PlanBasico(2, 5.0); // límite 2, costo fijo $5
        Usuario usuario = new Usuario(plan);

        usuario.verContenido(new Pelicula("Peli1", 2.0));
        usuario.verContenido(new Serie("Serie1", 3.0));
        usuario.verContenido(new Pelicula("Peli2", 4.0)); // excedente

        assertEquals(9.0, usuario.costoMensual(), 0.01); 
        // 5 fijo + 4 (excedente)
    }

    @Test
    public void testCambioDePlanAFamiliar() {
        Planeable planBasico = new PlanBasico(2, 5.0);
        Usuario usuario = new Usuario(planBasico);

        // Consume 3 contenidos → uno excedente
        usuario.verContenido(new Pelicula("Peli1", 2.0));
        usuario.verContenido(new Serie("Serie1", 3.0));
        usuario.verContenido(new Pelicula("Peli2", 4.0)); // excedente

        // Con plan básico: 5 + 4 = 9
        assertEquals(9.0, usuario.costoMensual(), 0.01);

        // Cambia a Plan Familiar
        usuario.setPlanActual(new PlanFamiliar(2, 5.0));

        // Ahora: (5 + 4) * 0.85 = 7.65
        assertEquals(7.65, usuario.costoMensual(), 0.01);
    }

    @Test
    public void testFacturacionTotalPlataforma() {
        Plataforma plataforma = new Plataforma();

        Usuario u1 = new Usuario(new PlanBasico(2, 5.0));
        Usuario u2 = new Usuario(new PlanFamiliar(2, 5.0));

        u1.verContenido(new Pelicula("Peli1", 2.0));
        u1.verContenido(new Serie("Serie1", 3.0));
        u1.verContenido(new Pelicula("Peli2", 4.0)); // excedente

        u2.verContenido(new Pelicula("Peli1", 2.0));
        u2.verContenido(new Serie("Serie1", 3.0));

        plataforma.registrarUsuario(u1);
        plataforma.registrarUsuario(u2);

        // u1: 5 + 4 = 9
        // u2: 5 (dentro del límite) * 0.85 = 4.25
        assertEquals(13.25, plataforma.facturacionTotal(), 0.01);
    }
}
