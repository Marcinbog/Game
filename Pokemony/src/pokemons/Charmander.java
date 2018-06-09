package pokemons;


import model.PokemonFire;


public class Charmander extends PokemonFire {

	public Charmander(int AP, int DP, int maxHP) {
		super(AP, DP, maxHP);
		super.attackName = "Fire Storm";
		super.name = "Charmander";
	}
	
	public Charmander(int AP, int DP, int maxHP, String name) {
		this(AP, DP, maxHP);
		super.name = name;
	}
	
}
