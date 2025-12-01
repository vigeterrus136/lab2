package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Crabominable extends Crabrawler {

    public Crabominable(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING, Type.ICE);
        setStats(97,132,77,62,67,43);
        this.addMove(new Brutal_Swing());
        this.addMove(new Facade());
        this.addMove(new Bulk_Up());
        this.addMove(new Blizzard());
    }
}