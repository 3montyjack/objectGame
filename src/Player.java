

public class Player {
	
	Health pHealth = new Health();
	
	public boolean pDeath() {
		if (pHealth.getHealth() < 0) {
			return true;
		} else {
			return false;
		}	
	}
	public void damage(int ammount) {
		pHealth.damage(ammount);
	}
	
}
