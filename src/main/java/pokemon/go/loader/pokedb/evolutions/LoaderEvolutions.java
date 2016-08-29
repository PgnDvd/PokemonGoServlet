package pokemon.go.loader.pokedb.evolutions;

import pokemon.go.hibernate.model.PokemonEvolution;
import pokemon.go.hibernate.util.HibernateUtil;

public class LoaderEvolutions {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		PokemonEvolution evolution = new PokemonEvolution();
		HibernateUtil.commit(evolution);
		HibernateUtil.close();
	}
}
