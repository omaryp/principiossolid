package principiossolid.l.practica;

import java.util.ArrayList;
import java.util.List;

public class UsuariosBDMemoria extends UsuariosBD {
    
    List<Usuario> usuarios = new ArrayList<>();
    
    @Override
    public List<Usuario> obtener() {
       
        return usuarios;

    }

    @Override
    public Usuario buscar(Usuario usuario) {
        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                return usuarioActual;
            }
        }

        return null;
    }

    @Override
    public void insertar(Usuario usuario){
        if(buscar(usuario) != null)
            return;
        
        usuarios.add(usuario);
    }

    @Override
    public void borrar(Usuario usuario){
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                usuarios.remove(i);
                return;
            }
        }

    }

}
