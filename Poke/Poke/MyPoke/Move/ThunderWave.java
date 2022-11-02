package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove
{

	private static final Type TP = Type.ELECTRIC;
	private static final double Pow = 0.0;
	private static final double Acc = 90.0;

	public ThunderWave() {
		super(TP, Pow, Acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect eff = new Effect();
		eff.turns(1);
		eff.condition(Status.PARALYZE);
		eff.paralyze(p);
		eff.attack(0.25);
		p.addEffect(eff);
		p.setMod(Stat.SPEED, (int) (0.5*p.getStat(Stat.SPEED)));
	}
		
	@Override
	protected String describe() {
		return "electric charge is launched at the foe";
	}
}