package pokemon.go.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import pokemon.go.enums.EvolutionType;
import pokemon.go.enums.items.Stone;

@Entity
public class PokemonEvolution {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true)
	private int id;

	@Column
	private int from;

	@Column
	private int to;

	@Enumerated(EnumType.STRING)
	private EvolutionType type;

	@Column
	private int level;

	@Enumerated(EnumType.STRING)
	private Stone stone;

	@Column
	private String tradingItem;

	@Column
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
	public String toString() {
		return "PokemonEvolution [id=" + id + ", from=" + from + ", to=" + to + ", type=" + type + ", level=" + level
				+ ", stone=" + stone + ", tradingItem=" + tradingItem + ", condition=" + condition + "]";
	}

}
