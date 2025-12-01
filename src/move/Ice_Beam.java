package move;
import ru.ifmo.se.pokemon.*;
public final class Ice_Beam extends SpecialMove {
    public Ice_Beam(){
        super(Type.ICE,90,1.0);

    }
    @Override public void applyOppEffects(Pokemon p) {
        Effect beam = new Effect().chance(0.1);
        if (beam.success()){
            Effect.freeze(p);
            System.out.println("Ice Beam: противник заморожен");
        }
    }



    @Override public String describe(){
        return "поражается ледяным лучом энергии";
    }
}
