package principiossolid.o.example.despues.clase;

public abstract class Vehiculo {
    String tipo;

    public Vehiculo(String tipo){
        this.tipo = tipo;
    }

    public String getTipoVehiculo(){
        return tipo;
    }
}
