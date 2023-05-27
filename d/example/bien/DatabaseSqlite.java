package principiossolid.d.example.bien;

public class DatabaseSqlite implements DatabaseStore {

    @Override
    public void guardar(Usuario usuario) {
        System.out.println("guardar() en SQLite");
    }
    
}
