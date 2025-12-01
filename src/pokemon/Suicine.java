package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Suicine extends Pokemon {

    public Suicine(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(100,75,115,90,115,85);
        this.addMove(new Bite());
        this.addMove(new Extrasensory());
        this.addMove(new Aurora_Beam());
        this.addMove(new Snarl());
    }
}
