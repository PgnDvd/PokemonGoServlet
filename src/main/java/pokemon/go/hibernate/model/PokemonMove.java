package pokemon.go.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import pokemon.go.enums.MoveMechanism;

@Entity
public class PokemonMove {
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

	public PokemonMove(PokemonStatic pokemon, MoveStatic move, int gen, int level, String tm, MoveMechanism mechanism) {
		this.pokemon = pokemon;
		this.move = move;
		this.gen = gen;
		this.level = level;
		this.tm = tm;
		this.mechanism = mechanism;
	}

	@Override
	public String toString() {
		return "PokemonMove [pokemon=" + pokemon + ", move=" + move + ", gen=" + gen + ", level=" + level + ", tm=" + tm
				+ ", mechanism=" + mechanism + "]";
	}
}
