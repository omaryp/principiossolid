package principiossolid.l.example.bien;

public class Main {
    public static void main(String[] args) {
        Aritmetica ari = new AritmeticaMejorada();
        ari.suma(3,5);

        Aritmetica arimej = new AritmeticaMejoradaChivata();
        arimej.resta(3,6);
        /**
         * en este caso vemos que se ha sustituido una clase por otra y funciona todo correctamente
         * 
         */
    }
}
