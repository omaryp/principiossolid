package principiossolid.o.example.despues.interfaz;

public class Coche implements Vehiculo{

    String tipo;

    public Coche(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String getTipoVehiculo() {
       return this.tipo;
    }
    
}
