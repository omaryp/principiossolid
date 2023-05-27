package principiossolid.i.example.bien.demo1;

import java.util.Calendar;

public class RelojInteligenteImpl implements Reloj,RelojInteligente {
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

    @Override
    public void enviarCorreo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarCorreo'");
    }

    @Override
    public void enviarMensaje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarMensaje'");
    }

}
