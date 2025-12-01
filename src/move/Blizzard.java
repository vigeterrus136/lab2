package move;
import ru.ifmo.se.pokemon.*;
public final class Blizzard extends SpecialMove{
    public Blizzard(){
        super(Type.ICE,110,0.7);
    }
    @Override protected void applyOppEffects(Pokemon p) {
        Effect bliz = new Effect().chance(0.1);
        if (bliz.success()){
            Effect.freeze(p);
            System.out.println("Blizzard: противник заморожен");
        }
    }
    @Override protected String describe(){
        return "обрушивает на противника ледяной шторм";
    }
}
