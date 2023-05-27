package principiossolid.l.example.bien;

public class AritmeticaMejorada extends Aritmetica {
     
    @Override
    public int resta(int a, int b){
        return a - b;
    }

    @Override
    public int division(int a, int b){
        return a / b;
    }

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }
}
