package model;

public abstract class PokemonFire extends Pokemon {

	public PokemonFire(int AP, int DP, int maxHP) {
		super(AP, DP, maxHP);
		super.type = PokemonType.FIRE;
		super.weakAgainst = PokemonType.WATER;
		super.strongAgainst = PokemonType.GRASS;
	}

}
