package pokemon.go.db.loader.pokedb.parsers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pokemon.go.db.enums.PokemonType;
import pokemon.go.db.hibernate.model.PokemonStatic;
import pokemon.go.db.hibernate.util.ParsingUtil;

public class TypesParser {
	public static void parseTypes(PokemonStatic pokemon, String source) {
		PokemonType type1 = PokemonType.VOID;
		PokemonType type2 = PokemonType.VOID;
		List<String> types =  getTypes(source);
		type1 = PokemonType.valueOf(types.get(0).toUpperCase());
		if(types.size()>1){
			type2 = PokemonType.valueOf(types.get(1).toUpperCase());
		}
		else{
			type2 = PokemonType.VOID;
		}
		pokemon.setType1(type1);
		pokemon.setType2(type2);
	}

	private static List<String> getTypes(String source) {
		List<String> types = new ArrayList<>();
		String start = "<th>Type</th>";
		String end = "</tr>";
		String typesHtml = ParsingUtil.middleString(source, start, end);
		//			System.out.println(types);
		String pattern1 = "<a class=\"type-icon type-";
		String pattern2 = "\"";
		String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
		Pattern pattern = Pattern.compile(regexString);
		// text contains the full text that you want to extract data
		Matcher matcher = pattern.matcher(typesHtml);
		while (matcher.find()) {
			String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
			types.add(textInBetween);
			// You can insert match into a List/Collection here
		}
		return types;
	}

}
