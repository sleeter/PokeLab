package Poke.MyPoke;

import Poke.MyPoke.Move.EnergyBall;
import ru.ifmo.se.pokemon.*;

public class Chimecho extends Chingling
{
	protected static final double HP = 75.0;
	protected static final double Att = 50.0;
	protected static final double Def = 80.0;
	protected static final double SpAtt = 95.0;
	protected static final double SpDef = 90.0;
	protected static final double Speed = 65.0;

	public Chimecho() {
		this("Unknown", 1);
	}

	public Chimecho(String name, int level) {
		super(name, level);
		setStats(HP, Att, Def, SpAtt, SpDef, Speed);
		addMove(new EnergyBall());
	} 
}