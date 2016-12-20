package pokemon.go.test;

import java.util.List;

import org.hibernate.Session;

import pokemon.go.hibernate.model.MoveStatic;
import pokemon.go.hibernate.model.PokemonStatic;
import pokemon.go.hibernate.util.HibernateUtil;

public class GetPokemon {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		getPokemon(session);
//		getAllMoves(session);
		HibernateUtil.close();
	}

	private static void getPokemon(Session session) {
		PokemonStatic pokemon =  (PokemonStatic) session.get(PokemonStatic.class, 27);
		System.out.println(pokemon);
		System.out.println(pokemon.getName());
		System.out.println(pokemon.getMoves());
//		System.out.println(pokemon.getMoves().get(0).getMove());
		System.out.println(pokemon.getEvolutions());
	}

	private static void getMove(Session session) {
		PokemonStatic pokemon =  (PokemonStatic) session.get(PokemonStatic.class, 27);
		System.out.println(pokemon);
		System.out.println(pokemon.getName());
		System.out.println(pokemon.getMoves());
		System.out.println(pokemon.getEvolutions());
	}

	private static void getAllMoves(Session session) {
		List<MoveStatic> moves =  session.createCriteria(MoveStatic.class).list();
		for(MoveStatic move:moves){
			System.out.println(move);
		}
	}
}
