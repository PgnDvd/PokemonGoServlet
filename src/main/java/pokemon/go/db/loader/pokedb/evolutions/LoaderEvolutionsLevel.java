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

import pokemon.go.db.enums.EvolutionType;
import pokemon.go.db.enums.PokemonEnum;
import pokemon.go.db.hibernate.model.PokemonEvolution;

public class LoaderEvolutionsLevel {
	public static void main(String[] args) throws URISyntaxException, IOException {
		List<PokemonEvolution> evolutions = getEvolutions();
		for(PokemonEvolution evolution: evolutions){
			System.out.println(evolution);
		}
	}

	public static List<PokemonEvolution> getEvolutions() throws URISyntaxException, IOException {
        File file = new File("src/main/resources/evolutions/evoLevel.txt");
		List<String> source = Files.readAllLines(file.toPath());
		List<PokemonEvolution> evolutions = new ArrayList<>();
		for(String line : source){
			String[] items = line.split("\t");
			String name = items[0].toLowerCase().replace("nidoran♀", "nidoranF").replace("nidoran♂", "nidoranM");
			int from = PokemonEnum.valueOf(name).getId();
			int to = PokemonEnum.valueOf(items[1].toLowerCase()).getId();
			int level = Integer.parseInt(items[2]);
			String condition = null;
			if(items.length == 4){
				condition = items[3];
			}
			PokemonEvolution evolution = new PokemonEvolution(from, to, EvolutionType.LEVEL, level, null, null, condition);
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
