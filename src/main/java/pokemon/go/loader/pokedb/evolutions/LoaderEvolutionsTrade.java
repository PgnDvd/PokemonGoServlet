package pokemon.go.loader.pokedb.evolutions;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import pokemon.go.enums.EvolutionType;
import pokemon.go.enums.PokemonEnum;
import pokemon.go.hibernate.model.PokemonEvolution;

public class LoaderEvolutionsTrade {
	public static void main(String[] args) throws URISyntaxException, IOException {
		List<PokemonEvolution> evolutions = getEvolutions();
		for(PokemonEvolution evolution: evolutions){
			System.out.println(evolution);
		}
	}

	public static List<PokemonEvolution> getEvolutions() throws URISyntaxException, IOException {
        File file = new File("src/main/resources/evolutions/evoTrade.txt");
		List<String> source = Files.readAllLines(file.toPath());
		List<PokemonEvolution> evolutions = new ArrayList<>();
		for(String line : source){
			String[] items = line.split("\t");
			String name = items[0].toLowerCase().replace("-", "").replace("nidoran♂", "nidoranM");
			int from = PokemonEnum.valueOf(name).getId();
			String name2 = items[1].toLowerCase().replace("-", "").replace("nidoran♂", "nidoranM");
			int to = PokemonEnum.valueOf(name2).getId();
			String tradingItem = null;
			if(items.length == 3){
				tradingItem = items[2];
			}
			String condition = null;
			PokemonEvolution evolution = new PokemonEvolution(from, to, EvolutionType.LEVEL, 0, null, tradingItem, condition);
			evolutions.add(evolution);		
			
			

			if(items.length > 3){
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
