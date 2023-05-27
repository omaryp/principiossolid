package principiossolid.l.practica;

import java.util.List;

public class Usuarios {

    private UsuariosBD bd ;

    public Usuarios(UsuariosBD bd){
        this.bd = bd;
    }

    public List<Usuario> listar() {
        return bd.obtener();
    }

    public Usuario obtener(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        return bd.buscar(usuario);
    }

    public void insertar(Usuario usuario) {
        if (bd.buscar(usuario)!= null) {
            return;
        }
        bd.insertar(usuario);
    }

    public void borrar(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        bd.borrar(usuario);
        
    }


}
