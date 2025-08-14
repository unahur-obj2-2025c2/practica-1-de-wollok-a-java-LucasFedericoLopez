package ar.edu.unahur.obj2.wtoj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.contenido.Documental;
import ar.edu.unahur.obj2.wtoj.contenido.Pelicula;

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
        
}
