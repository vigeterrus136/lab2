package move;
import ru.ifmo.se.pokemon.*;

public final class Aurora_Beam extends SpecialMove{
    public Aurora_Beam(){
        super(Type.ICE,65,1.0);

    }
    @Override protected void applyOppEffects(Pokemon p) {
        Effect beam = new Effect().chance(0.1);
        if (beam.success()){
            beam.stat(Stat.ATTACK,-1);
            p.addEffect(beam);
            System.out.println("Aurora Beam: противник ослабевает");
        }
    }
    @Override protected String describe(){
        return "выпускает радужный луч";
    }
}
