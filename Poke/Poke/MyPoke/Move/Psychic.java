package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove
{
	private static final Type TP = Type.PSYCHIC;
	private static final double Pow = 90.0;
	private static final double Acc = 100.0;

	public Psychic() {
		super(TP, Pow, Acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect eff = new Effect()
			.chance(0.1)
			.stat(Stat.SPECIAL_DEFENSE, -1);
		p.addEffect(eff);
	}

	@Override
	protected String describe() {
		return "hit by a strong telekinetic force";
	}

}