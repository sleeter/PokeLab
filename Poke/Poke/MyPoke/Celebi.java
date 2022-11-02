package Poke.MyPoke;

import Poke.MyPoke.Move.CalmMind;
import Poke.MyPoke.Move.ChargeBeam;
import Poke.MyPoke.Move.Psychic;
import Poke.MyPoke.Move.Recover;
import ru.ifmo.se.pokemon.*;

public class Celebi extends Pokemon
{
	protected static final double HP = 100.0;
	protected static final double Att = 100.0;
	protected static final double Def = 100.0;
	protected static final double SpAtt = 100.0;
	protected static final double SpDef = 100.0;
	protected static final double Speed = 100.0;

	public Celebi() {
		this("Unknown", 1);
	}

	public Celebi(String name, int level) {
		super(name, level);
		setStats(HP, Att, Def, SpAtt, SpDef, Speed);
		setType(Type.PSYCHIC, Type.GRASS);
		setMove(new Recover(), new ChargeBeam(), new CalmMind(), new Psychic());
	} 
}