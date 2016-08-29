package pokemon.go.test;

import org.hibernate.Session;

import pokemon.go.hibernate.model.PokemonStatic;
import pokemon.go.hibernate.util.HibernateUtil;

public class GetPokemon {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		PokemonStatic pokemon =  (PokemonStatic) session.get(PokemonStatic.class, 30);
		System.out.println(pokemon);
	}
}
