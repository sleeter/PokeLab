package Poke;

import ru.ifmo.se.pokemon.*;
import Poke.MyPoke.*;

public class Poke{
	public static void main(String[] args) {
		Battle b = new Battle();

		Honedge n1 = new Honedge("Ivan", 21);
		Doublade n2 = new Doublade("Svetlana", 21);
		Aegislash n3 = new Aegislash("Felix", 50);

		Celebi b1 = new Celebi("Timur", 60);
		Chimecho b2 = new Chimecho("Irina", 73);
		Chingling b3 = new Chingling("Jessika", 73);

		b.addAlly(n1);
		b.addAlly(n2);
		b.addAlly(n3);

		b.addFoe(b1);
		b.addFoe(b2);
		b.addFoe(b3);

		b.go();
	}
}