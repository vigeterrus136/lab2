package move;

import ru.ifmo.se.pokemon.*;

public final class Extrasensory extends SpecialMove {
    public Extrasensory() {
        super(Type.PSYCHIC, 80, 1.0);
    }

    @Override public void applyOppEffects(Pokemon p) {
        Effect ext = new Effect().chance(0.1);
        if (ext.success()){
            Effect.flinch(p);
            System.out.println("Extrasensory: эффект flinch был наложен на противника");
        }
    }

    @Override public String describe() {
        return "атакует странной, невидимой силой";
    }
}