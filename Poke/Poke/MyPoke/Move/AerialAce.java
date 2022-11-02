package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove
{
	private static final Type TP = Type.FLYING;
	private static final double Pow = 60.0;
	private static final double Acc = Double.POSITIVE_INFINITY;

	public AerialAce() {
		super(TP, Pow, Acc);
	}

	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def) {
		return true;
	}
	
	@Override
	protected String describe() {
		return "confounds the foe with speed, then slashes";
	}
}