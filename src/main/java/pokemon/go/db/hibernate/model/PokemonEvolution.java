package pokemon.go.db.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import pokemon.go.db.enums.EvolutionType;
import pokemon.go.db.enums.items.Stone;

@Entity
public class PokemonEvolution {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true)
	private int id;

	@Column(name="ev_from")
	private int from;

	@Column(name="ev_to")
	private int to;

	@Enumerated(EnumType.STRING)
	private EvolutionType type;

	@Column(name="level")
	private int level;

	@Enumerated(EnumType.STRING)
	private Stone stone;

	@Column(name="tradingItem")
	private String tradingItem;

	@Column(name="ev_condition")
	private String condition;
	

	public PokemonEvolution(){
		
	}
	
	public PokemonEvolution(int id, int from, int to, EvolutionType type, int level, Stone stone, String tradingItem,
			String condition) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.type = type;
		this.level = level;
		this.stone = stone;
		this.tradingItem = tradingItem;
		this.condition = condition;
	}

	
	public PokemonEvolution(int from, int to, EvolutionType type, int level, Stone stone, String tradingItem,
			String condition) {
		this.from = from;
		this.to = to;
		this.type = type;
		this.level = level;
		this.stone = stone;
		this.tradingItem = tradingItem;
		this.condition = condition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public EvolutionType getType() {
		return type;
	}

	public void setType(EvolutionType type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Stone getStone() {
		return stone;
	}

	public void setStone(Stone stone) {
		this.stone = stone;
	}

	public String getTradingItem() {
		return tradingItem;
	}

	public void setTradingItem(String tradingItem) {
		this.tradingItem = tradingItem;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((condition == null) ? 0 : condition.hashCode());
		result = prime * result + from;
		result = prime * result + id;
		result = prime * result + level;
		result = prime * result + ((stone == null) ? 0 : stone.hashCode());
		result = prime * result + to;
		result = prime * result + ((tradingItem == null) ? 0 : tradingItem.hashCode());
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
		PokemonEvolution other = (PokemonEvolution) obj;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (from != other.from)
			return false;
		if (id != other.id)
			return false;
		if (level != other.level)
			return false;
		if (stone != other.stone)
			return false;
		if (to != other.to)
			return false;
		if (tradingItem == null) {
			if (other.tradingItem != null)
				return false;
		} else if (!tradingItem.equals(other.tradingItem))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PokemonEvolution [id=" + id + ", from=" + from + ", to=" + to + ", type=" + type + ", level=" + level
				+ ", stone=" + stone + ", tradingItem=" + tradingItem + ", condition=" + condition + "]";
	}

}
