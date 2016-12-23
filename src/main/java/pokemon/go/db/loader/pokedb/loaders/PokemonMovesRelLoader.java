package pokemon.go.db.loader.pokedb.loaders;

import java.io.IOException;
import java.net.MalformedURLException;

import pokemon.go.db.hibernate.util.HibernateUtil;
import pokemon.go.db.loader.pokedb.parsers.moves.MoveBreedParser;
import pokemon.go.db.loader.pokedb.parsers.moves.MoveHMParser;
import pokemon.go.db.loader.pokedb.parsers.moves.MoveLevelParser;
import pokemon.go.db.loader.pokedb.parsers.moves.MoveTMParser;
import pokemon.go.db.loader.pokedb.parsers.moves.MoveTradeParser;
import pokemon.go.db.loader.pokedb.parsers.moves.MoveTutorParser;

public class PokemonMovesRelLoader {
	public static void main(String[] args) throws MalformedURLException, IOException {
		int pokemonId = 1;
		int gen = 6;
		commitPokemonMovesRel(pokemonId, gen);
		HibernateUtil.close();
	}

	public static void commitPokemonMovesRel(int pokemonId, int gen) throws MalformedURLException, IOException {
		String url = "http://pokemondb.net/pokedex/" + pokemonId + "/moves/" + gen;
		String source = HibernateUtil.getSourceAsString(url);
		// System.out.println(source);
		new MoveLevelParser().commitMoves(pokemonId, gen, source);
		new MoveHMParser().commitMoves(pokemonId, gen, source);
		new MoveTMParser().commitMoves(pokemonId, gen, source);
		new MoveBreedParser().commitMoves(pokemonId, gen, source);
		new MoveTutorParser().commitMoves(pokemonId, gen, source);
		new MoveTradeParser().commitMoves(pokemonId, gen, source);
	}

}
