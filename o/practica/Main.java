package principiossolid.o.practica;

public class Main {
    public static void main(String []args) {

        UsuariosNiveles usuarios = new UsuariosNiveles();

        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 10;      
        usuarios.crear(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open";
        usuario2.apellidos = "Bootcamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 10;
        usuarios.crear(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.nombreUsuario = "openbootcamp3";
        usuario3.nombre = "Open3";
        usuario3.apellidos = "Bootcamp3";
        usuario3.email = "ejemplos3@open-bootcamp.com";
        usuario3.nivelAcceso = 5;
        usuarios.crear(usuario3);

        Usuario usuario4 = new Usuario();
        usuario4.nombreUsuario = "openbootcamp4";
        usuario4.nombre = "Open4";
        usuario4.apellidos = "Bootcamp4";
        usuario4.email = "ejemplos3@open-bootcamp.com";
        usuario4.nivelAcceso = 1;
        usuarios.crear(usuario4);

        //Usuario openbootcamp = usuarios.obtener("openbootcamp2");
        //System.out.println(openbootcamp.email);

        //usuarios.borrar("openbootcamp2");
        for (Usuario a : usuarios.listar()) {
            System.out.println(a);
            System.out.println(a.nombreUsuario +" -> es administrador : "+usuarios.esAdministrador(a));
        }

        System.out.println("inserciones -> "+usuarios.bd.getTotal_inserciones());
        System.out.println("eliminaciones -> "+usuarios.bd.getTotal_elminaciones());

    }
}
