package pokemon.go.loader.pokedb;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

import pokemon.go.enums.PokemonEnum;
import pokemon.go.enums.PokemonType;
import pokemon.go.hibernate.model.PokemonEvolution;
import pokemon.go.hibernate.model.PokemonStatic;
import pokemon.go.hibernate.util.HibernateUtil;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsHappiness;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsLevel;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsOther;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsStones;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsTrade;
import pokemon.go.model.PokemonMove;

public class LoaderPokeDb {
	public static void main(String[] args) throws IOException, URISyntaxException {
		int pokemonId = 1;
		List<PokemonEvolution> allEvolutions = LoaderEvolutionsHappiness.getEvolutions();
		allEvolutions.addAll(LoaderEvolutionsLevel.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsOther.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsStones.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsTrade.getEvolutions());
		
		int evolutionId = 0;
		for(PokemonEvolution evolution: allEvolutions){
			evolution.setId(evolutionId++);
//			HibernateUtil.commit(evolution);
		}
		
		//		for(pokemonId = 1; pokemonId < 152; pokemonId++){
		for(pokemonId = 26; pokemonId < 36; pokemonId++){
			String name;

			PokemonType type1 = PokemonType.VOID;
			PokemonType type2 = PokemonType.VOID;

			List<PokemonEvolution> evolutions = LoaderEvolutionsHappiness.getEvolutions();


			Map<Integer, PokemonMove> moves= new HashMap<>();
			Map<PokemonEnum, PokemonMove> breedingMoves= new HashMap<>();
			List<PokemonMove> tmMoves = new ArrayList<>();
			List<PokemonMove> tutoringMoves = new ArrayList<>();

			int baseHp = 0;
			int baseAttack = 0;
			int baseDefense = 0;
			int baseSpAtk = 0;
			int baseSpDef = 0;
			int baseSpeed = 0;

			int maxMaxHp = 0;
			int maxMaxAttack = 0;
			int maxMaxDefense = 0;
			int maxMaxSpAtk = 0;
			int maxMaxSpDef = 0;
			int maxMaxSpeed = 0;


			int minMaxHp = 0;
			int minMaxAttack = 0;
			int minMaxDefense = 0;
			int minMaxSpAtk = 0;
			int minMaxSpDef = 0;
			int minMaxSpeed = 0;

			List<String> sprites= new ArrayList<>();

			double catchRate = 0;


			String url = "http://pokemondb.net/pokedex/"+pokemonId;
			String source = getSourceAsString(url);





			{
				name = getName(source);		
				//			System.out.println(name);
			}
			{
				List<String> types =  getTypes(source);
				type1 = PokemonType.valueOf(types.get(0).toUpperCase());
				if(types.size()>1){
					type2 = PokemonType.valueOf(types.get(1).toUpperCase());
				}
				else{
					type2 = PokemonType.VOID;
				}
				//			System.out.println(types);
			}
			{
				catchRate = getCatchRate(source);
				//			System.out.println(catchRate);
			}
			{
//				for(PokemonEvolution evolution : allEvolutions){
//					if(pokemonId == evolution.getFrom()){
//						evolutions.add(evolution);
//					}
//				}
			}
			{
				String start = "<th>HP</th>";
				String end = "</tr>";
				String hpHtml = middleString(source, start, end);
				String pattern1 = "<td class=\"num\">";
				String pattern2 = "</td>";
				String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
				Pattern pattern = Pattern.compile(regexString);
				// text contains the full text that you want to extract data
				Matcher matcher = pattern.matcher(hpHtml);

				int i = 0;
				while (matcher.find()) {
					String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
					if(i==0){
						baseHp = Integer.parseInt(textInBetween);
					}
					if(i==1){
						minMaxHp = Integer.parseInt(textInBetween);
					}
					if(i==2){
						maxMaxHp = Integer.parseInt(textInBetween);
					}
					i++;
				}
			}
			{
				String start = "<th>Attack</th>";
				String end = "</tr>";
				String hpHtml = middleString(source, start, end);
				String pattern1 = "<td class=\"num\">";
				String pattern2 = "</td>";
				String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
				Pattern pattern = Pattern.compile(regexString);
				// text contains the full text that you want to extract data
				Matcher matcher = pattern.matcher(hpHtml);

				int i = 0;
				while (matcher.find()) {
					String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
					if(i==0){
						baseAttack = Integer.parseInt(textInBetween);
					}
					if(i==1){
						minMaxAttack = Integer.parseInt(textInBetween);
					}
					if(i==2){
						maxMaxAttack = Integer.parseInt(textInBetween);
					}
					i++;
				}
			}
			{
				String start = "<th>Defense</th>";
				String end = "</tr>";
				String hpHtml = middleString(source, start, end);
				String pattern1 = "<td class=\"num\">";
				String pattern2 = "</td>";
				String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
				Pattern pattern = Pattern.compile(regexString);
				// text contains the full text that you want to extract data
				Matcher matcher = pattern.matcher(hpHtml);

				int i = 0;
				while (matcher.find()) {
					String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
					if(i==0){
						baseDefense = Integer.parseInt(textInBetween);
					}
					if(i==1){
						minMaxDefense = Integer.parseInt(textInBetween);
					}
					if(i==2){
						maxMaxDefense = Integer.parseInt(textInBetween);
					}
					i++;
				}
			}
			{
				String start = "<th>Sp. Atk</th>";
				String end = "</tr>";
				String hpHtml = middleString(source, start, end);
				String pattern1 = "<td class=\"num\">";
				String pattern2 = "</td>";
				String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
				Pattern pattern = Pattern.compile(regexString);
				// text contains the full text that you want to extract data
				Matcher matcher = pattern.matcher(hpHtml);

				int i = 0;
				while (matcher.find()) {
					String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
					if(i==0){
						baseSpAtk = Integer.parseInt(textInBetween);
					}
					if(i==1){
						minMaxSpAtk = Integer.parseInt(textInBetween);
					}
					if(i==2){
						maxMaxSpAtk = Integer.parseInt(textInBetween);
					}
					i++;
				}
			}
			{
				String start = "<th>Sp. Def</th>";
				String end = "</tr>";
				String hpHtml = middleString(source, start, end);
				String pattern1 = "<td class=\"num\">";
				String pattern2 = "</td>";
				String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
				Pattern pattern = Pattern.compile(regexString);
				// text contains the full text that you want to extract data
				Matcher matcher = pattern.matcher(hpHtml);

				int i = 0;
				while (matcher.find()) {
					String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
					if(i==0){
						baseSpDef = Integer.parseInt(textInBetween);
					}
					if(i==1){
						minMaxSpDef = Integer.parseInt(textInBetween);
					}
					if(i==2){
						maxMaxSpDef = Integer.parseInt(textInBetween);
					}
					i++;
				}
			}
			{
				String start = "<th>Speed</th>";
				String end = "</tr>";
				String hpHtml = middleString(source, start, end);
				String pattern1 = "<td class=\"num\">";
				String pattern2 = "</td>";
				String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
				Pattern pattern = Pattern.compile(regexString);
				// text contains the full text that you want to extract data
				Matcher matcher = pattern.matcher(hpHtml);

				int i = 0;
				while (matcher.find()) {
					String textInBetween = matcher.group(1); // Since (.*?) is capturing group 1
					if(i==0){
						baseSpeed = Integer.parseInt(textInBetween);
					}
					if(i==1){
						minMaxSpeed = Integer.parseInt(textInBetween);
					}
					if(i==2){
						maxMaxSpeed = Integer.parseInt(textInBetween);
					}
					i++;
				}
			}
			{
				sprites = getSpritesFromPokemonDb(pokemonId);
			}


			//PokemonStatic pokemon = new PokemonStatic(name, pokemonId, type1, type2, evolutions, moves, breedingMoves, tmMoves, tutoringMoves, baseHp, baseAttack, baseDefense, baseSpAtk, baseSpDef, baseSpeed, maxMaxHp, maxMaxAttack, maxMaxDefense, maxMaxSpAtk, maxMaxSpDef, maxMaxSpeed, minMaxHp, minMaxAttack, minMaxDefense, minMaxSpAtk, minMaxSpDef, minMaxSpeed, sprites, catchRate);
			PokemonStatic pokemon;
			pokemon = new PokemonStatic(pokemonId, name, type1, type2, baseHp, baseAttack, baseDefense, baseSpAtk, baseSpDef, baseSpeed, maxMaxHp, maxMaxAttack, maxMaxDefense, maxMaxSpAtk, maxMaxSpDef, maxMaxSpeed, minMaxHp, minMaxAttack, minMaxDefense, minMaxSpAtk, minMaxSpDef, minMaxSpeed, catchRate, evolutions, sprites);
			//			System.out.println(pokemon);

			//printAsEnum(sprites, pokemon);
			HibernateUtil.commit(pokemon);
		}
		HibernateUtil.close();
	}

	private static void printAsEnum(List<String> sprites, PokemonStatic pokemon) {
		String spritesInEnum = "Arrays.asList(";
		for(String sprite : sprites){
			spritesInEnum += "\""+sprite+"\","; 
		}
		spritesInEnum = spritesInEnum.substring(0, spritesInEnum.length()-1)+")";
		System.out.println(pokemon.getName().toUpperCase()+"("+pokemon.getId()+","+
				"\""+pokemon.getName()+"\""+","+
				"PokemonType."+pokemon.getType1()+","+
				"PokemonType."+pokemon.getType2()+","+
				pokemon.getBaseHp() +","+
				pokemon.getBaseAttack()+","+
				pokemon.getBaseDefense()+","+
				pokemon.getBaseSpAtk()+","+
				pokemon.getBaseSpDef()+","+
				pokemon.getBaseSpeed()+","+
				pokemon.getMaxMaxHp()+","+
				pokemon.getMaxMaxAttack()+","+
				pokemon.getMaxMaxDefense()+","+
				pokemon.getMaxMaxSpAtk()+","+
				pokemon.getMaxMaxSpDef()+","+
				pokemon.getMaxMaxSpeed()+","+
				pokemon.getMinMaxHp()+","+
				pokemon.getMinMaxAttack()+","+
				pokemon.getMinMaxDefense()+","+
				pokemon.getMinMaxSpAtk()+","+
				pokemon.getMinMaxSpDef()+","+
				pokemon.getMinMaxSpeed()+","+
				pokemon.getCatchRate()+","+
				spritesInEnum+
				"),");
	}

	private static String getSourceAsString(String spec) throws MalformedURLException, IOException {
		URL url = new URL(spec);

		URLConnection urlConn = url.openConnection();
		urlConn.setRequestProperty("User-Agent", "cheese");

		InputStream is = urlConn.getInputStream();

		String source = IOUtils.toString(is);
		return source;
	}

	private static List<String> getSpritesFromPokemonDb(int pokemonId) throws IOException {
		String spec = "http://pokemondb.net/sprites/"+pokemonId;
		String source = getSourceAsString(spec);

		List<String> sprites = new ArrayList<>();
		//		System.out.println(source);
		String pattern1 = "<span class=\"sprites-table-img\">";
		String pattern2 = "</span>";

		Pair<String, Integer> middle = new ImmutablePair<String, Integer>("", 0);
		while(middle.getRight()!=-1){
			middle = middleString(source, pattern1, pattern2, middle.getRight());
			//			System.out.println(middle.getLeft());
			String sprite = middleString(middle.getLeft(), "<a href=\"", "\" ");
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

		return sprites;
	}

	private static double getCatchRate(String source) {
		String name;
		{
			String start = "<th>Catch rate</th>";
			String end = "\"";
			name = middleString(source, start, end);
		}
		{
			String start = "<td>";
			String end = "<";
			name = middleString(name, start, end);
		}
		return Double.parseDouble(name);
	}


	private static List<String> getTypes(String source) {
		List<String> types = new ArrayList<>();
		String start = "<th>Type</th>";
		String end = "</tr>";
		String typesHtml = middleString(source, start, end);
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

	private static String getName(String source) {
		String name;
		String start = "<link rel=\"canonical\" href=\"http://pokemondb.net/pokedex/";
		String end = "\">";
		name = middleString(source, start, end);
		return name;
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
	private static Pair<String,Integer> middleString(String source, String start, String end, int startIndex) {
		try{
			int beginIndex = source.indexOf(start, startIndex)+start.length();
			if(beginIndex == start.length()-1){
				return new ImmutablePair<String, Integer>("", -1);
			}
			int endIndex = source.indexOf(end, beginIndex);
			String middle = source.substring(beginIndex, endIndex);
			return new ImmutablePair<String, Integer>(middle, beginIndex);
		}
		catch(Exception e){
			return new ImmutablePair<String, Integer>("", -1);
		}
	}

}
