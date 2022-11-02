package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove
{

	private static final Type TP = Type.NORMAL;
	private static final double Pow = 0.0;
	private static final double Acc = 0.0;

	public SwordsDance() {
		super(TP, Pow, Acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect eff = new Effect()
			.stat(Stat.ATTACK, 2);
		p.addEffect(eff);
	}
		
	@Override
	protected String describe() {
		return "a frenetic dance to uplift the fighting spirit";
	}
}