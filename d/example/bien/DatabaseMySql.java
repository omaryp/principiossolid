package principiossolid.d.example.bien;

public class DatabaseMySql implements DatabaseStore{

    @Override
    public void guardar(Usuario usuario) {
        System.out.println("guardar() en database Mysql");
    }

}
