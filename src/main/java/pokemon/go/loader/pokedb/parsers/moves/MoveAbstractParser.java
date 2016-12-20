package pokemon.go.loader.pokedb.parsers.moves;

import java.util.List;

import org.hibernate.Query;

import pokemon.go.enums.MoveEnum;
import pokemon.go.hibernate.model.MoveStatic;
import pokemon.go.hibernate.model.PokemonMove;
import pokemon.go.hibernate.model.PokemonStatic;
import pokemon.go.hibernate.util.HibernateUtil;
import pokemon.go.hibernate.util.ParsingUtil;

public abstract class MoveAbstractParser {
	
	public void commitMoves(int pokemonId, int gen, String source) {
		String start = getStartingString();
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
				
				PokemonMove pokemonMove = createPokemonMoveInstance(gen, level, list, pokemon);
				
				System.out.println("Saving pokemon move rel: "+pokemonMove);
				//HibernateUtil.commit(pokemonMove);
			}
			i++;
		}
	}

	protected abstract PokemonMove createPokemonMoveInstance(int gen, String level, List<MoveStatic> list, PokemonStatic pokemon);

	protected abstract String getStartingString();

}
