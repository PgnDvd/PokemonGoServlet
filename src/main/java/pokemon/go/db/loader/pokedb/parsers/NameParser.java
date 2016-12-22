package pokemon.go.db.loader.pokedb.parsers;

import pokemon.go.db.hibernate.model.PokemonStatic;
import pokemon.go.db.hibernate.util.ParsingUtil;

public class NameParser {
	public static String parseName(PokemonStatic pokemon, String source) {
		String name;
		String start = "<link rel=\"canonical\" href=\"http://pokemondb.net/pokedex/";
		String end = "\">";
		name = ParsingUtil.middleString(source, start, end);
		pokemon.setName(name);
		return name;
	}
}
