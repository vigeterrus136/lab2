package move;

import ru.ifmo.se.pokemon.*;

public final class Snarl extends SpecialMove{
    public Snarl(){
        super(Type.DARK,55,0.95);

    }
    @Override public void applyOppEffects(Pokemon p) {
        Effect snarl = new Effect().chance(1);
        if (snarl.success()){
            snarl.stat(Stat.SPECIAL_ATTACK,-1);
            p.addEffect(snarl);
            System.out.println("snarl: противник ослабевает");
        }
    }
    @Override public String describe(){
        return "кричит, как будто ворчит на что-то";
    }
}
