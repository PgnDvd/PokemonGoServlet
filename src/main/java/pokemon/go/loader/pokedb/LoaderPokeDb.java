package pokemon.go.loader.pokedb;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import pokemon.go.enums.PokemonEnum;
import pokemon.go.enums.PokemonType;
import pokemon.go.hibernate.model.PokemonEvolution;
import pokemon.go.hibernate.model.PokemonMove;
import pokemon.go.hibernate.model.PokemonStatic;
import pokemon.go.hibernate.util.HibernateUtil;
import pokemon.go.hibernate.util.ParsingUtil;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsHappiness;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsLevel;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsOther;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsStones;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsTrade;
import pokemon.go.loader.pokedb.parsers.CatchRateParser;
import pokemon.go.loader.pokedb.parsers.NameParser;
import pokemon.go.loader.pokedb.parsers.SpriteParser;
import pokemon.go.loader.pokedb.parsers.StatParser;
import pokemon.go.loader.pokedb.parsers.TypesParser;

public class LoaderPokeDb {
	public static void main(String[] args) throws IOException, URISyntaxException {

		System.out.println("Start parsing evolutions");

		List<PokemonEvolution> allEvolutions = LoaderEvolutionsHappiness.getEvolutions();
		allEvolutions.addAll(LoaderEvolutionsLevel.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsOther.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsStones.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsTrade.getEvolutions());

		System.out.println("Start committing evolutions");

		int evolutionId = 0;
		for(PokemonEvolution evolution: allEvolutions){
			evolution.setId(evolutionId++);
			HibernateUtil.commit(evolution);
		}

		System.out.println("End committing evolutions");

		System.in.read();

		int pokemonId = 1;

		//		for(pokemonId = 1; pokemonId < 152; pokemonId++){
		for(pokemonId = 26; pokemonId < 36; pokemonId++){

			String url = "http://pokemondb.net/pokedex/"+pokemonId;
			String source = ParsingUtil.getSourceAsString(url);

			PokemonStatic pokemon = new PokemonStatic();
			pokemon.setId(pokemonId);
			
			NameParser.parseName(pokemon, source);
			TypesParser.parseTypes(pokemon, source);
			CatchRateParser.parseCatchRate(pokemon, source);
			SpriteParser.parseSprites(pokemon, pokemonId);
			StatParser.parseStats(pokemon, source);
			
			List<PokemonEvolution> evolutions = new ArrayList<>();
			for(PokemonEvolution evolution : allEvolutions){
				if(pokemonId == evolution.getFrom()){
					evolutions.add(evolution);
				}
			}


			Map<Integer, PokemonMove> moves= new HashMap<>();
			Map<PokemonEnum, PokemonMove> breedingMoves= new HashMap<>();
			List<PokemonMove> tmMoves = new ArrayList<>();
			List<PokemonMove> tutoringMoves = new ArrayList<>();



			//PokemonStatic pokemon = new PokemonStatic(name, pokemonId, type1, type2, evolutions, moves, breedingMoves, tmMoves, tutoringMoves, baseHp, baseAttack, baseDefense, baseSpAtk, baseSpDef, baseSpeed, maxMaxHp, maxMaxAttack, maxMaxDefense, maxMaxSpAtk, maxMaxSpDef, maxMaxSpeed, minMaxHp, minMaxAttack, minMaxDefense, minMaxSpAtk, minMaxSpDef, minMaxSpeed, sprites, catchRate);
			//			PokemonStatic pokemon;
			//			pokemon = new PokemonStatic(pokemonId, name, type1, type2, baseHp, baseAttack, baseDefense, baseSpAtk, baseSpDef, baseSpeed, maxMaxHp, maxMaxAttack, maxMaxDefense, maxMaxSpAtk, maxMaxSpDef, maxMaxSpeed, minMaxHp, minMaxAttack, minMaxDefense, minMaxSpAtk, minMaxSpDef, minMaxSpeed, catchRate, evolutions, sprites);
			//						System.out.println(pokemon);

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



}
