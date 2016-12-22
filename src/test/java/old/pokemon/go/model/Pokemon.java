package old.pokemon.go.model;

import java.util.UUID;

import pokemon.go.db.enums.PokemonEnum;

public class Pokemon {
	private UUID uuid;
	
	private PokemonEnum pokemon;

	private int rarity;
	
	private int cp;
		
	private int ivAtk;
	private int ivDef;
	private int ivHp;	
	
	private PokemonMove move1;
	private PokemonMove move2;
	private PokemonMove move3;
	private PokemonMove move4;
	
	private float cp_multiplier;
	
	private Trainer owner;
	
	public Pokemon(UUID uuid, PokemonEnum pokemon, int rarity, int cp, int ivAtk, int ivDef, int ivHp,
			PokemonMove move1, PokemonMove move2, PokemonMove move3, PokemonMove move4, float cp_multiplier) {
		this.uuid = uuid;
		this.pokemon = pokemon;
		this.rarity = rarity;
		this.cp = cp;
		this.ivAtk = ivAtk;
		this.ivDef = ivDef;
		this.ivHp = ivHp;
		this.move1 = move1;
		this.move2 = move2;
		this.move3 = move3;
		this.move4 = move4;
		this.cp_multiplier = cp_multiplier;
	}

	public Pokemon(PokemonEnum pokemon, int rarity, int cp, int ivAtk, int ivDef, int ivHp,
			PokemonMove move1, PokemonMove move2, PokemonMove move3, PokemonMove move4, float cp_multiplier) {
		this.uuid = UUID.randomUUID();
		this.pokemon = pokemon;
		this.rarity = rarity;
		this.cp = cp;
		this.ivAtk = ivAtk;
		this.ivDef = ivDef;
		this.ivHp = ivHp;
		this.move1 = move1;
		this.move2 = move2;
		this.move3 = move3;
		this.move4 = move4;
		this.cp_multiplier = cp_multiplier;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public PokemonEnum getPokemon() {
		return pokemon;
	}

	public void setPokemon(PokemonEnum pokemon) {
		this.pokemon = pokemon;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getIvAtk() {
		return ivAtk;
	}

	public void setIvAtk(int ivAtk) {
		this.ivAtk = ivAtk;
	}

	public int getIvDef() {
		return ivDef;
	}

	public void setIvDef(int ivDef) {
		this.ivDef = ivDef;
	}

	public int getIvHp() {
		return ivHp;
	}

	public void setIvHp(int ivHp) {
		this.ivHp = ivHp;
	}

	public PokemonMove getMove1() {
		return move1;
	}

	public void setMove1(PokemonMove move1) {
		this.move1 = move1;
	}

	public PokemonMove getMove2() {
		return move2;
	}

	public void setMove2(PokemonMove move2) {
		this.move2 = move2;
	}

	public PokemonMove getMove3() {
		return move3;
	}

	public void setMove3(PokemonMove move3) {
		this.move3 = move3;
	}

	public PokemonMove getMove4() {
		return move4;
	}

	public void setMove4(PokemonMove move4) {
		this.move4 = move4;
	}

	public float getCp_multiplier() {
		return cp_multiplier;
	}

	public void setCp_multiplier(float cp_multiplier) {
		this.cp_multiplier = cp_multiplier;
	}

	public Trainer getOwner() {
		return owner;
	}

	public void setOwner(Trainer owner) {
		this.owner = owner;
	}
	

}
