package pokemon.go.db.loader.pokedb.parsers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pokemon.go.db.hibernate.model.PokemonStatic;
import pokemon.go.db.hibernate.util.ParsingUtil;

public class StatParser {
	public static void parseStats(PokemonStatic pokemon, String source) {
		parseHp(pokemon, source);
		parseAttack(pokemon, source);
		parseDefense(pokemon, source);
		parseSpAtk(pokemon, source);
		parseSpDefense(pokemon, source);
		parseSpeed(pokemon, source);
	}

	private static void parseHp(PokemonStatic pokemon, String source) {
			String start = "<th>HP</th>";
			Matcher matcher = getMatcher(source, start);
			int i = 0;
			while (matcher.find()) {
				String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
				if(i==0){
					int baseHp = Integer.parseInt(textInBetween);
					pokemon.setBaseHp(baseHp);
				}
				if(i==1){
					int minMaxHp = Integer.parseInt(textInBetween);
					pokemon.setMinMaxHp(minMaxHp);
				}
				if(i==2){
					int maxMaxHp = Integer.parseInt(textInBetween);
					pokemon.setMaxMaxHp(maxMaxHp);
				}
				i++;
			}
		
	}

	private static void parseAttack(PokemonStatic pokemon, String source) {
		String start = "<th>Attack</th>";
		Matcher matcher = getMatcher(source, start);

		int i = 0;
		while (matcher.find()) {
			String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
			if(i==0){
				int baseAttack = Integer.parseInt(textInBetween);
				pokemon.setBaseAttack(baseAttack);
			}
			if(i==1){
				int minMaxAttack = Integer.parseInt(textInBetween);
				pokemon.setMinMaxAttack(minMaxAttack);
			}
			if(i==2){
				int maxMaxAttack = Integer.parseInt(textInBetween);
				pokemon.setMaxMaxAttack(maxMaxAttack);
			}
			i++;
		}
	}
	
	
	private static void parseDefense(PokemonStatic pokemon, String source) {
		String start = "<th>Defense</th>";
		Matcher matcher = getMatcher(source, start);

		int i = 0;
		while (matcher.find()) {
			String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
			if(i==0){
				int baseDefense = Integer.parseInt(textInBetween);
				pokemon.setBaseDefense(baseDefense);
			}
			if(i==1){
				int minMaxDefense = Integer.parseInt(textInBetween);
				pokemon.setMinMaxDefense(minMaxDefense);
			}
			if(i==2){
				int maxMaxDefense = Integer.parseInt(textInBetween);
				pokemon.setMaxMaxDefense(maxMaxDefense);
			}
			i++;
		}
	}

	private static void parseSpAtk(PokemonStatic pokemon, String source) {
		String start = "<th>Sp. Atk</th>";
		Matcher matcher = getMatcher(source, start);

		int i = 0;
		while (matcher.find()) {
			String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
			if(i==0){
				int baseSpAtk = Integer.parseInt(textInBetween);
				pokemon.setBaseSpAtk(baseSpAtk);
			}
			if(i==1){
				int minMaxSpAtk = Integer.parseInt(textInBetween);
				pokemon.setMinMaxSpAtk(minMaxSpAtk);
			}
			if(i==2){
				int maxMaxSpAtk = Integer.parseInt(textInBetween);
				pokemon.setMaxMaxSpAtk(maxMaxSpAtk);
			}
			i++;
		}
	}
	
	private static void parseSpDefense(PokemonStatic pokemon, String source) {
		String start = "<th>Sp. Def</th>";
		Matcher matcher = getMatcher(source, start);

		int i = 0;
		while (matcher.find()) {
			String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
			if(i==0){
				int baseSpDef = Integer.parseInt(textInBetween);
				pokemon.setBaseSpDef(baseSpDef);
			}
			if(i==1){
				int minMaxSpDef = Integer.parseInt(textInBetween);
				pokemon.setMinMaxSpDef(minMaxSpDef);
			}
			if(i==2){
				int maxMaxSpDef = Integer.parseInt(textInBetween);
				pokemon.setMaxMaxSpDef(maxMaxSpDef);
			}
			i++;
		}
	}


	private static void parseSpeed(PokemonStatic pokemon, String source) {
		String start = "<th>Speed</th>";
		Matcher matcher = getMatcher(source, start);
		int i = 0;
		while (matcher.find()) {
			String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
			if(i==0){
				int baseSpeed = Integer.parseInt(textInBetween);
				pokemon.setBaseSpeed(baseSpeed);
			}
			if(i==1){
				int minMaxSpeed = Integer.parseInt(textInBetween);
				pokemon.setMinMaxSpeed(minMaxSpeed);
			}
			if(i==2){
				int maxMaxSpeed = Integer.parseInt(textInBetween);
				pokemon.setMaxMaxSpeed(maxMaxSpeed);
			}
			i++;
		}
	}
	
	private static Matcher getMatcher(String source, String start) {
		String end = "</tr>";
		String hpHtml = ParsingUtil.middleString(source, start, end);
		String pattern1 = "<td class=\"num\">";
		String pattern2 = "</td>";
		String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
		Pattern pattern = Pattern.compile(regexString);
		// text contains the full text that you want to extract data
		Matcher matcher = pattern.matcher(hpHtml);
		return matcher;
	}



}
