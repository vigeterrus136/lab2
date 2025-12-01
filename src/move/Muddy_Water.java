package move;

import ru.ifmo.se.pokemon.*;


public final class Muddy_Water extends SpecialMove{

    public Muddy_Water(){
        super(Type.DARK,90,0.85);
    }
    @Override protected void applyOppEffects(Pokemon p) {
        Effect mud = new Effect().chance(0.3);
        if (mud.success()) {
            mud.stat(Stat.ACCURACY, -1);
            p.addEffect(mud);
            System.out.println("Muddy Water: противник ослабевает");
        }
    }
    @Override protected String describe(){
        return "атакует, выстреливая мутной водой";
    }
}