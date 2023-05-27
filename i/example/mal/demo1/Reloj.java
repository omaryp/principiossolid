package principiossolid.i.example.mal.demo1;

public interface Reloj {

    String horaActual();
    String minutoActual();
    String segundoActual();

    /**
     * Con estos método estoy engordando la interfáz y todas las clases que implementes
     * esta interfaz está obligando a estas que usen métodos que no necesitan.
     */
    void enviarCorreo();
    void enviarMensaje();
}
