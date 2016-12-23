package pokemon.go.db.loader.pokedb.loaders;

import pokemon.go.db.enums.MoveEnum;
import pokemon.go.db.hibernate.model.MoveStatic;
import pokemon.go.db.hibernate.util.HibernateUtil;

public class MovesPokeDb {

	public static void main(String[] args) {
		commitMoves();
		HibernateUtil.close();
	}

	public static void commitMoves() {
		for (MoveEnum move : MoveEnum.values()) {
			MoveStatic moveStatic = new MoveStatic(move.getId(), move.getName(), move.getType(), move.getCategory(),
					move.getPower(), move.getAcc(), move.getPp(), move.getTm(), move.getEffect(), move.getProb());
			System.out.println("Committing move: " + moveStatic);
			HibernateUtil.commit(moveStatic);
		}
	}

}
