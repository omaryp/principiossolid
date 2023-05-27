package principiossolid.d.example.bien;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Omar");

        DatabaseStore db =new DatabaseSqlite();

        guardarEnBaseDatos(db, usuario);
    }

    public static void guardarEnBaseDatos(DatabaseStore dbs, Usuario usuario){
        dbs.guardar(usuario);
    }
}
