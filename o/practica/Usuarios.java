package principiossolid.o.practica;

import java.util.List;

public class Usuarios {

    UsuariosBDEstadísticas bd = new UsuariosBDEstadísticas();

    public List<Usuario> listar() {
        return bd.convertirUsuariosFicheroEnArrayList();
    }

    public Usuario obtener(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        return bd.buscarUsuario(usuario);
    }

    public void crear(Usuario usuario) {
        if (bd.buscarUsuario(usuario)!= null) {
            return;
        }
        bd.insertarUsuario(usuario);
    }

    public void borrar(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        bd.borrarUsuario(usuario);
        
    }


}
