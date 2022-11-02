package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove
{

	private static final Type TP = Type.PSYCHIC;
	private static final double Pow = 0.0;
	private static final double Acc = 0.0;

	public Rest() {
		super(TP, Pow, Acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect eff = new Effect();
		eff.turns(2);
		eff.condition(Status.SLEEP);
		eff.sleep(p);
		p.addEffect(eff);
		p.setMod(Stat.HP, (int)p.getHP());
	}
		
	@Override
	protected String describe() {
		return "goes to sleep and fully restores";
	}
}