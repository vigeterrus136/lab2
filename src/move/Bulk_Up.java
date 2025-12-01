package move;
import ru.ifmo.se.pokemon.*;
public final class Bulk_Up extends StatusMove {
    public Bulk_Up(){
        super(Type.FIGHTING,0,1.0);

    }
    @Override public void applySelfEffects(Pokemon p) {
        Effect bulk = new Effect().stat(Stat.ATTACK, +1).stat(Stat.DEFENSE, +1);
        p.addEffect(bulk);
    }



    @Override public String describe(){
        return "увеличивает объем тела, усиливая как АТАКУ, так и ЗАЩИТУ";
    }
}
