package principiossolid.l.practica;

import java.util.List;

public abstract class UsuariosBD {

    abstract public void insertar(Usuario usuario);
    abstract public List<Usuario> obtener();
    abstract public void borrar(Usuario usuario);
    abstract public Usuario buscar(Usuario usuario);

}
