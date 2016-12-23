package pokemon.go.db.hibernate.model.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@Table(name="PokemonStatic", 
//uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class TrainedPokemon implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true)
	private int id;

	@Column(name="name")
	private String name;

	@Column(name="level", nullable=false)
	private int level;
	@Column(name="exp", nullable=false)
	private int exp;
	@Column(name="inTeam", nullable=false)
	private boolean inTeam;

	@Column(name="weight", nullable=false)
	private int weight;
	@Column(name="height", nullable=false)
	private int height;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username", nullable = false)
	private Trainer trainer;

	@ElementCollection
	@CollectionTable(name="HoldItems", joinColumns=@JoinColumn(name="id"))
	@Column(name="holdItems")
	private List<String> holdItems;

	@Column(name="hp", nullable=false)
	private int hp;
	@Column(name="attack", nullable=false)
	private int attack;
	@Column(name="defense", nullable=false)
	private int defense;
	@Column(name="spAtk", nullable=false)
	private int spAtk;
	@Column(name="spDef", nullable=false)
	private int spDef;
	@Column(name="speed", nullable=false)
	private int speed;

	@Column(name="fullHp", nullable=false)
	private int fullHp;
	@Column(name="fullAttack", nullable=false)
	private int fullAttack;
	@Column(name="fullDefense", nullable=false)
	private int fullDefense;
	@Column(name="fullSpAtk", nullable=false)
	private int fullSpAtk;
	@Column(name="fullSpDef", nullable=false)
	private int fullSpDef;
	@Column(name="fullSpeed", nullable=false)
	private int fullSpeed;
}
