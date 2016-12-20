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
		getAllMoves(session);
		HibernateUtil.close();
	}

	private static void getPokemon(Session session) {
		PokemonStatic pokemon =  (PokemonStatic) session.get(PokemonStatic.class, 30);
		System.out.println(pokemon.getMoves());
	}
	private static void getAllMoves(Session session) {
		List<MoveStatic> moves =  session.createCriteria(MoveStatic.class).list();
		for(MoveStatic move:moves){
			System.out.println(move);
		}
	}
}
