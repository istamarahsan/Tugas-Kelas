
public class Character {
	private String name;
	private CharacterClass characterClass;
	private Weapon weapon;
	private Armor armor;
	
	public Character(String name, CharacterClass characterClass, Weapon weapon, Armor armor) {
		super();
		this.name = name;
		this.characterClass = characterClass;
		this.weapon = weapon;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CharacterClass getCharClass() {
		return characterClass;
	}

	public void setCharClass(CharacterClass charClass) {
		this.characterClass = charClass;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public WeaponType getWeaponType() {
		return weapon.type;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public ArmorType getArmorType() {
		return armor.type;
	}
}
