package principiossolid.s.practica.fin;

import java.util.List;

public class Usuarios {
    private UsuariosBD bd = new UsuariosBD();

    public List<Usuario> listar() {
        return bd.convertirUsuariosFicheroEnArrayList();
    }

    public Usuario obtener(String username) {
        List<Usuario> usuarios = bd.convertirUsuariosFicheroEnArrayList();

        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(username)) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void crear(Usuario usuario) {
        if (obtener(usuario.nombreUsuario) != null) {
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
