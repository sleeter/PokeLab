package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove
{

	private static final Type TP = Type.FAIRY;
	private static final double Pow = 80.0;
	private static final double Acc = 100.0;

	public DazzlingGleam() {
		super(TP, Pow, Acc);
	}
			
	@Override
	protected String describe() {
		return "damages opposing Pokemon by emitting a powerful flash";
	}
}