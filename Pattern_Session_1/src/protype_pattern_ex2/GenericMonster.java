package protype_pattern_ex2;

import java.util.HashMap;

public class GenericMonster extends Monster {
	public GenericMonster(int hp, int dex, int agl, int luck, int chr) {
		super(hp, dex, agl, luck, chr);
		type = "Generic Monster";
	}

	public Monster clone() {
		return new GenericMonster(HP, DEX, AGL, LUCK, CHR);
	}

	@Override
	public Monster monster() {
		// TODO Auto-generated method stub
		return null;
	}
}
 class MonsterRegistry {
	private HashMap<String, Monster> monsters;

	public MonsterRegistry() {
		monsters = new HashMap<String, Monster>();
	}

	public Monster findMonster(String type) {
		return monsters.get(type);
	}

	public void registerMonster(Monster m) {
		monsters.put(m.getType(), m);
	}
}