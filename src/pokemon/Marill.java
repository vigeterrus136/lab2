package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Marill extends Azuril {

    public Marill(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FAIRY);
        setStats(70,20,50,20,50,40);
        this.addMove(new Muddy_Water());
    }
}