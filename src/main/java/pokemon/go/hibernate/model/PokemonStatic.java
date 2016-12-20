package pokemon.go.hibernate.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import pokemon.go.enums.PokemonType;

@Entity
//@Table(name="PokemonStatic", 
//uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class PokemonStatic implements Serializable {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true)
	private int id;

	@Column(name="name", nullable=false)
	private String name;

	@Enumerated(EnumType.STRING)
	private PokemonType type1;

	@Enumerated(EnumType.STRING)
	private PokemonType type2;

	@Column(name="baseHp", nullable=false)
	private int baseHp;
	@Column(name="baseAttack", nullable=false)
	private int baseAttack;
	@Column(name="baseDefense", nullable=false)
	private int baseDefense;
	@Column(name="baseSpAtk", nullable=false)
	private int baseSpAtk;
	@Column(name="baseSpDef", nullable=false)
	private int baseSpDef;
	@Column(name="baseSpeed", nullable=false)
	private int baseSpeed;

	@Column(name="maxMaxHp", nullable=false)
	private int maxMaxHp;
	@Column(name="maxMaxAttack", nullable=false)
	private int maxMaxAttack;
	@Column(name="maxMaxDefense", nullable=false)
	private int maxMaxDefense;
	@Column(name="maxMaxSpAtk", nullable=false)
	private int maxMaxSpAtk;
	@Column(name="maxMaxSpDef", nullable=false)
	private int maxMaxSpDef;
	@Column(name="maxMaxSpeed", nullable=false)
	private int maxMaxSpeed;


	@Column(name="minMaxHp", nullable=false)
	private int minMaxHp;
	@Column(name="minMaxAttack", nullable=false)
	private int minMaxAttack;
	@Column(name="minMaxDefense", nullable=false)
	private int minMaxDefense;
	@Column(name="minMaxSpAtk", nullable=false)
	private int minMaxSpAtk;
	@Column(name="minMaxSpDef", nullable=false)
	private int minMaxSpDef;
	@Column(name="minMaxSpeed", nullable=false)
	private int minMaxSpeed;

	@Column(name="catchRate", nullable=false)
	private double catchRate;

//	@ElementCollection
//	@CollectionTable(name="Evolutions", joinColumns=@JoinColumn(name="id"))
//	@Column(name="evolutions")
	
//	@Transient
	@OneToMany(fetch = FetchType.EAGER)
	private List<PokemonEvolution> evolutions;

	@OneToMany(fetch = FetchType.EAGER)
	private List<PokemonMove> moves;

	@ElementCollection
	@CollectionTable(name="Sprites", joinColumns=@JoinColumn(name="id"))
	@Column(name="sprites")
	private List<String> sprites;

	public PokemonStatic(){
		
	}
	public PokemonStatic(int id, String name, PokemonType type1, PokemonType type2, int baseHp, int baseAttack,
			int baseDefense, int baseSpAtk, int baseSpDef, int baseSpeed, int maxMaxHp, int maxMaxAttack,
			int maxMaxDefense, int maxMaxSpAtk, int maxMaxSpDef, int maxMaxSpeed, int minMaxHp, int minMaxAttack,
			int minMaxDefense, int minMaxSpAtk, int minMaxSpDef, int minMaxSpeed, double catchRate,
			List<PokemonEvolution> evolutions, List<String> sprites) {
		this.id = id;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.baseHp = baseHp;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
		this.baseSpAtk = baseSpAtk;
		this.baseSpDef = baseSpDef;
		this.baseSpeed = baseSpeed;
		this.maxMaxHp = maxMaxHp;
		this.maxMaxAttack = maxMaxAttack;
		this.maxMaxDefense = maxMaxDefense;
		this.maxMaxSpAtk = maxMaxSpAtk;
		this.maxMaxSpDef = maxMaxSpDef;
		this.maxMaxSpeed = maxMaxSpeed;
		this.minMaxHp = minMaxHp;
		this.minMaxAttack = minMaxAttack;
		this.minMaxDefense = minMaxDefense;
		this.minMaxSpAtk = minMaxSpAtk;
		this.minMaxSpDef = minMaxSpDef;
		this.minMaxSpeed = minMaxSpeed;
		this.catchRate = catchRate;
		this.evolutions = evolutions;
		this.sprites = sprites;
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

	public PokemonType getType1() {
		return type1;
	}

	public void setType1(PokemonType type1) {
		this.type1 = type1;
	}

	public PokemonType getType2() {
		return type2;
	}

	public void setType2(PokemonType type2) {
		this.type2 = type2;
	}

	public int getBaseHp() {
		return baseHp;
	}

	public void setBaseHp(int baseHp) {
		this.baseHp = baseHp;
	}

	public int getBaseAttack() {
		return baseAttack;
	}

	public void setBaseAttack(int baseAttack) {
		this.baseAttack = baseAttack;
	}

	public int getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(int baseDefense) {
		this.baseDefense = baseDefense;
	}

	public int getBaseSpAtk() {
		return baseSpAtk;
	}

	public void setBaseSpAtk(int baseSpAtk) {
		this.baseSpAtk = baseSpAtk;
	}

	public int getBaseSpDef() {
		return baseSpDef;
	}

	public void setBaseSpDef(int baseSpDef) {
		this.baseSpDef = baseSpDef;
	}

	public int getBaseSpeed() {
		return baseSpeed;
	}

	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}

	public int getMaxMaxHp() {
		return maxMaxHp;
	}

	public void setMaxMaxHp(int maxMaxHp) {
		this.maxMaxHp = maxMaxHp;
	}

	public int getMaxMaxAttack() {
		return maxMaxAttack;
	}

	public void setMaxMaxAttack(int maxMaxAttack) {
		this.maxMaxAttack = maxMaxAttack;
	}

	public int getMaxMaxDefense() {
		return maxMaxDefense;
	}

	public void setMaxMaxDefense(int maxMaxDefense) {
		this.maxMaxDefense = maxMaxDefense;
	}

	public int getMaxMaxSpAtk() {
		return maxMaxSpAtk;
	}

	public void setMaxMaxSpAtk(int maxMaxSpAtk) {
		this.maxMaxSpAtk = maxMaxSpAtk;
	}

	public int getMaxMaxSpDef() {
		return maxMaxSpDef;
	}

	public void setMaxMaxSpDef(int maxMaxSpDef) {
		this.maxMaxSpDef = maxMaxSpDef;
	}

	public int getMaxMaxSpeed() {
		return maxMaxSpeed;
	}

	public void setMaxMaxSpeed(int maxMaxSpeed) {
		this.maxMaxSpeed = maxMaxSpeed;
	}

	public int getMinMaxHp() {
		return minMaxHp;
	}

	public void setMinMaxHp(int minMaxHp) {
		this.minMaxHp = minMaxHp;
	}

	public int getMinMaxAttack() {
		return minMaxAttack;
	}

	public void setMinMaxAttack(int minMaxAttack) {
		this.minMaxAttack = minMaxAttack;
	}

	public int getMinMaxDefense() {
		return minMaxDefense;
	}

	public void setMinMaxDefense(int minMaxDefense) {
		this.minMaxDefense = minMaxDefense;
	}

	public int getMinMaxSpAtk() {
		return minMaxSpAtk;
	}

	public void setMinMaxSpAtk(int minMaxSpAtk) {
		this.minMaxSpAtk = minMaxSpAtk;
	}

	public int getMinMaxSpDef() {
		return minMaxSpDef;
	}

	public void setMinMaxSpDef(int minMaxSpDef) {
		this.minMaxSpDef = minMaxSpDef;
	}

	public int getMinMaxSpeed() {
		return minMaxSpeed;
	}

	public void setMinMaxSpeed(int minMaxSpeed) {
		this.minMaxSpeed = minMaxSpeed;
	}

	public double getCatchRate() {
		return catchRate;
	}

	public void setCatchRate(double catchRate) {
		this.catchRate = catchRate;
	}

	public List<PokemonEvolution> getEvolutions() {
		return evolutions;
	}

	public void setEvolutions(List<PokemonEvolution> evolutions) {
		this.evolutions = evolutions;
	}

	public List<String> getSprites() {
		return sprites;
	}

	public void setSprites(List<String> sprites) {
		this.sprites = sprites;
	}

	@Override
	public String toString() {
		return "PokemonStatic [id=" + id + ", name=" + name + ", type1=" + type1 + ", type2=" + type2 + ", baseHp="
				+ baseHp + ", baseAttack=" + baseAttack + ", baseDefense=" + baseDefense + ", baseSpAtk=" + baseSpAtk
				+ ", baseSpDef=" + baseSpDef + ", baseSpeed=" + baseSpeed + ", maxMaxHp=" + maxMaxHp + ", maxMaxAttack="
				+ maxMaxAttack + ", maxMaxDefense=" + maxMaxDefense + ", maxMaxSpAtk=" + maxMaxSpAtk + ", maxMaxSpDef="
				+ maxMaxSpDef + ", maxMaxSpeed=" + maxMaxSpeed + ", minMaxHp=" + minMaxHp + ", minMaxAttack="
				+ minMaxAttack + ", minMaxDefense=" + minMaxDefense + ", minMaxSpAtk=" + minMaxSpAtk + ", minMaxSpDef="
				+ minMaxSpDef + ", minMaxSpeed=" + minMaxSpeed + ", catchRate=" + catchRate +
				", evolutions="	+ evolutions + 
				", sprites=" + sprites + "]";
	}

}
