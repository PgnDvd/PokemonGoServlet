package old.pokemon.go.loader.pokeapico;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

import old.pokemon.go.model.PokemonMove;
import pokemon.go.enums.PokemonEnum;
import pokemon.go.enums.PokemonType;

public class LoaderPokeApiCo {
	public static void main(String[] args) throws IOException {
		int pokemonId = 1;
		String spec = "http://pokeapi.co/api/v2/pokemon/"+pokemonId+"/";
		URL url = new URL(spec);

        URLConnection urlConn = url.openConnection();
        urlConn.setRequestProperty("User-Agent", "cheese");

        InputStream is = urlConn.getInputStream();

		String json = IOUtils.toString(is);
		System.out.println(json);
		Gson gson = new Gson();
		
		LinkedTreeMap result = gson.fromJson(json , LinkedTreeMap.class);
		List<LinkedTreeMap> forms = (List) result.get("forms");
		System.out.println(forms);
		String name = (String) forms.get(0).get("name");

		
		/*
		 * 
	private String name;
	private int id;
	
	private PokemonType type1;
	private PokemonType type2;
	
	private Map<Integer, PokemonEnum> evolutions;
	
	private Map<Integer, PokemonMove> moves;
	private Map<PokemonEnum, PokemonMove> breedingMoves;
	private List<PokemonMove> tmMoves;
	private List<PokemonMove> tutoringMoves;
	
	private int baseHp;
	private int baseAttack;
	private int baseDefense;
	private int baseSpAtk;
	private int baseSpDef;
	private int baseSpeed;

	private int maxHp;
	private int maxAttack;
	private int maxDefense;
	private int maxSpAtk;
	private int maxSpDef;
	private int maxSpeed;
	
	private String sprite;
	
	private double catchRate;
		 */
	}
}
