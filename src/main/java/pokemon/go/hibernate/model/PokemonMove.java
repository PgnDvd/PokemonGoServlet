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
}
