package move;

import ru.ifmo.se.pokemon.*;

public final class Brutal_Swing extends PhysicalMove{
    public Brutal_Swing(){
        super(Type.DARK,60,1.0);
    }
    @Override protected String describe(){
        return "яростно размахивает своим телом, нанося урон всему вокруг";
    }
}


