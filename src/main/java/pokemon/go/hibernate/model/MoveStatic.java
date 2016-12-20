package pokemon.go.hibernate.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import pokemon.go.enums.MoveCategory;
import pokemon.go.enums.MoveType;

@Entity
public class MoveStatic implements Serializable{

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true)
	private int id;

	@Column(name="name", nullable=false)
	private String name;

	@Enumerated(EnumType.STRING)
	private MoveType type;

	@Enumerated(EnumType.STRING)
	private MoveCategory category;

	@Column(name="power", nullable=false)
	private String power;
	@Column(name="acc", nullable=false)
	private String acc;
	@Column(name="pp", nullable=false)
	private String pp;
	@Column(name="tm")
	private String tm;
	@Column(name="description")
	private String description;
	@Column(name="prob")
	private String prob;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pokemon")
	private List<PokemonMove> pokemons = new ArrayList<>();

	public MoveStatic() {
	}

	public MoveStatic(int id, String name, MoveType type, MoveCategory category, String power, String acc, String pp,
			String tm, String description, String prob) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.power = power;
		this.acc = acc;
		this.pp = pp;
		this.tm = tm;
		this.description = description;
		this.prob = prob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MoveType getType() {
		return type;
	}

	public void setType(MoveType type) {
		this.type = type;
	}

	public MoveCategory getCategory() {
		return category;
	}

	public void setCategory(MoveCategory category) {
		this.category = category;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getPp() {
		return pp;
	}

	public void setPp(String pp) {
		this.pp = pp;
	}

	public String getTm() {
		return tm;
	}

	public void setTm(String tm) {
		this.tm = tm;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProb() {
		return prob;
	}

	public void setProb(String prob) {
		this.prob = prob;
	}

	@Override
	public String toString() {
		return "MoveStatic [id=" + id + ", name=" + name + ", type=" + type + ", category=" + category + ", power="
				+ power + ", acc=" + acc + ", pp=" + pp + ", tm=" + tm + ", description=" + description + ", prob="
				+ prob + ", pokemons=" + pokemons + "]";
	}

}
