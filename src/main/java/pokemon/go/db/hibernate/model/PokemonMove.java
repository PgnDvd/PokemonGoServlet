package pokemon.go.db.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import pokemon.go.db.enums.MoveMechanism;

@Entity
public class PokemonMove implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true)
	private int id;

	@ManyToOne
	@JoinColumn(name = "pokemon_id")
	private PokemonStatic pokemon;

	@ManyToOne
	@JoinColumn(name = "move_id")
	private MoveStatic move;

	@Column
	public int gen;

	@Column
	public int level;
	
	@Column
	public String tm;
	
	@Enumerated(EnumType.STRING)
	public MoveMechanism mechanism;

	public PokemonMove(){
	}
	
	public PokemonMove(PokemonStatic pokemon, MoveStatic move, int gen, int level, String tm, MoveMechanism mechanism) {
		this.pokemon = pokemon;
		this.move = move;
		this.gen = gen;
		this.level = level;
		this.tm = tm;
		this.mechanism = mechanism;
	}

	public PokemonMove(int id, PokemonStatic pokemon, MoveStatic move, int gen, int level, String tm,
			MoveMechanism mechanism) {
		this.id = id;
		this.pokemon = pokemon;
		this.move = move;
		this.gen = gen;
		this.level = level;
		this.tm = tm;
		this.mechanism = mechanism;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PokemonStatic getPokemon() {
		return pokemon;
	}

	public void setPokemon(PokemonStatic pokemon) {
		this.pokemon = pokemon;
	}

	public MoveStatic getMove() {
		return move;
	}

	public void setMove(MoveStatic move) {
		this.move = move;
	}

	public int getGen() {
		return gen;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getTm() {
		return tm;
	}

	public void setTm(String tm) {
		this.tm = tm;
	}

	public MoveMechanism getMechanism() {
		return mechanism;
	}

	public void setMechanism(MoveMechanism mechanism) {
		this.mechanism = mechanism;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gen;
		result = prime * result + id;
		result = prime * result + level;
		result = prime * result + ((mechanism == null) ? 0 : mechanism.hashCode());
		result = prime * result + ((move == null) ? 0 : move.hashCode());
		result = prime * result + ((pokemon == null) ? 0 : pokemon.hashCode());
		result = prime * result + ((tm == null) ? 0 : tm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokemonMove other = (PokemonMove) obj;
		if (gen != other.gen)
			return false;
		if (id != other.id)
			return false;
		if (level != other.level)
			return false;
		if (mechanism != other.mechanism)
			return false;
		if (move == null) {
			if (other.move != null)
				return false;
		} else if (!move.equals(other.move))
			return false;
		if (pokemon == null) {
			if (other.pokemon != null)
				return false;
		} else if (!pokemon.equals(other.pokemon))
			return false;
		if (tm == null) {
			if (other.tm != null)
				return false;
		} else if (!tm.equals(other.tm))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PokemonMove [id=");
		builder.append(id);
		builder.append(", pokemon=");
		builder.append(pokemon.getId());
		builder.append(", move=");
		builder.append(move.getName());
		builder.append(", gen=");
		builder.append(gen);
		builder.append(", level=");
		builder.append(level);
		builder.append(", tm=");
		builder.append(tm);
		builder.append(", mechanism=");
		builder.append(mechanism);
		builder.append("]");
		return builder.toString();
	}
}
