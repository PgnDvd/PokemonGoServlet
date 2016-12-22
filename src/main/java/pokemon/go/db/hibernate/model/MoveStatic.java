package pokemon.go.db.hibernate.model;

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

import pokemon.go.db.enums.MoveCategory;
import pokemon.go.db.enums.MoveType;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acc == null) ? 0 : acc.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pokemons == null) ? 0 : pokemons.hashCode());
		result = prime * result + ((power == null) ? 0 : power.hashCode());
		result = prime * result + ((pp == null) ? 0 : pp.hashCode());
		result = prime * result + ((prob == null) ? 0 : prob.hashCode());
		result = prime * result + ((tm == null) ? 0 : tm.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		MoveStatic other = (MoveStatic) obj;
		if (acc == null) {
			if (other.acc != null)
				return false;
		} else if (!acc.equals(other.acc))
			return false;
		if (category != other.category)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pokemons == null) {
			if (other.pokemons != null)
				return false;
		} else if (!pokemons.equals(other.pokemons))
			return false;
		if (power == null) {
			if (other.power != null)
				return false;
		} else if (!power.equals(other.power))
			return false;
		if (pp == null) {
			if (other.pp != null)
				return false;
		} else if (!pp.equals(other.pp))
			return false;
		if (prob == null) {
			if (other.prob != null)
				return false;
		} else if (!prob.equals(other.prob))
			return false;
		if (tm == null) {
			if (other.tm != null)
				return false;
		} else if (!tm.equals(other.tm))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MoveStatic [id=" + id + ", name=" + name + ", type=" + type + ", category=" + category + ", power="
				+ power + ", acc=" + acc + ", pp=" + pp + ", tm=" + tm + ", description=" + description + ", prob="
				+ prob + ", pokemons=" + pokemons + "]";
	}

}
