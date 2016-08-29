//package pokemon.go.hibernate.util;
//
//
//import java.util.Arrays;
//import java.util.Date;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
//
//import pokemon.go.enums.PokemonType;
//import pokemon.go.hibernate.model.PokemonStatic;
//
//
//public class HibernateAnnotationMain {
//
//	public static void main(String[] args) {
//		PokemonStatic emp = new PokemonStatic("name", 100, PokemonType.GRASS, PokemonType.VOID, 10, 2, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, Arrays.asList("urla1","urla100"), 10);
//		PokemonStatic emp2 = new PokemonStatic("name", 200, PokemonType.GRASS, PokemonType.VOID, 10, 2, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, Arrays.asList("urlb1"), 10);
//		PokemonStatic emp3 = new PokemonStatic("name", 300, PokemonType.GRASS, PokemonType.VOID, 10, 2, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, Arrays.asList("urlb1"), 10);
//		HibernateUtil.commit(emp);
//		HibernateUtil.commit(emp2);
//		HibernateUtil.commit(emp3);
//
//		System.out.println("Employee ID="+emp.getId());
//		System.out.println("Employee ID="+emp2.getId());
//
//		HibernateUtil.close();
//	}
//
//}
