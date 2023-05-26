package principiossolid.o.example.despues.interfaz;

public class CocheElectrico implements Vehiculo {
    
    String tipo;
    String baterias;

    public CocheElectrico(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String getTipoVehiculo() {
       return this.tipo;
    }

    public String getBaterias() {
        return baterias;
    }
}
