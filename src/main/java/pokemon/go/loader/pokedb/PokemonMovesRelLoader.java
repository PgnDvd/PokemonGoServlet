package pokemon.go.loader.pokedb;

import java.io.IOException;
import java.net.MalformedURLException;

import pokemon.go.hibernate.util.HibernateUtil;
import pokemon.go.loader.pokedb.parsers.moves.MoveHMParser;
import pokemon.go.loader.pokedb.parsers.moves.MoveLevelParser;
import pokemon.go.loader.pokedb.parsers.moves.MoveTMParser;

public class PokemonMovesRelLoader {
	public static void main(String[] args) throws MalformedURLException, IOException {
		int pokemonId = 1;
		int gen = 1;
		commitPokemonMovesRel(pokemonId, gen);
		HibernateUtil.close();
	}

	public static void commitPokemonMovesRel(int pokemonId, int gen) throws MalformedURLException, IOException {
		String url = "http://pokemondb.net/pokedex/"+pokemonId+"/moves/"+gen;
		String source = HibernateUtil.getSourceAsString(url);
		System.out.println(source);
		new MoveLevelParser().commitMoves(pokemonId, gen, source);
		new MoveHMParser().commitMoves(pokemonId, gen, source);
		new MoveTMParser().commitMoves(pokemonId, gen, source);
	}

}
