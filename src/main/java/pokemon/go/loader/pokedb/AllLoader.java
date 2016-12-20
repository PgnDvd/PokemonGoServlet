package pokemon.go.loader.pokedb;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import pokemon.go.hibernate.model.PokemonEvolution;
import pokemon.go.hibernate.util.HibernateUtil;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsHappiness;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsLevel;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsOther;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsStones;
import pokemon.go.loader.pokedb.evolutions.LoaderEvolutionsTrade;

public class AllLoader {
	public static final int pokemonCap = 152;
	public static void main(String[] args) throws IOException, URISyntaxException {
		savePokemons();
		saveMoves(args);
		savePokemonMoves();
		saveEvolutions();
		HibernateUtil.close();
	}

	private static void savePokemonMoves() throws MalformedURLException, IOException {
		System.out.println("Start parsing pokemon moves rel");
		for(int pokemonId = 1; pokemonId < pokemonCap; pokemonId++){
			PokemonMovesRelLoader.commitPokemonMovesRel(pokemonId, 1);
		}
		System.out.println("End committing pokemon moves rel");
	}

	private static void saveEvolutions() throws URISyntaxException, IOException {
		System.out.println("Start parsing evolutions");

		List<PokemonEvolution> allEvolutions = LoaderEvolutionsHappiness.getEvolutions();
		allEvolutions.addAll(LoaderEvolutionsLevel.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsOther.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsStones.getEvolutions());
		allEvolutions.addAll(LoaderEvolutionsTrade.getEvolutions());

		System.out.println("Start committing evolutions");

		int evolutionId = 0;
		for (PokemonEvolution evolution : allEvolutions) {
			if(evolution.getTo()<pokemonCap && evolution.getFrom()<pokemonCap){
				System.out.println("Committing evolution "+ evolution);
				//				evolution.setId(evolutionId++);
				HibernateUtil.commit(evolution);
			}
		}

		System.out.println("End committing evolutions");
	}

	private static void saveMoves(String[] args) {
		System.out.println("Start parsing moves");
		MovesPokeDb.commitMoves();
		System.out.println("End committing moves");
	}

	private static void savePokemons() throws MalformedURLException, IOException {
		System.out.println("Start parsing pokemon");
		for(int pokemonId = 1; pokemonId < pokemonCap; pokemonId++){
			LoaderPokeDb.parseCommitPokemon(pokemonId);
		}
		System.out.println("End committing pokemon");
	}

}
