package pokemon.go.loader.pokedb;

import pokemon.go.enums.MoveEnum;
import pokemon.go.hibernate.model.MoveStatic;
import pokemon.go.hibernate.util.HibernateUtil;

public class MovesPokeDb {

	public static void main(String[] args) {
		for(MoveEnum move: MoveEnum.values()){
			MoveStatic moveStatic = new MoveStatic(move.getId(), move.getName(), move.getType(), move.getCategory(), move.getPower(), move.getAcc(), move.getPp(), move.getTm(), move.getEffect(), move.getProb());
			System.out.println("Committing move: "+moveStatic);
			HibernateUtil.commit(moveStatic);
		}
		HibernateUtil.close();
	}
	
}
