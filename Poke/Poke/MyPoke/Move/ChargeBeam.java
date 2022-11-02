package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove
{

	private static final Type TP = Type.ELECTRIC;
	private static final double Pow = 50.0;
	private static final double Acc = 90.0;

	public ChargeBeam() {
		super(TP, Pow, Acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect eff = new Effect()
			.chance(0.7)
			.stat(Stat.SPECIAL_ATTACK, +1);
		p.addEffect(eff);
	}
		
	@Override
	protected String describe() {
		return "fires a concentrated bundle of electricity";
	}
}