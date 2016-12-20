package pokemon.go.hibernate.model;

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

import pokemon.go.enums.MoveMechanism;

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
