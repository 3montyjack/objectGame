package attackEng;

public class Health {

	private int health;

	public Health(int ammount) {
		setHealth(ammount);
	}

	private void setHealth(int ammount) {
		health = ammount;
	}

	public int getHealth() {
		return health;
	}

	public void addHealth(int ammount) {
		setHealth(getHealth() + ammount);
	}

	public void subtractHealth(int ammount) {
		setHealth(getHealth() - ammount);

		checkBelowZero();
	}

	public void checkBelowZero() {
		if (getHealth() < 0)
			setHealth(0);
	}

	public boolean checkDead() {
		if (getHealth() <= 0)
			return true;
		else
			return false;
	}
}
