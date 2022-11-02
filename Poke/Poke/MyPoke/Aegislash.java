package Poke.MyPoke;

import Poke.MyPoke.Move.SwordsDance;
import ru.ifmo.se.pokemon.*;

public class Aegislash extends Doublade
{
	protected static final double HP = 60.0;
	protected static final double Att = 50.0;
	protected static final double Def = 140.0;
	protected static final double SpAtt = 50.0;
	protected static final double SpDef = 140.0;
	protected static final double Speed = 60.0;

	public Aegislash() {
		this("Unknown", 1);
	}

	public Aegislash(String name, int level) {
		super(name, level);
		setStats(HP, Att, Def, SpAtt, SpDef, Speed);
		addMove(new SwordsDance());
	} 
}