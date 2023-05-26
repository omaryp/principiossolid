package principiossolid.o.practica;

public class UsuariosBDEstadísticas extends UsuariosBD{
    
    private int total_inserciones;
    private int total_elminaciones;

    @Override
    public void borrarUsuario(Usuario usuario) {
        
        super.borrarUsuario(usuario);
        total_elminaciones++;
    }

    @Override
    public void insertarUsuario(Usuario usuario) {
        
        super.insertarUsuario(usuario);
        total_inserciones++;
    }

    public int getTotal_inserciones() {
        return total_inserciones;
    }

    public int getTotal_elminaciones() {
        return total_elminaciones;
    }

}
