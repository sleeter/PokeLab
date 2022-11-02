package Poke.MyPoke.Move;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove
{
	private static final Type TP = Type.NORMAL;
	private static final double Pow = 40.0;
	private static final double Acc = 100;

	public Tackle() {
		super(TP, Pow, Acc);
	}
	
	@Override
	protected String describe() {
		return "charges and slams into the foe with its whole body";
	}
}