package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Azumarill extends Marill {

    public Azumarill(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FAIRY);
        setStats(100,50,80,60,80,50);
        this.addMove(new Facade());
    }
}