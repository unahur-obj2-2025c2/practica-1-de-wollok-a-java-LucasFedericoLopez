package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{

    private List<Temporada> temporadas = new ArrayList<>();

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
        
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    @Override
    protected Double doCosto() {
        List<Episodio> todosLosEpisodios = new ArrayList<>();
        for (Temporada t : temporadas) {
            todosLosEpisodios.addAll(t.getEpisodios());
        }
        if (todosLosEpisodios.isEmpty()) {
            return 0.0;
        }

        Double sumaEpisodios = 0.0;
        for (Episodio e : todosLosEpisodios) {
            sumaEpisodios += e.getCosto();
        }

        Double promedio = sumaEpisodios / todosLosEpisodios.size();

        return promedio;
    }
    
}
