package pokemon.go.db.loader.pokedb.parsers;

import pokemon.go.db.hibernate.model.PokemonStatic;
import pokemon.go.db.hibernate.util.ParsingUtil;

public class CatchRateParser {
	public static double parseCatchRate(PokemonStatic pokemon, String source) {
		String name;
		{
			String start = "<th>Catch rate</th>";
			String end = "\"";
			name = ParsingUtil.middleString(source, start, end);
		}
		{
			String start = "<td>";
			String end = "<";
			name = ParsingUtil.middleString(name, start, end);
		}
		
		double catchRate = Double.parseDouble(name);
		pokemon.setCatchRate(catchRate);
		return catchRate;
	}

}
