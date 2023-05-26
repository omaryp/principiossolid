package principiossolid.s.example.antes;

public class Usuario {
    
    public void crearUsuario(String username){

    }

    public void obtenerUsuario(String username){

    }

    /**
     * para este caso la clase Ususario no cumple el principio de responsabilidad
     * debido a que enviar email no tiene nada que ver con la gestion de usuarios    
     */
    public void enviarEmail(String username){

    }
}
