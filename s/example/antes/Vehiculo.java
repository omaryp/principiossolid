package principiossolid.s.example.antes;

public class Vehiculo {
    private int velocidad; 

    public void acelerar(){
        velocidad ++;
    }

    public void frenar(){
        velocidad--;
    }

    public int getVelocidad(){
        return velocidad;
    }

    /**
     * Lo mismo para para el caso de vehículo ya que echar gasolina es una acción externa 
     * a la funcionalidad del vehículo
     */
    public void echarGasolina(){

    }
}
