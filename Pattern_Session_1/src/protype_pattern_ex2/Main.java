package protype_pattern_ex2;

public class Main {
	public static void main(String[] args) {
		MonsterRegistry reg = new MonsterRegistry();
		reg.registerMonster(new GenericMonster(10, 10, 10, 10, 10));
		Monster mySpecialMonster = reg.findMonster("Generic Monster").clone();
		mySpecialMonster.setHP(100);
		mySpecialMonster.setType("Bolum sonu canavarý");
		reg.registerMonster(mySpecialMonster);
	}
}
