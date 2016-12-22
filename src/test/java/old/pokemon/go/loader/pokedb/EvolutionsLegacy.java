package old.pokemon.go.loader.pokedb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pokemon.go.db.enums.PokemonEnum;

public class EvolutionsLegacy {
	public static void main(String[] args) {
			int evolutionLevel;
			int evolutionId;
			String source = "";
			String name = "";
			{
				Map<Integer, PokemonEnum> evolutions = getEvolutions(source);
				int index = 0;
				for(Entry<Integer, PokemonEnum> evolution: evolutions.entrySet()){
					if(evolution.getValue().toString().equals(name.replace("nidoran-f", "nidoranF").replace("nidoran-m", "nidoranM"))){
						try{
							Integer[] evolutionsLevels = evolutions.keySet().toArray(new Integer[0]);
							evolutionLevel = evolutionsLevels[index+1];
							//							PokemonEnum[] evolutionsNames = evolutions.values().toArray(new PokemonEnum[0]);
							//							evolutionId = evolutionsNames[index+1].getId();
							Collection<PokemonEnum> evolutionsNames = evolutions.values();
							Iterator<PokemonEnum> iterator = evolutionsNames.iterator();
							for(int i = 0; i<index+1; i++){
								evolutionId = iterator.next().getId();
							}
						}
						catch(ArrayIndexOutOfBoundsException e){
						}
					}
					index++;
				}
				//				System.out.println(evolutions);
			}
	}
	
	private static Map<Integer, PokemonEnum> getEvolutions(String source) {
		Map<Integer, PokemonEnum> evolutions = new HashMap<>();
		String start = "<h2>Evolution chart</h2>";
		String end = "</span>\n" + 
				"</div>";
		String typesHtml = middleString(source, start, end);
		//			System.out.println(types);
		List<String> levels = new ArrayList<>();
		List<String> evolutionsNames = new ArrayList<>();
		{
			String pattern1 = "(Level ";
			String pattern2 = ")";
			String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
			Pattern pattern = Pattern.compile(regexString);
			// text contains the full text that you want to extract data
			Matcher matcher = pattern.matcher(typesHtml);
			while (matcher.find()) {
				String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
				levels.add(textInBetween);
				// You can insert match into a List/Collection here
			}
			//			System.out.println(levels);
		}
		{
			String pattern1 = "<a href=\"/pokedex/";
			String pattern2 = "\"";
			String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
			Pattern pattern = Pattern.compile(regexString);
			// text contains the full text that you want to extract data
			Matcher matcher = pattern.matcher(typesHtml);
			while (matcher.find()) {
				String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
				evolutionsNames.add(textInBetween);
				// You can insert match into a List/Collection here
			}
			//			System.out.println(evolutionsNames);
		}
		try{
			evolutions.put(-1, PokemonEnum.valueOf(evolutionsNames.get(0).replace("nidoran-f", "nidoranF").replace("nidoran-m", "nidoranM")));
		}
		catch(Exception e){

		}
		for (int i = 0; i<levels.size(); i++){
			int level = Integer.parseInt(levels.get(i).replaceAll("[\\D]", ""));

			evolutions.put(level, PokemonEnum.valueOf(evolutionsNames.get(i+1)));
		}
		return evolutions;
	}
	
	private static String middleString(String source, String start, String end) {
		try{
			int beginIndex = source.indexOf(start)+start.length();
			if(beginIndex == start.length()-1){
				return "";
			}
			int endIndex = source.indexOf(end, beginIndex);
			String middle = source.substring(beginIndex, endIndex);
			return middle;
		}
		catch(Exception e){
			return "";
		}
	}


}
