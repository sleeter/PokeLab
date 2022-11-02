package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove
{
    private static final Type TP = Type.PSYCHIC;
    private static final double Pow = 0.0;
    private static final double Acc = 0.0;

    public CalmMind() {
        super(TP, Pow, Acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect()
            .stat(Stat.SPECIAL_DEFENSE, +1)
            .stat(Stat.SPECIAL_ATTACK, +1);
        p.addEffect(eff);
    }

    @Override
    protected String describe() {
        return "quietly focuses its mind and calms its spirit";
    }
}