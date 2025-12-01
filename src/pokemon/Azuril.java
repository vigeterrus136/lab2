package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Azuril extends Pokemon {

    public Azuril(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FAIRY);
        setStats(50,20,40,20,40,20);
        this.addMove(new Ice_Beam());
        this.addMove(new Rest());
    }
}