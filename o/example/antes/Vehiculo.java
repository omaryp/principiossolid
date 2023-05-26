package principiossolid.o.example.antes;

public class Vehiculo {
    String tipo;
    //nueva funcionalidad
    String baterias;

    public Vehiculo(String tipo){
        this.tipo = tipo;
    }

    public String getTipoVehiculo(){
        return this.tipo;
    }

    
    /**
     * hasta aqui no hay problema, pero que pasa si se quiere agregar nueva funcionalidad,
     * por ejemplo ver si el vehiculo tiene baterías modificando la clase original, esto rompe 
     * el principio de abierto cerrado ya que se está modificando la clase,
     * 
     * Lo que se podemos hacer es crear una clase nueva derivando de la clase original.
     * 
     * Se puede hacer de dos formas, intefaces ó clases abstractas
     * 
     */
    public String getBaterias() {
        return baterias;
    }

    

}
