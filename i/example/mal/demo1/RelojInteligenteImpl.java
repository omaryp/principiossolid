package principiossolid.i.example.mal.demo1;

import java.util.Calendar;

public class RelojInteligenteImpl implements Reloj {
    @Override
    public String horaActual() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY)+"";
    }

    @Override
    public String minutoActual() {
        return Calendar.getInstance().get(Calendar.MINUTE)+"";
    }

    @Override
    public String segundoActual() {
        return Calendar.getInstance().get(Calendar.SECOND)+"";
    }

    public void enviarCorreo(){
        
    }

    public void enviarMensaje(){

    }
}
