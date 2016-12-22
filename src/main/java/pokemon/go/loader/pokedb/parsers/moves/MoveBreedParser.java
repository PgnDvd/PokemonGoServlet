package pokemon.go.loader.pokedb.parsers.moves;

import java.util.List;

import pokemon.go.enums.MoveMechanism;
import pokemon.go.hibernate.model.MoveStatic;
import pokemon.go.hibernate.model.PokemonMove;
import pokemon.go.hibernate.model.PokemonStatic;

public class MoveBreedParser extends MoveAbstractParser {

	@Override
	protected PokemonMove createPokemonMoveInstance(int gen, String level, List<MoveStatic> list,
			PokemonStatic pokemon) {
		PokemonMove pokemonMove = new PokemonMove(pokemon, list.get(0), gen, -1, null, MoveMechanism.BREED);
		return pokemonMove;
	}

	@Override
	protected String getStartingString() {
		String start = "<h3>Egg moves</h3";
		return start;
	}

}
