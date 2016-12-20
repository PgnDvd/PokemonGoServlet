package pokemon.go.loader.pokedb.parsers.moves;

import java.util.List;

import org.hibernate.Query;

import pokemon.go.enums.MoveEnum;
import pokemon.go.enums.MoveMechanism;
import pokemon.go.hibernate.model.MoveStatic;
import pokemon.go.hibernate.model.PokemonMove;
import pokemon.go.hibernate.model.PokemonStatic;
import pokemon.go.hibernate.util.HibernateUtil;
import pokemon.go.hibernate.util.ParsingUtil;

public class MoveHMParser extends MoveAbstractParser{

	@Override
	protected PokemonMove createPokemonMoveInstance(int gen, String level, List<MoveStatic> list,
			PokemonStatic pokemon) {
		PokemonMove pokemonMove = new PokemonMove(pokemon, list.get(0), gen, -1, level, MoveMechanism.HM);
		return pokemonMove;
	}

	@Override
	protected String getStartingString() {
		String start = "<h3>Moves learnt by TM</h3>";
		return start;
	}
	
}
