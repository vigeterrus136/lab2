package move;
import ru.ifmo.se.pokemon.*;
public final class Facade extends PhysicalMove{
    public boolean doubled = false;
    public Facade(){
        super(Type.NORMAL,70,1.00);
    }
    @Override public double calcBaseDamage(Pokemon att, Pokemon def) {
        double power = this.power;

        Status s = def.getCondition();

        if (s == Status.PARALYZE || s == Status.BURN || s == Status.POISON) {
            power *= 2;
            doubled = true;
        }

        return power;
    }
    @Override public String describe() {
        if (doubled) {
            return "использует приём Facade! Сила атаки УДВОЕНА из-за статуса противника!";
        }
        return "использует приём Facade";
    }
}
