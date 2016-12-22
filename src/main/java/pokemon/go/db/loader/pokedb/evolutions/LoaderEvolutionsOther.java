package pokemon.go.db.loader.pokedb.evolutions;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import pokemon.go.db.enums.EvolutionType;
import pokemon.go.db.enums.PokemonEnum;
import pokemon.go.db.hibernate.model.PokemonEvolution;

public class LoaderEvolutionsOther {
	public static void main(String[] args) throws URISyntaxException, IOException {
		List<PokemonEvolution> evolutions = getEvolutions();
		for(PokemonEvolution evolution: evolutions){
			System.out.println(evolution);
		}
	}

	public static List<PokemonEvolution> getEvolutions() throws URISyntaxException, IOException {
		File file = new File("src/main/resources/evolutions/evoOther.txt");
		List<String> source = Files.readAllLines(file.toPath());
		List<PokemonEvolution> evolutions = new ArrayList<>();
		for(String line : source){
			String[] items = line.split("\t");
			String name = items[0].toLowerCase().replace(" ", "").replace(".", "");
			int from = PokemonEnum.valueOf(name).getId();
			String name2 = items[1].toLowerCase().replace(" ", "").replace(".", "");
			int to = PokemonEnum.valueOf(name2).getId();
			int level = 0;
			if(StringUtils.isNotEmpty(items[2])){
				level = Integer.parseInt(items[2]);
			}
			String condition = null;
			if(items.length == 4){
				condition = items[3];
			}
			PokemonEvolution evolution = new PokemonEvolution(from, to, EvolutionType.OTHER, level, null, null, condition);
			evolutions.add(evolution);			



			if(items.length > 4){
				System.out.println(line);
				for(String item: items){
					System.out.println(item);
				}
				System.out.println(evolution);
				throw new RuntimeException();
			}

		}		
		return evolutions;
	}


}
