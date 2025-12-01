package move;

import ru.ifmo.se.pokemon.*;


public final class Bite extends PhysicalMove{

    public Bite(){
        super(Type.DARK,60,1.0);
    }
    @Override protected void applyOppEffects(Pokemon p) {
        Effect bite = new Effect().chance(0.3);
        if (bite.success()){
            Effect.flinch(p);
            System.out.println("Bite: эффект flinch был наложен на противника");
        }
    }
    @Override protected String describe(){
        return "кусает противника";
    }
}
