package old.pokemon.go.model;

import java.util.Date;

public class Encounter {
	private long id;
	private Pokemon pokemon;
	private double latitude;
	private double longitude;
	private Date expiration;
	
	public Encounter(long id, Pokemon pokemon, double latitude, double longitude, Date expiration) {
		this.id = id;
		this.pokemon = pokemon;
		this.latitude = latitude;
		this.longitude = longitude;
		this.expiration = expiration;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
}
