package principiossolid.d.example.mal;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Database bd =  new Database();

        bd.guardar(usuario);
    }
}
