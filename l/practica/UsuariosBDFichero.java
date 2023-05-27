package principiossolid.l.practica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuariosBDFichero extends UsuariosBD {
    
    private String ficheroDatos;
    
    public UsuariosBDFichero(){
        this.ficheroDatos = "usuarios.txt";
    }

    @Override
    public List<Usuario> obtener() {
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return usuarios;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        List<Usuario> usuarios = obtener();

        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                return usuarioActual;
            }
        }

        return null;
    }

    @Override
    public void insertar(Usuario usuario){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separarUsuarioPorComas(usuario));
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    private String separarUsuarioPorComas(Usuario usuario) {
        return usuario.nombreUsuario + ","
                 + usuario.nombre + ","
                 + usuario.apellidos + ","
                 + usuario.email + ","
                 + usuario.nivelAcceso;
    }

    @Override
    public void borrar(Usuario usuario){
        List<Usuario> usuarios = obtener();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                usuarios.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Usuario usuarioActual : usuarios) {
                String usuarioComas = separarUsuarioPorComas(usuarioActual);
                printStream.println(usuarioComas);
            }
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
        }
        
    }

}
