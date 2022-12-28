package adapter.relogio;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {

    // essa classe esconde do sistema a complexidade de lidar com uma API legada
    @Override
    public Calendar hoje() {
        return Calendar.getInstance();
    }
}
