package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove
{
    private static final Type TP = Type.NORMAL;
    private static final double Pow = 0.0;
    private static final double Acc = 0.0;

    public Recover() {
        super(TP, Pow, Acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int)(0.5*p.getStat(Stat.HP) + p.getStat(Stat.HP)));
    }

    @Override
    protected String describe() {
        return "restores health";
    }
}