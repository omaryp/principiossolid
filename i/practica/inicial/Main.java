package principiossolid.i.practica.inicial;

public class Main {
    public static void main(String []args) {

        Usuarios usuarios = new Usuarios(new UsuariosBDMemoria());

        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 10;      
        usuarios.insertar(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open";
        usuario2.apellidos = "Bootcamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 10;
        usuarios.insertar(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.nombreUsuario = "openbootcamp3";
        usuario3.nombre = "Open3";
        usuario3.apellidos = "Bootcamp3";
        usuario3.email = "ejemplos3@open-bootcamp.com";
        usuario3.nivelAcceso = 5;
        usuarios.insertar(usuario3);

        Usuario usuario4 = new Usuario();
        usuario4.nombreUsuario = "openbootcamp4";
        usuario4.nombre = "Open4";
        usuario4.apellidos = "Bootcamp4";
        usuario4.email = "ejemplos3@open-bootcamp.com";
        usuario4.nivelAcceso = 1;
        usuarios.insertar(usuario4);

        Usuario usuario5 = new Usuario();
        usuario5.nombreUsuario = "openbootcamp5";
        usuario5.nombre = "Open5";
        usuario5.apellidos = "Bootcamp5";
        usuario5.email = "ejemplos5@open-bootcamp.com";
        usuario5.nivelAcceso = 1;
        usuarios.insertar(usuario5);

        //Usuario openbootcamp = usuarios.obtener("openbootcamp2");
        //System.out.println(openbootcamp.email);

        usuarios.borrar("openbootcamp2");
        for (Usuario a : usuarios.listar()) {
            System.out.println(a);
        }

        imprimirEstadisticas(usuarios.bd);
    }

    private static void imprimirEstadisticas(UsuariosBD usuarios) {
        if(usuarios instanceof UsuariosBDMemoria){
            System.out.println("Total Inserciones : "+((UsuariosBDMemoria)usuarios).getTotalInserciones());
            System.out.println("Total Eliminaciones : "+((UsuariosBDMemoria)usuarios).getTotalEliminaciones());

        }
    }
}
