package move;
import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 1.0);
    }

    @Override public void applySelfEffects(Pokemon p) {
        double currentHP = p.getHP();
        double maxHP = p.getStat(Stat.HP);
        int heal = (int)(maxHP - currentHP);
        p.setMod(Stat.HP, heal);
    }

    @Override public String describe() {
        return "покемон засыпает и полностью восстанавливает себе HP";
    }
}