package principiossolid.o.practica;

public class Usuario {
    public String nombreUsuario;
    public String nombre;
    public String apellidos;
    public String email = "";
    public int nivelAcceso;
    
    @Override
    public String toString() {
        return "Usuario [nombreUsuario=" + nombreUsuario + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", email=" + email + ", nivelAcceso=" + nivelAcceso + "]";
    }

    
}
