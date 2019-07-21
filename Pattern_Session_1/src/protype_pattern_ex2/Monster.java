package protype_pattern_ex2;

public abstract class Monster {
	protected int HP, DEX, AGL, LUCK, CHR;
	protected String type;

	public abstract Monster monster();

	protected Monster(int hp, int dex, int agl, int luck, int chr) {
		HP = hp;
		DEX = dex;
		AGL = agl;
		LUCK = luck;
		CHR = chr;
	}

	public String getType() {
		return type;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getDEX() {
		return DEX;
	}

	public void setDEX(int dEX) {
		DEX = dEX;
	}

	public int getAGL() {
		return AGL;
	}

	public void setAGL(int aGL) {
		AGL = aGL;
	}

	public int getLUCK() {
		return LUCK;
	}

	public void setLUCK(int lUCK) {
		LUCK = lUCK;
	}

	public int getCHR() {
		return CHR;
	}

	public void setCHR(int cHR) {
		CHR = cHR;
	}

	public void setType(String type) {
		this.type = type;
	}
}