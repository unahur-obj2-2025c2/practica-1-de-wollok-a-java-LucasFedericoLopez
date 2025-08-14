package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private Integer numero;
    private List<Episodio> episodios = new ArrayList<>();

    public Temporada(Integer numero) {
        this.numero = numero;
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }
    
    public List<Episodio> getEpisodios() {
        return episodios;
    }
}
