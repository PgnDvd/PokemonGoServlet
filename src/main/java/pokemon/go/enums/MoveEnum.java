package pokemon.go.enums;

public enum MoveEnum {
	//replace space, "-", "'"
	STRUGGLE("Struggle","NORMAL","Physical","50","100","-","","Only usable when all PP are gone. Hurts the user.","-"),

	ABSORB("Absorb","GRASS","Special","20","100","25","","User recovers half the HP inflicted on opponent.","-"),
	ACID("Acid","POISON","Special","40","100","30","","May lower opponent's Special Defense.","10"),
	ACID_ARMOR("Acid Armor","POISON","Status","-","-","20","","Sharply raises user's Defense.","-"),
	ACID_SPRAY("Acid Spray","POISON","Special","40","100","20","","Sharply lowers opponent's Special Defense.","100"),
	ACROBATICS("Acrobatics","FLYING","Physical","55","100","15","TM62","Stronger when the user does not have a held item.","-"),
	ACUPRESSURE("Acupressure","NORMAL","Status","-","-","30","","Sharply raises a random stat.","-"),
	AERIAL_ACE("Aerial Ace","FLYING","Physical","60","∞","20","TM40","Ignores Accuracy and Evasiveness.","-"),
	AEROBLAST("Aeroblast","FLYING","Special","100","95","5","","High critical hit ratio.","-"),
	AFTER_YOU("After You","NORMAL","Status","-","-","15","","Gives target priority in the next turn.","-"),
	AGILITY("Agility","PSYCHIC","Status","-","-","30","","Sharply raises user's Speed.","-"),
	AIR_CUTTER("Air Cutter","FLYING","Special","60","95","25","","High critical hit ratio.","-"),
	AIR_SLASH("Air Slash","FLYING","Special","75","95","20","","May cause flinching.","30"),
	ALLY_SWITCH("Ally Switch","PSYCHIC","Status","-","-","15","","User switches with opposite teammate.","-"),
	AMNESIA("Amnesia","PSYCHIC","Status","-","-","20","","Sharply raises user's Special Defense.","-"),
	ANCIENT_POWER("Ancient Power","ROCK","Special","60","100","5","","May raise all user's stats at once.","10"),
	AQUA_JET("Aqua Jet","WATER","Physical","40","100","20","","User attacks first.","-"),
	AQUA_RING("Aqua Ring","WATER","Status","-","-","20","","Restores a little HP each turn.","-"),
	AQUA_TAIL("Aqua Tail","WATER","Physical","90","90","10","","","-"),
	ARM_THRUST("Arm Thrust","FIGHTING","Physical","15","100","20","","Hits 2-5 times in one turn.","-"),
	AROMATHERAPY("Aromatherapy","GRASS","Status","-","-","5","","Cures all status problems in your party.","-"),
	AROMATIC_MIST("Aromatic Mist","FAIRY","Status","-","100","20","","Raises Special Defense of allies.","-"),
	ASSIST("Assist","NORMAL","Status","-","-","20","","In a Double Battle, user randomly attacks with a partner's move.","-"),
	ASSURANCE("Assurance","DARK","Physical","60","100","10","","Power doubles if opponent already took damage in the same turn.","-"),
	ASTONISH("Astonish","GHOST","Physical","30","100","15","","May cause flinching.","30"),
	ATTACK_ORDER("Attack Order","BUG","Physical","90","100","15","","High critical hit ratio.","-"),
	ATTRACT("Attract","NORMAL","Status","-","100","15","TM45","If opponent is the opposite gender, it's less likely to attack.","-"),
	AURA_SPHERE("Aura Sphere","FIGHTING","Special","80","∞","20","","Ignores Accuracy and Evasiveness.","-"),
	AURORA_BEAM("Aurora Beam","ICE","Special","65","100","20","","May lower opponent's Attack.","10"),
	AUTOTOMIZE("Autotomize","STEEL","Status","-","-","15","","Halves weight and sharply raises Speed.","-"),
	AVALANCHE("Avalanche","ICE","Physical","60","100","10","","Power doubles if user took damage first.","-"),
	BABY_DOLL_EYES("Baby-Doll Eyes","FAIRY","Status","-","100","30","","Always goes first. Lowers the target's attack.","-"),
	BARRAGE("Barrage","NORMAL","Physical","15","85","20","","Hits 2-5 times in one turn.","-"),
	BARRIER("Barrier","PSYCHIC","Status","-","-","20","","Sharply raises user's Defense.","-"),
	BATON_PASS("Baton Pass","NORMAL","Status","-","-","40","","User switches out and gives stat changes to the incoming Pokémon.","-"),
	BEAT_UP("Beat Up","DARK","Physical","-","100","30","","Each Pokémon in your party attacks.","-"),
	BELCH("Belch","POISON","Special","120","90","10","","User must have consumed a Berry.","-"),
	BELLY_DRUM("Belly Drum","NORMAL","Status","-","-","10","","User loses 50% of its max HP, but Attack raises to maximum.","-"),
	BESTOW("Bestow","NORMAL","Status","-","-","15","","Gives the user's held item to the target.","-"),
	BIDE("Bide","NORMAL","Physical","-","-","10","","User takes damage for two turns then strikes back double.","-"),
	BIND("Bind","NORMAL","Physical","15","85","20","","Traps opponent, damaging them for 4-5 turns.","-"),
	BITE("Bite","DARK","Physical","60","100","25","","May cause flinching.","30"),
	BLAST_BURN("Blast Burn","FIRE","Special","150","90","5","","User must recharge next turn.","-"),
	BLAZE_KICK("Blaze Kick","FIRE","Physical","85","90","10","","High critical hit ratio. May burn opponent.","10"),
	BLIZZARD("Blizzard","ICE","Special","110","70","5","TM14","May freeze opponent.","10"),
	BLOCK("Block","NORMAL","Status","-","-","5","","Opponent cannot flee or switch.","-"),
	BLUE_FLARE("Blue Flare","FIRE","Special","130","85","5","","May burn opponent.","20"),
	BODY_SLAM("Body Slam","NORMAL","Physical","85","100","15","","May paralyze opponent.","30"),
	BOLT_STRIKE("Bolt Strike","ELECTRIC","Physical","130","85","5","","May paralyze opponent.","20"),
	BONE_CLUB("Bone Club","GROUND","Physical","65","85","20","","May cause flinching.","10"),
	BONE_RUSH("Bone Rush","GROUND","Physical","25","90","10","","Hits 2-5 times in one turn.","-"),
	BONEMERANG("Bonemerang","GROUND","Physical","50","90","10","","Hits twice in one turn.","-"),
	BOOMBURST("Boomburst","NORMAL","Special","140","100","10","","Hits all adjacent Pokémon.","-"),
	BOUNCE("Bounce","FLYING","Physical","85","85","5","","Springs up on first turn, attacks on second. May paralyze opponent.","30"),
	BRAVE_BIRD("Brave Bird","FLYING","Physical","120","100","15","","User receives recoil damage.","-"),
	BRICK_BREAK("Brick Break","FIGHTING","Physical","75","100","15","TM31","Breaks through Reflect and Light Screen barriers.","-"),
	BRINE("Brine","WATER","Special","65","100","10","","Power doubles if opponent's HP is less than 50%.","-"),
	BUBBLE("Bubble","WATER","Special","40","100","30","","May lower opponent's Speed.","10"),
	BUBBLE_BEAM("Bubble Beam","WATER","Special","65","100","20","","May lower opponent's Speed.","10"),
	BUG_BITE("Bug Bite","BUG","Physical","60","100","20","","Receives the effect from the opponent's held berry.","-"),
	BUG_BUZZ("Bug Buzz","BUG","Special","90","100","10","","May lower opponent's Special Defense.","10"),
	BULK_UP("Bulk Up","FIGHTING","Status","-","-","20","TM08","Raises user's Attack and Defense.","-"),
	BULLDOZE("Bulldoze","GROUND","Physical","60","100","20","TM78","Lowers opponent's Speed.","100"),
	BULLET_PUNCH("Bullet Punch","STEEL","Physical","40","100","30","","User attacks first.","-"),
	BULLET_SEED("Bullet Seed","GRASS","Physical","25","100","30","","Hits 2-5 times in one turn.","-"),
	CALM_MIND("Calm Mind","PSYCHIC","Status","-","-","20","TM04","Raises user's Special Attack and Special Defense.","-"),
	CAMOUFLAGE("Camouflage","NORMAL","Status","-","-","20","","Changes user's type according to the location.","-"),
	CAPTIVATE("Captivate","NORMAL","Status","-","100","20","","Sharply lowers opponent's Special Attack if opposite gender.","-"),
	CELEBRATE("Celebrate","NORMAL","Status","-","-","40","","The Pokémon congratulates you on your special day. No battle effect.","-"),
	CHARGE("Charge","ELECTRIC","Status","-","-","20","","Raises user's Special Defense and next Electric move's power increases.","-"),
	CHARGE_BEAM("Charge Beam","ELECTRIC","Special","50","90","10","TM57","May raise user's Special Attack.","70"),
	CHARM("Charm","FAIRY","Status","-","100","20","","Sharply lowers opponent's Attack.","-"),
	CHATTER("Chatter","FLYING","Special","65","100","20","","Confuses opponent.","100"),
	CHIP_AWAY("Chip Away","NORMAL","Physical","70","100","20","","Ignores opponent's stat changes.","-"),
	CIRCLE_THROW("Circle Throw","FIGHTING","Physical","60","90","10","","In battles, the opponent switches. In the wild, the Pokémon runs.","-"),
	CLAMP("Clamp","WATER","Physical","35","85","10","","Traps opponent, damaging them for 4-5 turns.","-"),
	CLEAR_SMOG("Clear Smog","POISON","Special","50","-","15","","Removes all of the target's stat changes.","-"),
	CLOSE_COMBAT("Close Combat","FIGHTING","Physical","120","100","5","","Lowers user's Defense and Special Defense.","-"),
	COIL("Coil","POISON","Status","-","-","20","","Raises user's Attack, Defense and Accuracy.","-"),
	COMET_PUNCH("Comet Punch","NORMAL","Physical","18","85","15","","Hits 2-5 times in one turn.","-"),
	CONFIDE("Confide","NORMAL","Status","-","-","20","TM100","Lowers opponent's Special Attack.","-"),
	CONFUSE_RAY("Confuse Ray","GHOST","Status","-","100","10","","Confuses opponent.","-"),
	CONFUSION("Confusion","PSYCHIC","Special","50","100","25","","May confuse opponent.","10"),
	CONSTRICT("Constrict","NORMAL","Physical","10","100","35","","May lower opponent's Speed by one stage.","10"),
	CONVERSION("Conversion","NORMAL","Status","-","-","30","","Changes user's type to that of its first move.","-"),
	CONVERSION_2("Conversion 2","NORMAL","Status","-","-","30","","User changes type to become resistant to opponent's last move.","-"),
	COPYCAT("Copycat","NORMAL","Status","-","-","20","","Copies opponent's last move.","-"),
	COSMIC_POWER("Cosmic Power","PSYCHIC","Status","-","-","20","","Raises user's Defense and Special Defense.","-"),
	COTTON_GUARD("Cotton Guard","GRASS","Status","-","-","10","","Drastically raises user's Defense.","-"),
	COTTON_SPORE("Cotton Spore","GRASS","Status","-","100","40","","Sharply lowers opponent's Speed.","-"),
	COUNTER("Counter","FIGHTING","Physical","-","100","20","","When hit by a Physical Attack, user strikes back with 2x power.","-"),
	COVET("Covet","NORMAL","Physical","60","100","25","","Opponent's item is stolen by the user.","-"),
	CRABHAMMER("Crabhammer","WATER","Physical","100","90","10","","High critical hit ratio.","-"),
	CRAFTY_SHIELD("Crafty Shield","FAIRY","Status","-","-","10","","Protects the Pokémon from status moves.","-"),
	CROSS_CHOP("Cross Chop","FIGHTING","Physical","100","80","5","","High critical hit ratio.","-"),
	CROSS_POISON("Cross Poison","POISON","Physical","70","100","20","","High critical hit ratio. May poison opponent.","10"),
	CRUNCH("Crunch","DARK","Physical","80","100","15","","May lower opponent's Defense.","20"),
	CRUSH_CLAW("Crush Claw","NORMAL","Physical","75","95","10","","May lower opponent's Defense.","50"),
	CRUSH_GRIP("Crush Grip","NORMAL","Physical","-","100","5","","More powerful when opponent has higher HP.","-"),
	CURSE("Curse","GHOST","Status","-","-","10","","Ghosts lose 50% of max HP and curse the opponent; Non-Ghosts raise Attack, Defense and lower Speed.","-"),
	CUT("Cut","NORMAL","Physical","50","95","30","HM01","","-"),
	DARK_PULSE("Dark Pulse","DARK","Special","80","100","15","TM97","May cause flinching.","20"),
	DARK_VOID("Dark Void","DARK","Status","-","80","10","","Puts all adjacent opponents to sleep.","-"),
	DAZZLING_GLEAM("Dazzling Gleam","FAIRY","Special","80","100","10","TM99","Hits all adjacent opponents.","-"),
	DEFEND_ORDER("Defend Order","BUG","Status","-","-","10","","Raises user's Defense and Special Defense.","-"),
	DEFENSE_CURL("Defense Curl","NORMAL","Status","-","-","40","","Raises user's Defense.","-"),
	DEFOG("Defog","FLYING","Status","-","-","15","","Lowers opponent's Evasiveness and clears fog.","-"),
	DESTINY_BOND("Destiny Bond","GHOST","Status","-","-","5","","If the user faints, the opponent also faints.","-"),
	DETECT("Detect","FIGHTING","Status","-","-","5","","Opponent's attack doesn't affect you, but may fail if used often.","-"),
	DIAMOND_STORM("Diamond Storm","ROCK","Physical","100","95","5","","May raise user's Defense","50"),
	DIG("Dig","GROUND","Physical","80","100","10","TM28","Digs underground on first turn, attacks on second. Can also escape from caves.","-"),
	DISABLE("Disable","NORMAL","Status","-","100","20","","Opponent can't use its last attack for a few turns.","-"),
	DISARMING_VOICE("Disarming Voice","FAIRY","Special","40","∞","15","","Ignores Accuracy and Evasiveness.","-"),
	DISCHARGE("Discharge","ELECTRIC","Special","80","100","15","","May paralyze opponent.","30"),
	DIVE("Dive","WATER","Physical","80","100","10","HM07","Dives underwater on first turn, attacks on second turn.","-"),
	DIZZY_PUNCH("Dizzy Punch","NORMAL","Physical","70","100","10","","May confuse opponent.","20"),
	DOOM_DESIRE("Doom Desire","STEEL","Special","140","100","5","","Damage occurs 2 turns later.","-"),
	DOUBLE_HIT("Double Hit","NORMAL","Physical","35","90","10","","Hits twice in one turn.","-"),
	DOUBLE_KICK("Double Kick","FIGHTING","Physical","30","100","30","","Hits twice in one turn.","-"),
	DOUBLE_SLAP("Double Slap","NORMAL","Physical","15","85","10","","Hits 2-5 times in one turn.","-"),
	DOUBLE_TEAM("Double Team","NORMAL","Status","-","-","15","TM32","Raises user's Evasiveness.","-"),
	DOUBLE_EDGE("Double-Edge","NORMAL","Physical","120","100","15","","User receives recoil damage.","-"),
	DRACO_METEOR("Draco Meteor","DRAGON","Special","130","90","5","","Sharply lowers user's Special Attack.","-"),
	DRAGON_ASCENT("Dragon Ascent","FLYING","Physical","120","100","5","","Lowers user's Defense and Special Defense.","-"),
	DRAGON_BREATH("Dragon Breath","DRAGON","Special","60","100","20","","May paralyze opponent.","30"),
	DRAGON_CLAW("Dragon Claw","DRAGON","Physical","80","100","15","TM02","","-"),
	DRAGON_DANCE("Dragon Dance","DRAGON","Status","-","-","20","","Raises user's Attack and Speed.","-"),
	DRAGON_PULSE("Dragon Pulse","DRAGON","Special","85","100","10","","","-"),
	DRAGON_RAGE("Dragon Rage","DRAGON","Special","-","100","10","","Always inflicts 40 HP.","-"),
	DRAGON_RUSH("Dragon Rush","DRAGON","Physical","100","75","10","","May cause flinching.","20"),
	DRAGON_TAIL("Dragon Tail","DRAGON","Physical","60","90","10","TM82","In battles, the opponent switches. In the wild, the Pokémon runs.","-"),
	DRAIN_PUNCH("Drain Punch","FIGHTING","Physical","75","100","10","","User recovers half the HP inflicted on opponent.","-"),
	DRAINING_KISS("Draining Kiss","FAIRY","Special","50","100","10","","User recovers most the HP inflicted on opponent.","-"),
	DREAM_EATER("Dream Eater","PSYCHIC","Special","100","100","15","TM85","User recovers half the HP inflicted on a sleeping opponent.","-"),
	DRILL_PECK("Drill Peck","FLYING","Physical","80","100","20","","","-"),
	DRILL_RUN("Drill Run","GROUND","Physical","80","95","10","","High critical hit ratio.","-"),
	DUAL_CHOP("Dual Chop","DRAGON","Physical","40","90","15","","Hits twice in one turn.","-"),
	DYNAMIC_PUNCH("Dynamic Punch","FIGHTING","Physical","100","50","5","","Confuses opponent.","100"),
	EARTH_POWER("Earth Power","GROUND","Special","90","100","10","","May lower opponent's Special Defense.","10"),
	EARTHQUAKE("Earthquake","GROUND","Physical","100","100","10","TM26","Power is doubled if opponent is underground from using Dig.","-"),
	ECHOED_VOICE("Echoed Voice","NORMAL","Special","40","100","15","TM49","Power increases each turn.","-"),
	EERIE_IMPULSE("Eerie Impulse","ELECTRIC","Status","-","100","15","","Sharply lowers opponent's Special Attack.","-"),
	EGG_BOMB("Egg Bomb","NORMAL","Physical","100","75","10","","","-"),
	ELECTRIC_TERRAIN("Electric Terrain","ELECTRIC","Status","-","-","10","","Prevents all Pokémon from falling asleep for 5 turns.","-"),
	ELECTRIFY("Electrify","ELECTRIC","Status","-","-","20","","Changes the target's move to Electric type.","-"),
	ELECTRO_BALL("Electro Ball","ELECTRIC","Special","-","100","10","","The faster the user, the stronger the attack.","-"),
	ELECTROWEB("Electroweb","ELECTRIC","Special","55","95","15","","Lowers opponent's Speed.","100"),
	EMBARGO("Embargo","DARK","Status","-","100","15","TM63","Opponent cannot use items.","-"),
	EMBER("Ember","FIRE","Special","40","100","25","","May burn opponent.","10"),
	ENCORE("Encore","NORMAL","Status","-","100","5","","Forces opponent to keep using its last move for 3 turns.","-"),
	ENDEAVOR("Endeavor","NORMAL","Physical","-","100","5","","Reduces opponent's HP to same as user's.","-"),
	ENDURE("Endure","NORMAL","Status","-","-","10","","Always left with at least 1 HP, but may fail if used consecutively.","-"),
	ENERGY_BALL("Energy Ball","GRASS","Special","90","100","10","TM53","May lower opponent's Special Defense.","10"),
	ENTRAINMENT("Entrainment","NORMAL","Status","-","100","15","","Makes target's ability same as user's.","-"),
	ERUPTION("Eruption","FIRE","Special","150","100","5","","Stronger when the user's HP is higher.","-"),
	EXPLOSION("Explosion","NORMAL","Physical","250","100","5","TM64","User faints.","-"),
	EXTRASENSORY("Extrasensory","PSYCHIC","Special","80","100","20","","May cause flinching.","10"),
	EXTREME_SPEED("Extreme Speed","NORMAL","Physical","80","100","5","","User attacks first.","-"),
	FACADE("Facade","NORMAL","Physical","70","100","20","TM42","Power doubles if user is burned, poisoned, or paralyzed.","-"),
	FAIRY_LOCK("Fairy Lock","FAIRY","Status","-","-","10","","Prevents fleeing in the next turn.","-"),
	FAIRY_WIND("Fairy Wind","FAIRY","Special","40","100","30","","","-"),
	FAKE_OUT("Fake Out","NORMAL","Physical","40","100","10","","User attacks first, foe flinches. Only usable on first turn.","100"),
	FAKE_TEARS("Fake Tears","DARK","Status","-","100","20","","Sharply lowers opponent's Special Defense.","-"),
	FALSE_SWIPE("False Swipe","NORMAL","Physical","40","100","40","TM54","Always leaves opponent with at least 1 HP.","-"),
	FEATHER_DANCE("Feather Dance","FLYING","Status","-","100","15","","Sharply lowers opponent's Attack.","-"),
	FEINT("Feint","NORMAL","Physical","30","100","10","","Only hits if opponent uses Protect or Detect in the same turn.","-"),
	FEINT_ATTACK("Feint Attack","DARK","Physical","60","∞","20","","Ignores Accuracy and Evasiveness.","-"),
	FELL_STINGER("Fell Stinger","BUG","Physical","30","100","25","","Sharply raises user's Attack if target is KO'd.","-"),
	FIERY_DANCE("Fiery Dance","FIRE","Special","80","100","10","","May raise user's Special Attack.","50"),
	FINAL_GAMBIT("Final Gambit","FIGHTING","Special","-","100","5","","Inflicts damage equal to the user's remaining HP. User faints.","-"),
	FIRE_BLAST("Fire Blast","FIRE","Special","110","85","5","TM38","May burn opponent.","10"),
	FIRE_FANG("Fire Fang","FIRE","Physical","65","95","15","","May cause flinching and/or burn opponent.","10"),
	FIRE_PLEDGE("Fire Pledge","FIRE","Special","80","100","10","","Added effects appear if combined with Grass Pledge or Water Pledge.","-"),
	FIRE_PUNCH("Fire Punch","FIRE","Physical","75","100","15","","May burn opponent.","10"),
	FIRE_SPIN("Fire Spin","FIRE","Special","35","85","15","","Traps opponent, damaging them for 4-5 turns.","-"),
	FISSURE("Fissure","GROUND","Physical","-","-","5","","One-Hit-KO, if it hits.","-"),
	FLAIL("Flail","NORMAL","Physical","-","100","15","","The lower the user's HP, the higher the power.","-"),
	FLAME_BURST("Flame Burst","FIRE","Special","70","100","15","","May also injure nearby Pokémon.","-"),
	FLAME_CHARGE("Flame Charge","FIRE","Physical","50","100","20","TM43","Raises user's Speed.","100"),
	FLAME_WHEEL("Flame Wheel","FIRE","Physical","60","100","25","","May burn opponent.","10"),
	FLAMETHROWER("Flamethrower","FIRE","Special","90","100","15","TM35","May burn opponent.","10"),
	FLARE_BLITZ("Flare Blitz","FIRE","Physical","120","100","15","","User receives recoil damage. May burn opponent.","10"),
	FLASH("Flash","NORMAL","Status","-","100","20","TM70","Lowers opponent's Accuracy.","-"),
	FLASH_CANNON("Flash Cannon","STEEL","Special","80","100","10","TM91","May lower opponent's Special Defense.","10"),
	FLATTER("Flatter","DARK","Status","-","100","15","","Confuses opponent, but raises its Special Attack by two stages.","-"),
	FLING("Fling","DARK","Physical","-","100","10","TM56","Power depends on held item.","-"),
	FLOWER_SHIELD("Flower Shield","FAIRY","Status","-","-","10","","Sharply raises Defense of all Grass-type Pokémon on the field.","-"),
	FLY("Fly","FLYING","Physical","90","95","15","HM02","Flies up on first turn, attacks on second turn.","-"),
	FLYING_PRESS("Flying Press","FIGHTING","Physical","80","95","10","","Deals Fighting and Flying type damage.","-"),
	FOCUS_BLAST("Focus Blast","FIGHTING","Special","120","70","5","TM52","May lower opponent's Special Defense.","10"),
	FOCUS_ENERGY("Focus Energy","NORMAL","Status","-","-","30","","Increases critical hit ratio.","-"),
	FOCUS_PUNCH("Focus Punch","FIGHTING","Physical","150","100","20","","If the user is hit before attacking, it flinches instead.","-"),
	FOLLOW_ME("Follow Me","NORMAL","Status","-","-","20","","In Double Battle, the user takes all the attacks.","-"),
	FORCE_PALM("Force Palm","FIGHTING","Physical","60","100","10","","May paralyze opponent.","30"),
	FORESIGHT("Foresight","NORMAL","Status","-","-","40","","Resets opponent's Evasiveness, Normal-type and Fighting-type attacks can now hit Ghosts, and Ghost-type attacks hit Normal.","-"),
	FOREST_S_CURSE("Forest's Curse","GRASS","Status","-","100","20","","Adds Grass type to opponent.","-"),
	FOUL_PLAY("Foul Play","DARK","Physical","95","100","15","","Uses the opponent's Attack stat.","-"),
	FREEZE_SHOCK("Freeze Shock","ICE","Physical","140","90","5","","Charges on first turn, attacks on second. May paralyze opponent.","30"),
	FREEZE_DRY("Freeze-Dry","ICE","Special","70","100","20","","May freeze opponent. Super-effective against Water types.","-"),
	FRENZY_PLANT("Frenzy Plant","GRASS","Special","150","90","5","","User must recharge next turn.","-"),
	FROST_BREATH("Frost Breath","ICE","Special","60","90","10","TM79","Always results in a critical hit.","100"),
	FRUSTRATION("Frustration","NORMAL","Physical","-","100","20","TM21","Power decreases with higher Happiness.","-"),
	FURY_ATTACK("Fury Attack","NORMAL","Physical","15","85","20","","Hits 2-5 times in one turn.","-"),
	FURY_CUTTER("Fury Cutter","BUG","Physical","40","95","20","","Power increases each turn.","-"),
	FURY_SWIPES("Fury Swipes","NORMAL","Physical","18","80","15","","Hits 2-5 times in one turn.","-"),
	FUSION_BOLT("Fusion Bolt","ELECTRIC","Physical","100","100","5","","Power increases if Fusion Flare is used in the same turn.","-"),
	FUSION_FLARE("Fusion Flare","FIRE","Special","100","100","5","","Power increases if Fusion Bolt is used in the same turn.","-"),
	FUTURE_SIGHT("Future Sight","PSYCHIC","Special","120","100","10","","Damage occurs 2 turns later.","-"),
	GASTRO_ACID("Gastro Acid","POISON","Status","-","100","10","","Cancels out the effect of the opponent's Ability.","-"),
	GEAR_GRIND("Gear Grind","STEEL","Physical","50","85","15","","Hits twice in one turn.","-"),
	GEOMANCY("Geomancy","FAIRY","Status","-","-","10","","Charges on first turn, sharply raises user's Sp. Attack, Sp. Defense and Speed on the second.","-"),
	GIGA_DRAIN("Giga Drain","GRASS","Special","75","100","10","","User recovers half the HP inflicted on opponent.","-"),
	GIGA_IMPACT("Giga Impact","NORMAL","Physical","150","90","5","TM68","User must recharge next turn.","-"),
	GLACIATE("Glaciate","ICE","Special","65","95","10","","Lowers opponent's Speed.","100"),
	GLARE("Glare","NORMAL","Status","-","100","30","","Paralyzes opponent.","-"),
	GRASS_KNOT("Grass Knot","GRASS","Special","-","100","20","TM86","The heavier the opponent, the stronger the attack.","-"),
	GRASS_PLEDGE("Grass Pledge","GRASS","Special","80","100","10","","Added effects appear if preceded by Water Pledge or succeeded by Fire Pledge.","-"),
	GRASS_WHISTLE("Grass Whistle","GRASS","Status","-","55","15","","Puts opponent to sleep.","-"),
	GRASSY_TERRAIN("Grassy Terrain","GRASS","Status","-","-","10","","Restores a little HP of all Pokémon for 5 turns.","-"),
	GRAVITY("Gravity","PSYCHIC","Status","-","-","5","","Prevents moves like Fly and Bounce and the Ability Levitate for 5 turns.","-"),
	GROWL("Growl","NORMAL","Status","-","100","40","","Lowers opponent's Attack.","-"),
	GROWTH("Growth","NORMAL","Status","-","-","40","","Raises user's Attack and Special Attack.","-"),
	GRUDGE("Grudge","GHOST","Status","-","-","5","","If the users faints after using this move, the PP for the opponent's last move is depleted.","-"),
	GUARD_SPLIT("Guard Split","PSYCHIC","Status","-","-","10","","Averages Defense and Special Defense with the target.","-"),
	GUARD_SWAP("Guard Swap","PSYCHIC","Status","-","-","10","","User and opponent swap Defense and Special Defense.","-"),
	GUILLOTINE("Guillotine","NORMAL","Physical","-","-","5","","One-Hit-KO, if it hits.","-"),
	GUNK_SHOT("Gunk Shot","POISON","Physical","120","80","5","","May poison opponent.","30"),
	GUST("Gust","FLYING","Special","40","100","35","","Hits Pokémon using Fly/Bounce with double power.","-"),
	GYRO_BALL("Gyro Ball","STEEL","Physical","-","100","5","TM74","The slower the user, the stronger the attack.","-"),
	HAIL("Hail","ICE","Status","-","-","10","TM07","Non-Ice types are damaged for 5 turns.","-"),
	HAMMER_ARM("Hammer Arm","FIGHTING","Physical","100","90","10","","Lowers user's Speed.","-"),
	HAPPY_HOUR("Happy Hour","NORMAL","Status","-","-","30","","Doubles prize money from trainer battles.","-"),
	HARDEN("Harden","NORMAL","Status","-","-","30","","Raises user's Defense.","-"),
	HAZE("Haze","ICE","Status","-","-","30","","Resets all stat changes.","-"),
	HEAD_CHARGE("Head Charge","NORMAL","Physical","120","100","15","","User receives recoil damage.","-"),
	HEAD_SMASH("Head Smash","ROCK","Physical","150","80","5","","User receives recoil damage.","-"),
	HEADBUTT("Headbutt","NORMAL","Physical","70","100","15","","May cause flinching.","30"),
	HEAL_BELL("Heal Bell","NORMAL","Status","-","-","5","","Heals the user's party's status conditions.","-"),
	HEAL_BLOCK("Heal Block","PSYCHIC","Status","-","-","15","","Prevents the opponent from restoring HP for 5 turns.","-"),
	HEAL_ORDER("Heal Order","BUG","Status","-","-","10","","User recovers half its max HP.","-"),
	HEAL_PULSE("Heal Pulse","PSYCHIC","Status","-","-","10","","Restores half the target's max HP.","-"),
	HEALING_WISH("Healing Wish","PSYCHIC","Status","-","-","10","","The user faints and the next Pokémon released is fully healed.","-"),
	HEART_STAMP("Heart Stamp","PSYCHIC","Physical","60","100","25","","May cause flinching.","30"),
	HEART_SWAP("Heart Swap","PSYCHIC","Status","-","-","10","","Stat changes are swapped with the opponent.","-"),
	HEAT_CRASH("Heat Crash","FIRE","Physical","-","100","10","","The heavier the user, the stronger the attack.","-"),
	HEAT_WAVE("Heat Wave","FIRE","Special","95","90","10","","May burn opponent.","10"),
	HEAVY_SLAM("Heavy Slam","STEEL","Physical","-","100","10","","The heavier the user, the stronger the attack.","-"),
	HELPING_HAND("Helping Hand","NORMAL","Status","-","-","20","","In Double Battles, boosts the power of the partner's move.","-"),
	HEX("Hex","GHOST","Special","65","100","10","","Inflicts more damage if the target has a status condition.","-"),
	HIDDEN_POWER("Hidden Power","NORMAL","Special","60","100","15","TM10","Type and power depends on user's IVs.","-"),
	HIGH_JUMP_KICK("High Jump Kick","FIGHTING","Physical","130","90","10","","If it misses, the user loses half their HP.","-"),
	HOLD_BACK("Hold Back","NORMAL","Physical","40","100","40","","Always leaves opponent with at least 1 HP.","-"),
	HOLD_HANDS("Hold Hands","NORMAL","Status","-","-","40","","Makes the user and an ally very happy.","-"),
	HONE_CLAWS("Hone Claws","DARK","Status","-","-","15","TM01","Raises user's Attack and Accuracy.","-"),
	HORN_ATTACK("Horn Attack","NORMAL","Physical","65","100","25","","","-"),
	HORN_DRILL("Horn Drill","NORMAL","Physical","-","-","5","","One-Hit-KO, if it hits.","-"),
	HORN_LEECH("Horn Leech","GRASS","Physical","75","100","10","","User recovers half the HP inflicted on opponent.","-"),
	HOWL("Howl","NORMAL","Status","-","-","40","","Raises user's Attack.","-"),
	HURRICANE("Hurricane","FLYING","Special","110","70","10","","May confuse opponent.","30"),
	HYDRO_CANNON("Hydro Cannon","WATER","Special","150","90","5","","User must recharge next turn.","-"),
	HYDRO_PUMP("Hydro Pump","WATER","Special","110","80","5","","","-"),
	HYPER_BEAM("Hyper Beam","NORMAL","Special","150","90","5","TM15","User must recharge next turn.","-"),
	HYPER_FANG("Hyper Fang","NORMAL","Physical","80","90","15","","May cause flinching.","10"),
	HYPER_VOICE("Hyper Voice","NORMAL","Special","90","100","10","","","-"),
	HYPERSPACE_FURY("Hyperspace Fury","DARK","Physical","100","∞","5","","Lowers user's Defense. Can strike through Protect/Detect.","-"),
	HYPERSPACE_HOLE("Hyperspace Hole","PSYCHIC","Special","80","∞","5","","Can strike through Protect/Detect.","-"),
	HYPNOSIS("Hypnosis","PSYCHIC","Status","-","60","20","","Puts opponent to sleep.","-"),
	ICE_BALL("Ice Ball","ICE","Physical","30","90","20","","Doubles in power each turn for 5 turns.","-"),
	ICE_BEAM("Ice Beam","ICE","Special","90","100","10","TM13","May freeze opponent.","10"),
	ICE_BURN("Ice Burn","ICE","Special","140","90","5","","Charges on first turn, attacks on second. May burn opponent.","30"),
	ICE_FANG("Ice Fang","ICE","Physical","65","95","15","","May cause flinching and/or freeze opponent.","10"),
	ICE_PUNCH("Ice Punch","ICE","Physical","75","100","15","","May freeze opponent.","10"),
	ICE_SHARD("Ice Shard","ICE","Physical","40","100","30","","User attacks first.","-"),
	ICICLE_CRASH("Icicle Crash","ICE","Physical","85","90","10","","May cause flinching.","30"),
	ICICLE_SPEAR("Icicle Spear","ICE","Physical","25","100","30","","Hits 2-5 times in one turn.","-"),
	ICY_WIND("Icy Wind","ICE","Special","55","95","15","","Lowers opponent's Speed.","100"),
	IMPRISON("Imprison","PSYCHIC","Status","-","-","10","","Opponent is unable to use moves that the user also knows.","-"),
	INCINERATE("Incinerate","FIRE","Special","60","100","15","TM59","Destroys the target's held berry.","-"),
	INFERNO("Inferno","FIRE","Special","100","50","5","","Burns opponent.","100"),
	INFESTATION("Infestation","BUG","Special","20","100","20","TM83","Traps opponent, damaging them for 4-5 turns.","-"),
	INGRAIN("Ingrain","GRASS","Status","-","-","20","","User restores HP each turn. User cannot escape/switch.","-"),
	ION_DELUGE("Ion Deluge","ELECTRIC","Status","-","-","25","","Changes Normal-type moves to Electric-type.","-"),
	IRON_DEFENSE("Iron Defense","STEEL","Status","-","-","15","","Sharply raises user's Defense.","-"),
	IRON_HEAD("Iron Head","STEEL","Physical","80","100","15","","May cause flinching.","30"),
	IRON_TAIL("Iron Tail","STEEL","Physical","100","75","15","","May lower opponent's Defense.","10"),
	JUDGMENT("Judgment","NORMAL","Special","100","100","10","","Type depends on the Arceus Plate being held.","-"),
	JUMP_KICK("Jump Kick","FIGHTING","Physical","100","95","10","","If it misses, the user loses half their HP.","-"),
	KARATE_CHOP("Karate Chop","FIGHTING","Physical","50","100","25","","High critical hit ratio.","-"),
	KINESIS("Kinesis","PSYCHIC","Status","-","80","15","","Lowers opponent's Accuracy.","-"),
	KING_S_SHIELD("King's Shield","STEEL","Status","-","-","10","","Protects against attacks, and lowers opponent's Attack on contact.","-"),
	KNOCK_OFF("Knock Off","DARK","Physical","65","100","25","","Removes opponent's held item for the rest of the battle.","-"),
	LAND_S_WRATH("Land's Wrath","GROUND","Physical","90","100","10","","","-"),
	LAST_RESORT("Last Resort","NORMAL","Physical","140","100","5","","Can only be used after all other moves are used.","-"),
	LAVA_PLUME("Lava Plume","FIRE","Special","80","100","15","","May burn opponent.","30"),
	LEAF_BLADE("Leaf Blade","GRASS","Physical","90","100","15","","High critical hit ratio.","-"),
	LEAF_STORM("Leaf Storm","GRASS","Special","130","90","5","","Sharply lowers user's Special Attack.","-"),
	LEAF_TORNADO("Leaf Tornado","GRASS","Special","65","90","10","","May lower opponent's Accuracy.","30"),
	LEECH_LIFE("Leech Life","BUG","Physical","20","100","15","","User recovers half the HP inflicted on opponent.","-"),
	LEECH_SEED("Leech Seed","GRASS","Status","-","90","10","","User steals HP from opponent each turn.","-"),
	LEER("Leer","NORMAL","Status","-","100","30","","Lowers opponent's Defense.","-"),
	LICK("Lick","GHOST","Physical","30","100","30","","May paralyze opponent.","30"),
	LIGHT_OF_RUIN("Light of Ruin","FAIRY","Special","140","90","5","","User receives recoil damage.","-"),
	LIGHT_SCREEN("Light Screen","PSYCHIC","Status","-","-","30","TM16","Halves damage from Special attacks for 5 turns.","-"),
	LOCK_ON("Lock-On","NORMAL","Status","-","-","5","","The next move the user uses is guaranteed to hit.","-"),
	LOVELY_KISS("Lovely Kiss","NORMAL","Status","-","75","10","","Puts opponent to sleep.","-"),
	LOW_KICK("Low Kick","FIGHTING","Physical","-","100","20","","The heavier the opponent, the stronger the attack.","-"),
	LOW_SWEEP("Low Sweep","FIGHTING","Physical","65","100","20","TM47","Lowers opponent's Speed.","100"),
	LUCKY_CHANT("Lucky Chant","NORMAL","Status","-","-","30","","Opponent cannot land critical hits for 5 turns.","-"),
	LUNAR_DANCE("Lunar Dance","PSYCHIC","Status","-","-","10","","The user faints but the next Pokémon released is fully healed.","-"),
	LUSTER_PURGE("Luster Purge","PSYCHIC","Special","70","100","5","","May lower opponent's Special Defense.","50"),
	MACH_PUNCH("Mach Punch","FIGHTING","Physical","40","100","30","","User attacks first.","-"),
	MAGIC_COAT("Magic Coat","PSYCHIC","Status","-","-","15","","Reflects moves that cause status conditions back to the attacker.","-"),
	MAGIC_ROOM("Magic Room","PSYCHIC","Status","-","-","10","","Suppresses the effects of held items for five turns.","-"),
	MAGICAL_LEAF("Magical Leaf","GRASS","Special","60","∞","20","","Ignores Accuracy and Evasiveness.","-"),
	MAGMA_STORM("Magma Storm","FIRE","Special","120","75","5","","Traps opponent, damaging them for 4-5 turns.","-"),
	MAGNET_BOMB("Magnet Bomb","STEEL","Physical","60","∞","20","","Ignores Accuracy and Evasiveness.","-"),
	MAGNET_RISE("Magnet Rise","ELECTRIC","Status","-","-","10","","User becomes immune to Ground-type moves for 5 turns.","-"),
	MAGNETIC_FLUX("Magnetic Flux","ELECTRIC","Status","-","-","20","","Raises Defense and Sp. Defense of Plus/Minus Pokémon.","-"),
	MAGNITUDE("Magnitude","GROUND","Physical","-","100","30","","Hits with random power.","-"),
	MAT_BLOCK("Mat Block","FIGHTING","Status","-","-","15","","Protects teammates from damaging moves.","-"),
	ME_FIRST("Me First","NORMAL","Status","-","-","20","","User copies the opponent's attack with 1.5× power.","-"),
	MEAN_LOOK("Mean Look","NORMAL","Status","-","-","5","","Opponent cannot flee or switch.","-"),
	MEDITATE("Meditate","PSYCHIC","Status","-","-","40","","Raises user's Attack.","-"),
	MEGA_DRAIN("Mega Drain","GRASS","Special","40","100","15","","User recovers half the HP inflicted on opponent.","-"),
	MEGA_KICK("Mega Kick","NORMAL","Physical","120","75","5","","","-"),
	MEGA_PUNCH("Mega Punch","NORMAL","Physical","80","85","20","","","-"),
	MEGAHORN("Megahorn","BUG","Physical","120","85","10","","","-"),
	MEMENTO("Memento","DARK","Status","-","100","10","","User faints, sharply lowers opponent's Attack and Special Attack.","-"),
	METAL_BURST("Metal Burst","STEEL","Physical","-","100","10","","Deals damage equal to 1.5x opponent's attack.","-"),
	METAL_CLAW("Metal Claw","STEEL","Physical","50","95","35","","May raise user's Attack.","10"),
	METAL_SOUND("Metal Sound","STEEL","Status","-","85","40","","Sharply lowers opponent's Special Defense.","-"),
	METEOR_MASH("Meteor Mash","STEEL","Physical","90","90","10","","May raise user's Attack.","20"),
	METRONOME("Metronome","NORMAL","Status","-","-","10","","User performs any move in the game at random.","-"),
	MILK_DRINK("Milk Drink","NORMAL","Status","-","-","10","","User recovers half its max HP.","-"),
	MIMIC("Mimic","NORMAL","Status","-","-","10","","Copies the opponent's last move.","-"),
	MIND_READER("Mind Reader","NORMAL","Status","-","-","5","","User's next attack is guaranteed to hit.","-"),
	MINIMIZE("Minimize","NORMAL","Status","-","-","10","","Sharply raises user's Evasiveness.","-"),
	MIRACLE_EYE("Miracle Eye","PSYCHIC","Status","-","-","40","","Resets opponent's Evasiveness, removes Dark's Psychic immunity.","-"),
	MIRROR_COAT("Mirror Coat","PSYCHIC","Special","-","100","20","","When hit by a Special Attack, user strikes back with 2x power.","-"),
	MIRROR_MOVE("Mirror Move","FLYING","Status","-","-","20","","User performs the opponent's last move.","-"),
	MIRROR_SHOT("Mirror Shot","STEEL","Special","65","85","10","","May lower opponent's Accuracy.","30"),
	MIST("Mist","ICE","Status","-","-","30","","User's stats cannot be changed for a period of time.","-"),
	MIST_BALL("Mist Ball","PSYCHIC","Special","70","100","5","","May lower opponent's Special Attack.","50"),
	MISTY_TERRAIN("Misty Terrain","FAIRY","Status","-","-","10","","Protects the field from status conditions for 5 turns.","-"),
	MOONBLAST("Moonblast","FAIRY","Special","95","100","15","","May lower opponent's Special Attack.","30"),
	MOONLIGHT("Moonlight","FAIRY","Status","-","-","5","","User recovers HP. Amount varies with the weather.","-"),
	MORNING_SUN("Morning Sun","NORMAL","Status","-","-","5","","User recovers HP. Amount varies with the weather.","-"),
	MUD_BOMB("Mud Bomb","GROUND","Special","65","85","10","","May lower opponent's Accuracy.","30"),
	MUD_SHOT("Mud Shot","GROUND","Special","55","95","15","","Lowers opponent's Speed.","100"),
	MUD_SPORT("Mud Sport","GROUND","Status","-","-","15","","Weakens the power of Electric-type moves.","-"),
	MUD_SLAP("Mud-Slap","GROUND","Special","20","100","10","","Lowers opponent's Accuracy.","100"),
	MUDDY_WATER("Muddy Water","WATER","Special","90","85","10","","May lower opponent's Accuracy.","30"),
	MYSTICAL_FIRE("Mystical Fire","FIRE","Special","65","100","10","","Lowers opponent's Special Attack.","100"),
	NASTY_PLOT("Nasty Plot","DARK","Status","-","-","20","","Sharply raises user's Special Attack.","-"),
	NATURAL_GIFT("Natural Gift","NORMAL","Physical","-","100","15","","Power and type depend on the user's held berry.","-"),
	NATURE_POWER("Nature Power","NORMAL","Status","-","-","20","TM96","Uses a certain move based on the current terrain.","-"),
	NEEDLE_ARM("Needle Arm","GRASS","Physical","60","100","15","","May cause flinching.","30"),
	NIGHT_DAZE("Night Daze","DARK","Special","85","95","10","","May lower opponent's Accuracy.","40"),
	NIGHT_SHADE("Night Shade","GHOST","Special","-","100","15","","Inflicts damage equal to user's level.","-"),
	NIGHT_SLASH("Night Slash","DARK","Physical","70","100","15","","High critical hit ratio.","-"),
	NIGHTMARE("Nightmare","GHOST","Status","-","100","15","","The sleeping opponent loses 25% of its max HP each turn.","-"),
	NOBLE_ROAR("Noble Roar","NORMAL","Status","-","100","30","","Lowers opponent's Attack and Special Attack.","-"),
	NUZZLE("Nuzzle","ELECTRIC","Physical","20","100","20","","Paralyzes opponent.","100"),
	OBLIVION_WING("Oblivion Wing","FLYING","Special","80","100","10","","User recovers most of the HP inflicted on opponent.","-"),
	OCTAZOOKA("Octazooka","WATER","Special","65","85","10","","May lower opponent's Accuracy.","50"),
	ODOR_SLEUTH("Odor Sleuth","NORMAL","Status","-","-","40","","Resets opponent's Evasiveness, Normal-type and Fighting-type attacks can now hit Ghosts, and Ghost-type attacks hit Normal.","-"),
	OMINOUS_WIND("Ominous Wind","GHOST","Special","60","100","5","","May raise all user's stats at once.","10"),
	ORIGIN_PULSE("Origin Pulse","WATER","Special","110","85","10","","Hits all adjacent opponents.","-"),
	OUTRAGE("Outrage","DRAGON","Physical","120","100","10","","User attacks for 2-3 turns but then becomes confused.","-"),
	OVERHEAT("Overheat","FIRE","Special","130","90","5","TM50","Sharply lowers user's Special Attack.","-"),
	PAIN_SPLIT("Pain Split","NORMAL","Status","-","-","20","","The user's and opponent's HP becomes the average of both.","-"),
	PARABOLIC_CHARGE("Parabolic Charge","ELECTRIC","Special","50","100","20","","User recovers half the HP inflicted on opponent.","-"),
	PARTING_SHOT("Parting Shot","DARK","Status","-","100","20","","Lowers opponent's Attack and Special Attack then switches out.","-"),
	PAY_DAY("Pay Day","NORMAL","Physical","40","100","20","","A small amount of money is gained after the battle resolves.","-"),
	PAYBACK("Payback","DARK","Physical","50","100","10","TM66","Power doubles if the user was attacked first.","-"),
	PECK("Peck","FLYING","Physical","35","100","35","","","-"),
	PERISH_SONG("Perish Song","NORMAL","Status","-","-","5","","Any Pokémon in play when this attack is used faints in 3 turns.","-"),
	PETAL_BLIZZARD("Petal Blizzard","GRASS","Physical","90","100","15","","Hits all adjacent Pokémon.","-"),
	PETAL_DANCE("Petal Dance","GRASS","Special","120","100","10","","User attacks for 2-3 turns but then becomes confused.","-"),
	PHANTOM_FORCE("Phantom Force","GHOST","Physical","90","100","10","","Disappears on first turn, attacks on second. Can strike through Protect/Detect.","-"),
	PIN_MISSILE("Pin Missile","BUG","Physical","25","95","20","","Hits 2-5 times in one turn.","-"),
	PLAY_NICE("Play Nice","NORMAL","Status","-","-","20","","Lowers opponent's Attack. Always hits.","-"),
	PLAY_ROUGH("Play Rough","FAIRY","Physical","90","90","10","","May lower opponent's Attack.","10"),
	PLUCK("Pluck","FLYING","Physical","60","100","20","","If the opponent is holding a berry, its effect is stolen by user.","-"),
	POISON_FANG("Poison Fang","POISON","Physical","50","100","15","","May badly poison opponent.","50"),
	POISON_GAS("Poison Gas","POISON","Status","-","90","40","","Poisons opponent.","-"),
	POISON_JAB("Poison Jab","POISON","Physical","80","100","20","TM84","May poison the opponent.","30"),
	POISON_POWDER("Poison Powder","POISON","Status","-","75","35","","Poisons opponent.","-"),
	POISON_STING("Poison Sting","POISON","Physical","15","100","35","","May poison the opponent.","30"),
	POISON_TAIL("Poison Tail","POISON","Physical","50","100","25","","High critical hit ratio. May poison opponent.","10"),
	POUND("Pound","NORMAL","Physical","40","100","35","","","-"),
	POWDER("Powder","BUG","Status","-","100","20","","Damages Pokémon using Fire type moves.","-"),
	POWDER_SNOW("Powder Snow","ICE","Special","40","100","25","","May freeze opponent.","10"),
	POWER_GEM("Power Gem","ROCK","Special","80","100","20","","","-"),
	POWER_SPLIT("Power Split","PSYCHIC","Status","-","-","10","","Averages Attack and Special Attack with the target.","-"),
	POWER_SWAP("Power Swap","PSYCHIC","Status","-","-","10","","User and opponent swap Attack and Special Attack.","-"),
	POWER_TRICK("Power Trick","PSYCHIC","Status","-","-","10","","User's own Attack and Defense switch.","-"),
	POWER_WHIP("Power Whip","GRASS","Physical","120","85","10","","","-"),
	POWER_UP_PUNCH("Power-Up Punch","FIGHTING","Physical","40","100","10","TM98","Raises Attack.","100"),
	PRECIPICE_BLADES("Precipice Blades","GROUND","Physical","120","85","10","","Hits all adjacent opponents.","-"),
	PRESENT("Present","NORMAL","Physical","-","90","15","","Either deals damage or heals.","-"),
	PROTECT("Protect","NORMAL","Status","-","-","10","TM17","User is not affected by opponent's move.","-"),
	PSYBEAM("Psybeam","PSYCHIC","Special","65","100","20","","May confuse opponent.","10"),
	PSYCH_UP("Psych Up","NORMAL","Status","-","-","10","TM77","Copies the opponent's stat changes.","-"),
	PSYCHIC("Psychic","PSYCHIC","Special","90","100","10","TM29","May lower opponent's Special Defense.","10"),
	PSYCHO_BOOST("Psycho Boost","PSYCHIC","Special","140","90","5","","Sharply lowers user's Special Attack.","-"),
	PSYCHO_CUT("Psycho Cut","PSYCHIC","Physical","70","100","20","","High critical hit ratio.","-"),
	PSYCHO_SHIFT("Psycho Shift","PSYCHIC","Status","-","90","10","","Gives the opponent the user's status condition, if it hits.","-"),
	PSYSHOCK("Psyshock","PSYCHIC","Special","80","100","10","TM03","Inflicts damage based on the target's Defense, not Special Defense.","-"),
	PSYSTRIKE("Psystrike","PSYCHIC","Special","100","100","10","","Inflicts damage based on the target's Defense, not Special Defense.","-"),
	PSYWAVE("Psywave","PSYCHIC","Special","-","80","15","","Inflicts damage 50-150% of user's level.","-"),
	PUNISHMENT("Punishment","DARK","Physical","-","100","5","","Power increases when opponent's stats have been raised.","-"),
	PURSUIT("Pursuit","DARK","Physical","40","100","20","","Double power if the opponent is switching out.","-"),
	QUASH("Quash","DARK","Status","-","100","15","TM60","Makes the target act last this turn.","-"),
	QUICK_ATTACK("Quick Attack","NORMAL","Physical","40","100","30","","User attacks first.","-"),
	QUICK_GUARD("Quick Guard","FIGHTING","Status","-","-","15","","Fast moves won't damage the user or its teammates.","-"),
	QUIVER_DANCE("Quiver Dance","BUG","Status","-","-","20","","Raises user's Special Attack, Special Defense and Speed.","-"),
	RAGE("Rage","NORMAL","Physical","20","100","20","","Raises user's Attack when hit.","-"),
	RAGE_POWDER("Rage Powder","BUG","Status","-","-","20","","Forces attacks to hit user, not team-mates.","-"),
	RAIN_DANCE("Rain Dance","WATER","Status","-","-","5","TM18","Makes it rain for 5 turns.","-"),
	RAPID_SPIN("Rapid Spin","NORMAL","Physical","20","100","40","","Removes effects of trap moves.","-"),
	RAZOR_LEAF("Razor Leaf","GRASS","Physical","55","95","25","","High critical hit ratio.","-"),
	RAZOR_SHELL("Razor Shell","WATER","Physical","75","95","10","","May lower opponent's Defense.","50"),
	RAZOR_WIND("Razor Wind","NORMAL","Special","80","100","10","","Charges on first turn, attacks on second. High critical hit ratio.","-"),
	RECOVER("Recover","NORMAL","Status","-","-","10","","User recovers half its max HP.","-"),
	RECYCLE("Recycle","NORMAL","Status","-","-","10","","User's used hold item is restored.","-"),
	REFLECT("Reflect","PSYCHIC","Status","-","-","20","TM33","Halves damage from Physical attacks for 5 turns.","-"),
	REFLECT_TYPE("Reflect Type","NORMAL","Status","-","-","15","","User becomes the target's type.","-"),
	REFRESH("Refresh","NORMAL","Status","-","-","20","","Cures paralysis, poison, and burns.","-"),
	RELIC_SONG("Relic Song","NORMAL","Special","75","100","10","","May put the target to sleep.","10"),
	REST("Rest","PSYCHIC","Status","-","-","10","TM44","User sleeps for 2 turns, but user is fully healed.","-"),
	RETALIATE("Retaliate","NORMAL","Physical","70","100","5","TM67","Inflicts double damage if a teammate fainted on the last turn.","-"),
	RETURN("Return","NORMAL","Physical","-","100","20","TM27","Power increases with user's Happiness.","-"),
	REVENGE("Revenge","FIGHTING","Physical","60","100","10","","Power increases if user was hit first.","-"),
	REVERSAL("Reversal","FIGHTING","Physical","-","100","15","","The lower the user's HP, the higher the power.","-"),
	ROAR("Roar","NORMAL","Status","-","-","20","TM05","In battles, the opponent switches. In the wild, the Pokémon runs.","-"),
	ROAR_OF_TIME("Roar of Time","DRAGON","Special","150","90","5","","User must recharge next turn.","-"),
	ROCK_BLAST("Rock Blast","ROCK","Physical","25","90","10","","Hits 2-5 times in one turn.","-"),
	ROCK_CLIMB("Rock Climb","NORMAL","Physical","90","85","20","","May confuse opponent.","20"),
	ROCK_POLISH("Rock Polish","ROCK","Status","-","-","20","TM69","Sharply raises user's Speed.","-"),
	ROCK_SLIDE("Rock Slide","ROCK","Physical","75","90","10","TM80","May cause flinching.","30"),
	ROCK_SMASH("Rock Smash","FIGHTING","Physical","40","100","15","HM06","May lower opponent's Defense.","50"),
	ROCK_THROW("Rock Throw","ROCK","Physical","50","90","15","","","-"),
	ROCK_TOMB("Rock Tomb","ROCK","Physical","60","95","15","TM39","Lowers opponent's Speed.","100"),
	ROCK_WRECKER("Rock Wrecker","ROCK","Physical","150","90","5","","User must recharge next turn.","-"),
	ROLE_PLAY("Role Play","PSYCHIC","Status","-","-","15","","User copies the opponent's Ability.","-"),
	ROLLING_KICK("Rolling Kick","FIGHTING","Physical","60","85","15","","May cause flinching.","30"),
	ROLLOUT("Rollout","ROCK","Physical","30","90","20","","Doubles in power each turn for 5 turns.","-"),
	ROOST("Roost","FLYING","Status","-","-","10","TM19","User recovers half of its max HP and loses the Flying type temporarily.","-"),
	ROTOTILLER("Rototiller","GROUND","Status","-","-","10","","Raises Attack and Special Attack of Grass-types.","-"),
	ROUND("Round","NORMAL","Special","60","100","15","TM48","Power increases if teammates use it in the same turn.","-"),
	SACRED_FIRE("Sacred Fire","FIRE","Physical","100","95","5","","May burn opponent.","50"),
	SACRED_SWORD("Sacred Sword","FIGHTING","Physical","90","100","20","","Ignores opponent's stat changes.","-"),
	SAFEGUARD("Safeguard","NORMAL","Status","-","-","25","TM20","The user's party is protected from status conditions.","-"),
	SAND_ATTACK("Sand Attack","GROUND","Status","-","100","15","","Lowers opponent's Accuracy.","-"),
	SAND_TOMB("Sand Tomb","GROUND","Physical","35","85","15","","Traps opponent, damaging them for 4-5 turns.","-"),
	SANDSTORM("Sandstorm","ROCK","Status","-","-","10","TM37","Creates a sandstorm for 5 turns.","-"),
	SCALD("Scald","WATER","Special","80","100","15","TM55","May burn opponent.","30"),
	SCARY_FACE("Scary Face","NORMAL","Status","-","100","10","","Sharply lowers opponent's Speed.","-"),
	SCRATCH("Scratch","NORMAL","Physical","40","100","35","","","-"),
	SCREECH("Screech","NORMAL","Status","-","85","40","","Sharply lowers opponent's Defense.","-"),
	SEARING_SHOT("Searing Shot","FIRE","Special","100","100","5","","May burn opponent.","30"),
	SECRET_POWER("Secret Power","NORMAL","Physical","70","100","20","TM94","Effects of the attack vary with the location.","30"),
	SECRET_SWORD("Secret Sword","FIGHTING","Special","85","100","10","","Inflicts damage based on the target's Defense, not Special Defense.","-"),
	SEED_BOMB("Seed Bomb","GRASS","Physical","80","100","15","","","-"),
	SEED_FLARE("Seed Flare","GRASS","Special","120","85","5","","May lower opponent's Special Defense.","40"),
	SEISMIC_TOSS("Seismic Toss","FIGHTING","Physical","-","100","20","","Inflicts damage equal to user's level.","-"),
	SELF_DESTRUCT("Self-Destruct","NORMAL","Physical","200","100","5","","User faints.","-"),
	SHADOW_BALL("Shadow Ball","GHOST","Special","80","100","15","TM30","May lower opponent's Special Defense.","20"),
	SHADOW_CLAW("Shadow Claw","GHOST","Physical","70","100","15","TM65","High critical hit ratio.","-"),
	SHADOW_FORCE("Shadow Force","GHOST","Physical","120","100","5","","Disappears on first turn, attacks on second. Can strike through Protect/Detect.","-"),
	SHADOW_PUNCH("Shadow Punch","GHOST","Physical","60","∞","20","","Ignores Accuracy and Evasiveness.","-"),
	SHADOW_SNEAK("Shadow Sneak","GHOST","Physical","40","100","30","","User attacks first.","-"),
	SHARPEN("Sharpen","NORMAL","Status","-","-","30","","Raises user's Attack.","-"),
	SHEER_COLD("Sheer Cold","ICE","Special","-","-","5","","One-Hit-KO, if it hits.","-"),
	SHELL_SMASH("Shell Smash","NORMAL","Status","-","-","15","","Sharply raises user's Attack, Special Attack and Speed but lowers Defense and Special Defense.","-"),
	SHIFT_GEAR("Shift Gear","STEEL","Status","-","-","10","","Raises user's Attack and sharply raises Speed.","-"),
	SHOCK_WAVE("Shock Wave","ELECTRIC","Special","60","∞","20","","Ignores Accuracy and Evasiveness.","-"),
	SIGNAL_BEAM("Signal Beam","BUG","Special","75","100","15","","May confuse opponent.","10"),
	SILVER_WIND("Silver Wind","BUG","Special","60","100","5","","May raise all stats of user at once.","10"),
	SIMPLE_BEAM("Simple Beam","NORMAL","Status","-","100","15","","Changes target's ability to Simple.","-"),
	SING("Sing","NORMAL","Status","-","55","15","","Puts opponent to sleep.","100"),
	SKETCH("Sketch","NORMAL","Status","-","-","1","","Permanently copies the opponent's last move.","-"),
	SKILL_SWAP("Skill Swap","PSYCHIC","Status","-","-","10","","The user swaps Abilities with the opponent.","-"),
	SKULL_BASH("Skull Bash","NORMAL","Physical","130","100","10","","Raises Defense on first turn, attacks on second.","100"),
	SKY_ATTACK("Sky Attack","FLYING","Physical","140","90","5","","Charges on first turn, attacks on second. May cause flinching.","30"),
	SKY_DROP("Sky Drop","FLYING","Physical","60","100","10","TM58","Takes opponent into the air on first turn, drops them on second turn.","-"),
	SKY_UPPERCUT("Sky Uppercut","FIGHTING","Physical","85","90","15","","Hits the opponent, even during Fly.","-"),
	SLACK_OFF("Slack Off","NORMAL","Status","-","-","10","","User recovers half its max HP.","-"),
	SLAM("Slam","NORMAL","Physical","80","75","20","","","-"),
	SLASH("Slash","NORMAL","Physical","70","100","20","","High critical hit ratio.","-"),
	SLEEP_POWDER("Sleep Powder","GRASS","Status","-","75","15","","Puts opponent to sleep.","-"),
	SLEEP_TALK("Sleep Talk","NORMAL","Status","-","-","10","TM88","User performs one of its own moves while sleeping.","-"),
	SLUDGE("Sludge","POISON","Special","65","100","20","","May poison opponent.","30"),
	SLUDGE_BOMB("Sludge Bomb","POISON","Special","90","100","10","TM36","May poison opponent.","30"),
	SLUDGE_WAVE("Sludge Wave","POISON","Special","95","100","10","TM34","May poison opponent.","10"),
	SMACK_DOWN("Smack Down","ROCK","Physical","50","100","15","TM23","Makes Flying-type Pokémon vulnerable to Ground moves.","-"),
	SMELLING_SALTS("Smelling Salts","NORMAL","Physical","70","100","10","","Power doubles if opponent is paralyzed, but cures it.","-"),
	SMOG("Smog","POISON","Special","30","70","20","","May poison opponent.","40"),
	SMOKESCREEN("Smokescreen","NORMAL","Status","-","100","20","","Lowers opponent's Accuracy.","-"),
	SNARL("Snarl","DARK","Special","55","95","15","TM95","Lowers opponent's Special Attack.","100"),
	SNATCH("Snatch","DARK","Status","-","-","10","","Steals the effects of the opponent's next move.","-"),
	SNORE("Snore","NORMAL","Special","50","100","15","","Can only be used if asleep. May cause flinching.","30"),
	SOAK("Soak","WATER","Status","-","100","20","","Changes the target's type to water.","-"),
	SOFT_BOILED("Soft-Boiled","NORMAL","Status","-","-","10","","User recovers half its max HP.","-"),
	SOLAR_BEAM("Solar Beam","GRASS","Special","120","100","10","TM22","Charges on first turn, attacks on second.","-"),
	SONIC_BOOM("Sonic Boom","NORMAL","Special","-","90","20","","Always inflicts 20 HP.","-"),
	SPACIAL_REND("Spacial Rend","DRAGON","Special","100","95","5","","High critical hit ratio.","-"),
	SPARK("Spark","ELECTRIC","Physical","65","100","20","","May paralyze opponent.","30"),
	SPIDER_WEB("Spider Web","BUG","Status","-","-","10","","Opponent cannot escape/switch.","-"),
	SPIKE_CANNON("Spike Cannon","NORMAL","Physical","20","100","15","","Hits 2-5 times in one turn.","-"),
	SPIKES("Spikes","GROUND","Status","-","-","20","","Hurts opponents when they switch into battle.","-"),
	SPIKY_SHIELD("Spiky Shield","GRASS","Status","-","-","10","","Protects user and inflicts damage on contact moves.","-"),
	SPIT_UP("Spit Up","NORMAL","Special","-","100","10","","Power depends on how many times the user performed Stockpile.","-"),
	SPITE("Spite","GHOST","Status","-","100","10","","The opponent's last move loses 2-5 PP.","-"),
	SPLASH("Splash","NORMAL","Status","-","-","40","","Doesn't do ANYTHING.","-"),
	SPORE("Spore","GRASS","Status","-","100","15","","Puts opponent to sleep.","100"),
	STEALTH_ROCK("Stealth Rock","ROCK","Status","-","-","20","","Damages opponent switching into battle.","-"),
	STEAM_ERUPTION("Steam Eruption","WATER","Special","110","95","5","","May burn opponent.","30"),
	STEAMROLLER("Steamroller","BUG","Physical","65","100","20","","May cause flinching.","30"),
	STEEL_WING("Steel Wing","STEEL","Physical","70","90","25","TM51","May raise user's Defense.","10"),
	STICKY_WEB("Sticky Web","BUG","Status","-","-","20","","Lowers opponent's Speed when switching into battle.","-"),
	STOCKPILE("Stockpile","NORMAL","Status","-","-","20","","Stores energy for use with Spit Up and Swallow.","-"),
	STOMP("Stomp","NORMAL","Physical","65","100","20","","May cause flinching.","30"),
	STONE_EDGE("Stone Edge","ROCK","Physical","100","80","5","TM71","High critical hit ratio.","-"),
	STORED_POWER("Stored Power","PSYCHIC","Special","20","100","10","","Power increases when user's stats have been raised.","-"),
	STORM_THROW("Storm Throw","FIGHTING","Physical","60","100","10","","Always results in a critical hit.","-"),
	STRENGTH("Strength","NORMAL","Physical","80","100","15","HM04","","-"),
	STRING_SHOT("String Shot","BUG","Status","-","95","40","","Sharply lowers opponent's Speed.","-"),
	STRUGGLE_BUG("Struggle Bug","BUG","Special","50","100","20","TM76","Lowers opponent's Special Attack.","100"),
	STUN_SPORE("Stun Spore","GRASS","Status","-","75","30","","Paralyzes opponent.","-"),
	SUBMISSION("Submission","FIGHTING","Physical","80","80","25","","User receives recoil damage.","-"),
	SUBSTITUTE("Substitute","NORMAL","Status","-","-","10","TM90","Uses HP to creates a decoy that takes hits.","-"),
	SUCKER_PUNCH("Sucker Punch","DARK","Physical","80","100","5","","User attacks first, but only works if opponent is readying an attack.","-"),
	SUNNY_DAY("Sunny Day","FIRE","Status","-","-","5","TM11","Makes it sunny for 5 turns.","-"),
	SUPER_FANG("Super Fang","NORMAL","Physical","-","90","10","","Always takes off half of the opponent's HP.","-"),
	SUPERPOWER("Superpower","FIGHTING","Physical","120","100","5","","Lowers user's Attack and Defense.","-"),
	SUPERSONIC("Supersonic","NORMAL","Status","-","55","20","","Confuses opponent.","-"),
	SURF("Surf","WATER","Special","90","100","15","HM03","Hits all adjacent Pokémon.","-"),
	SWAGGER("Swagger","NORMAL","Status","-","90","15","TM87","Opponent becomes confused, but its Attack is raised two stages.","-"),
	SWALLOW("Swallow","NORMAL","Status","-","-","10","","The more times the user has performed Stockpile, the more HP is recovered.","-"),
	SWEET_KISS("Sweet Kiss","FAIRY","Status","-","75","10","","Confuses opponent.","-"),
	SWEET_SCENT("Sweet Scent","NORMAL","Status","-","-","20","","Lowers opponent's Evasiveness.","-"),
	SWIFT("Swift","NORMAL","Special","60","∞","20","","Ignores Accuracy and Evasiveness.","-"),
	SWITCHEROO("Switcheroo","DARK","Status","-","100","15","","Swaps held items with the opponent.","-"),
	SWORDS_DANCE("Swords Dance","NORMAL","Status","-","-","20","TM75","Sharply raises user's Attack.","-"),
	SYNCHRONOISE("Synchronoise","PSYCHIC","Special","120","100","15","","Hits any Pokémon that shares a type with the user.","-"),
	SYNTHESIS("Synthesis","GRASS","Status","-","-","5","","User recovers HP. Amount varies with the weather.","-"),
	TACKLE("Tackle","NORMAL","Physical","50","100","35","","","-"),
	TAIL_GLOW("Tail Glow","BUG","Status","-","-","20","","Drastically raises user's Special Attack.","-"),
	TAIL_SLAP("Tail Slap","NORMAL","Physical","25","85","10","","Hits 2-5 times in one turn.","-"),
	TAIL_WHIP("Tail Whip","NORMAL","Status","-","100","30","","Lowers opponent's Defense.","-"),
	TAILWIND("Tailwind","FLYING","Status","-","-","30","","Doubles Speed for 4 turns.","-"),
	TAKE_DOWN("Take Down","NORMAL","Physical","90","85","20","","User receives recoil damage.","-"),
	TAUNT("Taunt","DARK","Status","-","100","20","TM12","Opponent can only use moves that attack.","-"),
	TECHNO_BLAST("Techno Blast","NORMAL","Special","85","100","5","","Type depends on the Drive being held.","-"),
	TEETER_DANCE("Teeter Dance","NORMAL","Status","-","100","20","","Confuses all Pokémon.","-"),
	TELEKINESIS("Telekinesis","PSYCHIC","Status","-","-","15","","Ignores opponent's Evasiveness for three turns, add Ground immunity.","-"),
	TELEPORT("Teleport","PSYCHIC","Status","-","-","20","","Allows user to flee wild battles; also warps player to last PokéCenter.","-"),
	THIEF("Thief","DARK","Physical","60","100","25","TM46","Also steals opponent's held item.","-"),
	THOUSAND_ARROWS("Thousand Arrows","GROUND","Physical","90","100","10","","Makes Flying-type Pokémon vulnerable to Ground moves.","-"),
	THOUSAND_WAVES("Thousand Waves","GROUND","Physical","90","100","10","","Opponent cannot flee or switch.","-"),
	THRASH("Thrash","NORMAL","Physical","120","100","10","","User attacks for 2-3 turns but then becomes confused.","-"),
	THUNDER("Thunder","ELECTRIC","Special","110","70","10","TM25","May paralyze opponent.","30"),
	THUNDER_FANG("Thunder Fang","ELECTRIC","Physical","65","95","15","","May cause flinching and/or paralyze opponent.","10"),
	THUNDER_PUNCH("Thunder Punch","ELECTRIC","Physical","75","100","15","","May paralyze opponent.","10"),
	THUNDER_SHOCK("Thunder Shock","ELECTRIC","Special","40","100","30","","May paralyze opponent.","10"),
	THUNDER_WAVE("Thunder Wave","ELECTRIC","Status","-","100","20","TM73","Paralyzes opponent.","100"),
	THUNDERBOLT("Thunderbolt","ELECTRIC","Special","90","100","15","TM24","May paralyze opponent.","10"),
	TICKLE("Tickle","NORMAL","Status","-","100","20","","Lowers opponent's Attack and Defense.","-"),
	TOPSY_TURVY("Topsy-Turvy","DARK","Status","-","100","20","","Reverses stat changes of opponent.","-"),
	TORMENT("Torment","DARK","Status","-","100","15","TM41","Opponent cannot use the same move in a row.","-"),
	TOXIC("Toxic","POISON","Status","-","90","10","TM06","Badly poisons opponent.","-"),
	TOXIC_SPIKES("Toxic Spikes","POISON","Status","-","-","20","","Poisons opponents when they switch into battle.","-"),
	TRANSFORM("Transform","NORMAL","Status","-","-","10","","User takes on the form and attacks of the opponent.","-"),
	TRI_ATTACK("Tri Attack","NORMAL","Special","80","100","10","","May paralyze, burn or freeze opponent.","20"),
	TRICK("Trick","PSYCHIC","Status","-","100","10","","Swaps held items with the opponent.","-"),
	TRICK_ROOM("Trick Room","PSYCHIC","Status","-","-","5","TM92","Slower Pokémon move first in the turn for 5 turns.","-"),
	TRICK_OR_TREAT("Trick-or-Treat","GHOST","Status","-","100","20","","Adds Ghost type to opponent.","-"),
	TRIPLE_KICK("Triple Kick","FIGHTING","Physical","10","90","10","","Hits thrice in one turn at increasing power.","-"),
	TRUMP_CARD("Trump Card","NORMAL","Special","-","∞","5","","The lower the PP, the higher the power.","-"),
	TWINEEDLE("Twineedle","BUG","Physical","25","100","20","","Hits twice in one turn. May poison opponent.","20"),
	TWISTER("Twister","DRAGON","Special","40","100","20","","May cause flinching. Hits Pokémon using Fly/Bounce with double power.","20"),
	U_TURN("U-turn","BUG","Physical","70","100","20","TM89","User switches out immediately after attacking.","-"),
	UPROAR("Uproar","NORMAL","Special","90","100","10","","User attacks for 3 turns and prevents sleep.","-"),
	V_CREATE("V-create","FIRE","Physical","180","95","5","","Lowers user's Defense, Special Defense and Speed.","100"),
	VACUUM_WAVE("Vacuum Wave","FIGHTING","Special","40","100","30","","User attacks first.","-"),
	VENOM_DRENCH("Venom Drench","POISON","Status","-","100","20","","Lowers poisoned opponent's Special Attack and Speed.","-"),
	VENOSHOCK("Venoshock","POISON","Special","65","100","10","TM09","Inflicts double damage if the target is poisoned.","-"),
	VICE_GRIP("Vice Grip","NORMAL","Physical","55","100","30","","","-"),
	VINE_WHIP("Vine Whip","GRASS","Physical","45","100","25","","","-"),
	VITAL_THROW("Vital Throw","FIGHTING","Physical","70","∞","10","","User attacks last, but ignores Accuracy and Evasiveness.","-"),
	VOLT_SWITCH("Volt Switch","ELECTRIC","Special","70","100","20","TM72","User must switch out after attacking.","-"),
	VOLT_TACKLE("Volt Tackle","ELECTRIC","Physical","120","100","15","","User receives recoil damage. May paralyze opponent.","10"),
	WAKE_UP_SLAP("Wake-Up Slap","FIGHTING","Physical","70","100","10","","Power doubles if opponent is asleep, but wakes it up.","-"),
	WATER_GUN("Water Gun","WATER","Special","40","100","25","","","-"),
	WATER_PLEDGE("Water Pledge","WATER","Special","80","100","10","","Added effects appear if preceded by Fire Pledge or succeeded by Grass Pledge.","-"),
	WATER_PULSE("Water Pulse","WATER","Special","60","100","20","","May confuse opponent.","20"),
	WATER_SHURIKEN("Water Shuriken","WATER","Physical","15","100","10","","Hits 2-5 times in one turn.","-"),
	WATER_SPORT("Water Sport","WATER","Status","-","-","15","","Weakens the power of Fire-type moves.","-"),
	WATER_SPOUT("Water Spout","WATER","Special","150","100","5","","The higher the user's HP, the higher the damage caused.","-"),
	WATERFALL("Waterfall","WATER","Physical","80","100","15","HM05","May cause flinching.","20"),
	WEATHER_BALL("Weather Ball","NORMAL","Special","50","100","10","","Move's power and type changes with the weather.","-"),
	WHIRLPOOL("Whirlpool","WATER","Special","35","85","15","","Traps opponent, damaging them for 4-5 turns.","-"),
	WHIRLWIND("Whirlwind","NORMAL","Status","-","-","20","","In battles, the opponent switches. In the wild, the Pokémon runs.","-"),
	WIDE_GUARD("Wide Guard","ROCK","Status","-","-","10","","Protects the user's team from multi-target attacks.","-"),
	WILD_CHARGE("Wild Charge","ELECTRIC","Physical","90","100","15","TM93","User receives recoil damage.","-"),
	WILL_O_WISP("Will-O-Wisp","FIRE","Status","-","85","15","TM61","Burns opponent.","100"),
	WING_ATTACK("Wing Attack","FLYING","Physical","60","100","35","","","-"),
	WISH("Wish","NORMAL","Status","-","-","10","","The user recovers HP in the following turn.","-"),
	WITHDRAW("Withdraw","WATER","Status","-","-","40","","Raises user's Defense.","-"),
	WONDER_ROOM("Wonder Room","PSYCHIC","Status","-","-","10","","Swaps every Pokémon's Defense and Special Defense for 5 turns.","-"),
	WOOD_HAMMER("Wood Hammer","GRASS","Physical","120","100","15","","User receives recoil damage.","-"),
	WORK_UP("Work Up","NORMAL","Status","-","-","30","","Raises user's Attack and Special Attack.","-"),
	WORRY_SEED("Worry Seed","GRASS","Status","-","100","10","","Changes the opponent's Ability to Insomnia.","-"),
	WRAP("Wrap","NORMAL","Physical","15","90","20","","Traps opponent, damaging them for 4-5 turns.","-"),
	WRING_OUT("Wring Out","NORMAL","Special","-","100","5","","The higher the opponent's HP, the higher the damage.","-"),
	X_SCISSOR("X-Scissor","BUG","Physical","80","100","15","TM81","","-"),
	YAWN("Yawn","NORMAL","Status","-","-","10","","Puts opponent to sleep in the next turn.","-"),
	ZAP_CANNON("Zap Cannon","ELECTRIC","Special","120","50","5","","Paralyzes opponent.","100"),
	ZEN_HEADBUTT("Zen Headbutt","PSYCHIC","Physical","80","90","15","","May cause flinching.","20");

	private String name;
	private MoveType type;
	private MoveCategory category;
	private String power;
	private String acc;
	private String pp;
	private String tm;
	private String effect;
	private String prob;

	/*
	private Move(String name, MoveType type, MoveCategory category, int power, int acc, int pp, String tm,
			String effect, int prob) {
		this.name = name;
		this.type = type;
		this.category = category;
		this.power = power;
		this.acc = acc;
		this.pp = pp;
		this.tm = tm;
		this.effect = effect;
		this.prob = prob;
	}

	private Move (String name, String type, String category, String power, String acc, String pp, String tm, String effect, String prob){
		this.name = name;
		this.type = MoveType.valueOf(type);
		this.category = MoveCategory.valueOf(category);
		if(power.equals("-")){
			this.power = 0;
		}
		else{
			this.power = Integer.parseInt(power);
		}
		if(acc.equals("-") || acc.equals("∞")){
			this.acc = 100;
		}
		else{
			this.acc = Integer.parseInt(acc);
		}
		this.pp = Integer.parseInt(pp); //Struggle 1000
		this.tm = tm;
		this.effect = effect;
		if(prob.equals("-")){
			this.prob = 100;
		}
		else{
			this.prob = Integer.parseInt(prob);
		}
	}
*/
	private MoveEnum(String name, String type, String category, String power, String acc, String pp, String tm,
			String effect, String prob) {
		this.name = name;
		this.type = MoveType.valueOf(type);
		this.category = MoveCategory.valueOf(category);
		this.power = power;
		this.acc = acc;
		this.pp = pp;
		this.tm = tm;
		this.effect = effect;
		this.prob = prob;
	}
	

	public static void main(String[] args) {
		for(MoveEnum move: MoveEnum.values()){
		}
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


	public String getEffect() {
		return effect;
	}


	public void setEffect(String effect) {
		this.effect = effect;
	}


	public String getProb() {
		return prob;
	}


	public void setProb(String prob) {
		this.prob = prob;
	}
	
	public int getId(){
		return this.ordinal();
	}


}
