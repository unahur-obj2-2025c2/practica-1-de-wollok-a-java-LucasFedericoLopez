package ar.edu.unahur.obj2.wtoj;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class Plataforma {
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Double facturacionTotal() {
        Double total = 0.0;
        for (Usuario u : usuarios) {
            total += u.costoMensual();
        }
        return total;
    }

    public void cerrarMes() {
        for (Usuario u : usuarios) {
            u.limpiarContenido();
        }
    }
}
