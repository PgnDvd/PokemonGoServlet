package pokemon.go.db.loader.pokedb.parsers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import pokemon.go.db.hibernate.model.PokemonStatic;
import pokemon.go.db.hibernate.util.ParsingUtil;

public class SpriteParser {
	
	public static List<String> parseSprites(PokemonStatic pokemon, int pokemonId) throws MalformedURLException, IOException {
		String spec = "http://pokemondb.net/sprites/"+pokemonId;
		String source = ParsingUtil.getSourceAsString(spec);

		List<String> sprites = new ArrayList<>();
		//		System.out.println(source);
		String pattern1 = "<span class=\"sprites-table-img\">";
		String pattern2 = "</span>";

		Pair<String, Integer> middle = new ImmutablePair<String, Integer>("", 0);
		while(middle.getRight()!=-1){
			middle = ParsingUtil.middleString(source, pattern1, pattern2, middle.getRight());
			//			System.out.println(middle.getLeft());
			String sprite = ParsingUtil.middleString(middle.getLeft(), "<a href=\"", "\" ");
			//			System.out.println(sprite);
			if(StringUtils.isNotEmpty(sprite)){
				sprites.add(sprite);
			}
		}
		//		String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
		//		Pattern pattern = Pattern.compile(regexString);
		//		// text contains the full text that you want to extract data
		//		Matcher matcher = pattern.matcher(source);

		//		while (matcher.find()) {
		//			String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
		//			System.out.println(textInBetween);
		//			String start = "<img src=\"";
		//			String end = "\"";
		//			String sprite = middleString(textInBetween, start, end);
		//
		//			sprites.add(sprite);
		//		}
		pokemon.setSprites(sprites);
		return sprites;

	}
	
}
