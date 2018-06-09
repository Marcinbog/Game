package pokemons;

import model.PokemonWater;

public class Squirtle extends PokemonWater {

	public Squirtle(int AP, int DP, int maxHP) {
		super(AP, DP, maxHP);
		super.attackName = "Water Storm";
		super.name = "Squirtle";
	}
	
	public Squirtle(int AP, int DP, int maxHP, String name) {
		this(AP, DP, maxHP);
		super.name = name;
	}

}
