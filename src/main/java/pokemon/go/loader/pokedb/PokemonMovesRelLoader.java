package pokemon.go.loader.pokedb;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;

import pokemon.go.enums.MoveEnum;
import pokemon.go.enums.MoveMechanism;
import pokemon.go.hibernate.model.MoveStatic;
import pokemon.go.hibernate.model.PokemonMove;
import pokemon.go.hibernate.model.PokemonStatic;
import pokemon.go.hibernate.util.HibernateUtil;
import pokemon.go.hibernate.util.ParsingUtil;

public class PokemonMovesRelLoader {
	public static void main(String[] args) throws MalformedURLException, IOException {
		int pokemonId = 27;
		int gen = 1;
		commitPokemonMovesRel(pokemonId, gen);
		HibernateUtil.close();
	}

	public static void commitPokemonMovesRel(int pokemonId, int gen) throws MalformedURLException, IOException {
		String url = "http://pokemondb.net/pokedex/"+pokemonId+"/moves/"+gen;
		String source = HibernateUtil.getSourceAsString(url);
		String start = "<h3>Moves learnt by level up</h3>";
		String end = "</table></div>";
		String levelMoves = ParsingUtil.middleString(source, start, end);
		int i = 0;
		for(String move: levelMoves.split("<tr>")){
			if(i>1){
				String startLevel = "<td class=\"num\">";
				String endLevel = "</td>";
				String level = ParsingUtil.middleString(move, startLevel, endLevel);

				String startName = "href=\"/move/";
				String endName = "\"";
				String moveName = ParsingUtil.middleString(move, startName, endName).toUpperCase().replace("-", "_");

				Query query = HibernateUtil.getSession().createQuery("from MoveStatic where name = '"+MoveEnum.valueOf(moveName).getName()+"' ");
				List<MoveStatic> list = query.list();

				//				MoveStatic moveStatic = (MoveStatic) HibernateUtil.getSession().get(MoveStatic.class, moveName);				
				PokemonStatic pokemon =  (PokemonStatic) HibernateUtil.getSession().get(PokemonStatic.class, pokemonId);
				PokemonMove pokemonMove = new PokemonMove(pokemon, list.get(0), gen, Integer.parseInt(level), null, MoveMechanism.LEVEL);
				
				System.out.println("Saving pokemon move rel: "+pokemonMove);
				HibernateUtil.commit(pokemonMove);
			}
			i++;
		}
	}
}
