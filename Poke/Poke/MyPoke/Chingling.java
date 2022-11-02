package Poke.MyPoke;

import Poke.MyPoke.Move.ChargeBeam;
import Poke.MyPoke.Move.DazzlingGleam;
import Poke.MyPoke.Move.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Chingling extends Pokemon
{
	protected static final double HP = 45.0;
	protected static final double Att = 30.0;
	protected static final double Def = 50.0;
	protected static final double SpAtt = 65.0;
	protected static final double SpDef = 50.0;
	protected static final double Speed = 45.0;

	public Chingling() {
		this("Unknown", 1);
	}

	public Chingling(String name, int level) {
		super(name, level);
		setStats(HP, Att, Def, SpAtt, SpDef, Speed);
		setType(Type.PSYCHIC);
		setMove(new DazzlingGleam(), new ChargeBeam(), new ThunderWave());
	} 
}