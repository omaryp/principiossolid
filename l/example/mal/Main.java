package principiossolid.l.example.mal;


public class Main {
    
    public static void main(String[] args) {
        Aritmetica ari = new Aritmetica();
        ari.suma(3,5);

        Aritmetica arimej = new AritmeticaMejorada();
        arimej.resta(3,6);

        /*
         * aqui tenemos un problema con el principio de liskov ya que si sustituimos
         * la clase AritmeticaMejorada por Aritmetica no podemos accedera los métodos 
         * de resta y division.
         */
    }
}
