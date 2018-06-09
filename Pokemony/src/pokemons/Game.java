package pokemons;

import exceptions.BadPotionException;
import exceptions.DeadPokemonException;
//import model.Pokemon;

public class Game {

	public static void main(String[]args){
		
		Bulbasaur Bulbasaur = new Bulbasaur(40, 20, 100 );
		Charmander Charmander = new Charmander(40, 51, 10);
		//Squirtle Squirtle = new Squirtle (40, 11, 10);
		
		Bulbasaur.attack(Charmander);
		Charmander.attack(Bulbasaur);
		
		try {
			
			Charmander .heal(10);
		} catch (BadPotionException | DeadPokemonException e) {
				e.printStackTrace();
		}
	}
}

