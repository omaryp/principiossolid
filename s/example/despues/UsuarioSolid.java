package principiossolid.s.example.despues;

public class UsuarioSolid {
    
    public void crearUsuario(String username){

    }

    public void obtenerUsuario(String username){

    }

    /**
     * el método que estaba antes se quito para crear una clase llamada
     * emailer que se dedique exclusivamente al envío de correos y se relaciona
     * a  travez de una función nueva que tenga que ver con la gestión de usuarios
     */

    public void notificarUsuario(String username){
        Emailer emailer = new Emailer();
        emailer.enviarEmail(username);
    }

}
