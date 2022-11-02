package Poke.MyPoke;

import Poke.MyPoke.Move.Tackle;
import ru.ifmo.se.pokemon.*;

public class Doublade extends Honedge
{
	protected static final double HP = 59.0;
	protected static final double Att = 110.0;
	protected static final double Def = 150.0;
	protected static final double SpAtt = 45.0;
	protected static final double SpDef = 49.0;
	protected static final double Speed = 35.0;

	public Doublade() {
		this("Unknown", 1);
	}

	public Doublade(String name, int level) {
		super(name, level);
		setStats(HP, Att, Def, SpAtt, SpDef, Speed);
		addMove(new Tackle());
	} 
}