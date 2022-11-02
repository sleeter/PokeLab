package Poke.MyPoke;

import Poke.MyPoke.Move.AerialAce;
import Poke.MyPoke.Move.Rest;
import ru.ifmo.se.pokemon.*;

public class Honedge extends Pokemon
{
	protected static final double HP = 45.0;
	protected static final double Att = 80.0;
	protected static final double Def = 100.0;
	protected static final double SpAtt = 35.0;
	protected static final double SpDef = 37.0;
	protected static final double Speed = 28.0;

	public Honedge() {
		this("Unknown", 1);
	}

	public Honedge(String name, int level) {
		super(name, level);
		setStats(HP, Att, Def, SpAtt, SpDef, Speed);
		setType(Type.STEEL, Type.GHOST);
		setMove(new AerialAce(), new Rest());
	} 
}