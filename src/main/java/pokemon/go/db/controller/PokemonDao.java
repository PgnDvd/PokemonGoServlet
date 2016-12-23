package pokemon.go.db.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import pokemon.go.db.hibernate.model.PokemonStatic;
import pokemon.go.db.hibernate.model.user.Trainer;
import pokemon.go.db.hibernate.util.HibernateUtil;
import pokemon.go.db.loader.pokedb.loaders.AllLoader;

public class PokemonDao {

	public PokemonDao(String e){

	}

	public static List<PokemonStatic> getRandomPokemons(int size) {
		Random rand = new Random();
		List<PokemonStatic> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			int randomInt = rand.nextInt(AllLoader.pokemonCap - 1) + 1;
			PokemonStatic pokemon = (PokemonStatic) HibernateUtil.getSession().get(PokemonStatic.class, randomInt);
			list.add(pokemon);
		}
		return list;
	}

	public static boolean registerUser(String username, String email, String password){
		Trainer trainer = new Trainer();
		trainer.setUsername(username);
		trainer.setPassword(password);
		trainer.setEmail(email);
		System.out.println("Committing trainer: " + trainer);
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		try{
			session.save(trainer);
			transaction.commit();
			return true;
		}
		catch(ConstraintViolationException e){
			transaction.rollback();
			System.out.println("User already exists");
			return false;
		}	
	}
}
