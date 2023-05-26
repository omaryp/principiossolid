package principiossolid.o.practica;

public class UsuariosNiveles extends Usuarios{

    public boolean esAdministrador(Usuario usuario){
        
        return verificarAcceso(usuario, 10);

    }

    public boolean esEstudiante(Usuario usuario){
        
        return verificarAcceso(usuario, 5);

    }

    public boolean esInvitado(Usuario usuario){
        
        return verificarAcceso(usuario, 1);

    }

    private boolean verificarAcceso(Usuario usuario, int nivel){
        if(bd.buscarUsuario(usuario) == null)
            return false;

        if(usuario.nivelAcceso != nivel)
            return false;
        
        return true;
    }

}
