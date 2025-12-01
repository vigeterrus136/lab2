package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Crabrawler extends Pokemon {

    public Crabrawler(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING);
        setStats(47,82,57,42,47,63);
        this.addMove(new Brutal_Swing());
        this.addMove(new Facade());
        this.addMove(new Bulk_Up());
    }
}