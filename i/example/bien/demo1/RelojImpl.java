package principiossolid.i.example.bien.demo1;

import java.util.Calendar;

public class RelojImpl implements Reloj{

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

   
}
