package principiossolid.i.practica.inicial;

import java.util.ArrayList;
import java.util.List;

public class UsuariosBDMemoria implements UsuariosBD , UsuariosBDEstadisticas{
    
    List<Usuario> usuarios = new ArrayList<>();
    private int totalEliminaciones;
    private int totalInserciones;
    
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
        totalInserciones++;
    }

    @Override
    public void borrar(Usuario usuario){
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                usuarios.remove(i);
                totalEliminaciones++;
                return;
            }
        }

    }

    @Override
    public int getTotalEliminaciones() {
        return totalEliminaciones;
    }

    @Override
    public int getTotalInserciones() {
        return totalInserciones;
    }

}
