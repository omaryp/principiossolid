package principiossolid.i.practica.inicial;

import java.util.List;

public interface UsuariosBD {

    void insertar(Usuario usuario);
    List<Usuario> obtener();
    void borrar(Usuario usuario);
    Usuario buscar(Usuario usuario);

}
