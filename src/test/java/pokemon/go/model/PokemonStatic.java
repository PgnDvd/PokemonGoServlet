//package pokemon.go.model;
//
//import java.util.List;
//import java.util.Map;
//
//import pokemon.go.enums.PokemonEnum;
//import pokemon.go.enums.PokemonType;
//
//public class PokemonStatic {
//	
//	private String name;
//	private int id;
//	
//	private PokemonType type1;
//	private PokemonType type2;
//	
//	private Map<Integer, PokemonEnum> evolutions;
//	
//	private Map<Integer, PokemonMove> moves;
//	private Map<PokemonEnum, PokemonMove> breedingMoves;
//	
//	private List<PokemonMove> tmMoves;
//	private List<PokemonMove> tutoringMoves;
//	
//	private int baseHp;
//	private int baseAttack;
//	private int baseDefense;
//	private int baseSpAtk;
//	private int baseSpDef;
//	private int baseSpeed;
//
//	private int maxMaxHp;
//	private int maxMaxAttack;
//	private int maxMaxDefense;
//	private int maxMaxSpAtk;
//	private int maxMaxSpDef;
//	private int maxMaxSpeed;
//
//
//	private int minMaxHp;
//	private int minMaxAttack;
//	private int minMaxDefense;
//	private int minMaxSpAtk;
//	private int minMaxSpDef;
//	private int minMaxSpeed;
//
//	private Map<String, String> sprites;
//	
//	private double catchRate;
//	
//	public PokemonStatic(String name, int id, PokemonType type1, PokemonType type2,
//			Map<Integer, PokemonEnum> evolutions, Map<Integer, PokemonMove> moves,
//			Map<PokemonEnum, PokemonMove> breedingMoves, List<PokemonMove> tmMoves, List<PokemonMove> tutoringMoves,
//			int baseHp, int baseAttack, int baseDefense, int baseSpAtk, int baseSpDef, int baseSpeed, int maxMaxHp,
//			int maxMaxAttack, int maxMaxDefense, int maxMaxSpAtk, int maxMaxSpDef, int maxMaxSpeed, int minMaxHp,
//			int minMaxAttack, int minMaxDefense, int minMaxSpAtk, int minMaxSpDef, int minMaxSpeed,
//			Map<String, String> sprites, double catchRate) {
//		this.name = name;
//		this.id = id;
//		this.type1 = type1;
//		this.type2 = type2;
//		this.evolutions = evolutions;
//		this.moves = moves;
//		this.breedingMoves = breedingMoves;
//		this.tmMoves = tmMoves;
//		this.tutoringMoves = tutoringMoves;
//		this.baseHp = baseHp;
//		this.baseAttack = baseAttack;
//		this.baseDefense = baseDefense;
//		this.baseSpAtk = baseSpAtk;
//		this.baseSpDef = baseSpDef;
//		this.baseSpeed = baseSpeed;
//		this.maxMaxHp = maxMaxHp;
//		this.maxMaxAttack = maxMaxAttack;
//		this.maxMaxDefense = maxMaxDefense;
//		this.maxMaxSpAtk = maxMaxSpAtk;
//		this.maxMaxSpDef = maxMaxSpDef;
//		this.maxMaxSpeed = maxMaxSpeed;
//		this.minMaxHp = minMaxHp;
//		this.minMaxAttack = minMaxAttack;
//		this.minMaxDefense = minMaxDefense;
//		this.minMaxSpAtk = minMaxSpAtk;
//		this.minMaxSpDef = minMaxSpDef;
//		this.minMaxSpeed = minMaxSpeed;
//		this.sprites = sprites;
//		this.catchRate = catchRate;
//	}
//
//	@Override
//	public String toString() {
//		return "PokemonStatic [name=" + name + ", id=" + id + ", type1=" + type1 + ", type2=" + type2 + ", evolutions="
//				+ evolutions + ", moves=" + moves + ", breedingMoves=" + breedingMoves + ", tmMoves=" + tmMoves
//				+ ", tutoringMoves=" + tutoringMoves + ", baseHp=" + baseHp + ", baseAttack=" + baseAttack
//				+ ", baseDefense=" + baseDefense + ", baseSpAtk=" + baseSpAtk + ", baseSpDef=" + baseSpDef
//				+ ", baseSpeed=" + baseSpeed + ", maxMaxHp=" + maxMaxHp + ", maxMaxAttack=" + maxMaxAttack
//				+ ", maxMaxDefense=" + maxMaxDefense + ", maxMaxSpAtk=" + maxMaxSpAtk + ", maxMaxSpDef=" + maxMaxSpDef
//				+ ", maxMaxSpeed=" + maxMaxSpeed + ", minMaxHp=" + minMaxHp + ", minMaxAttack=" + minMaxAttack
//				+ ", minMaxDefense=" + minMaxDefense + ", minMaxSpAtk=" + minMaxSpAtk + ", minMaxSpDef=" + minMaxSpDef
//				+ ", minMaxSpeed=" + minMaxSpeed + ", sprites=" + sprites + ", catchRate=" + catchRate + "]";
//	}
//
//}
