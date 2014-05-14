package attackEng;

public class AttackEng {

	Player player = new Player();
	Zomble zomble = new Zomble(player);
	
	public int getPHealth() {
		return player.getHealth();
	}
	
	public int getZHealth() {
		return zomble.getHealth();
	}
	
	public void setPHealth(int ammount) {
		player.setHealth(ammount);
	}
	
	public void setZHealth(int ammount) {
		zomble.setHealth(ammount);
	}
	
	public String getPWeapon() {
		return ItemList.getName(player.getWeapon());
	}
	
	public String getZWeapon() {
		return ItemList.getName(zomble.getWeapon());
	}
	
	public String getPAction() {
		return player.getAction();
	}
	
	public String getZAction() {
		return zomble.getAction();
	}
	
	public boolean getPDead() {
		return player.getDead();
	}
	
	public boolean getZDead() {
		return zomble.getDead();
	}
	
	public void zMove() {
		zomble.move();
	}
	
	public void pMove(int value) {
		switch (value) {
		case 1:
			zomble.slash(player.currentSlot());
			break;
		case 2:
			zomble.stab(player.currentSlot());
			break;
		case 3:
			zomble.poke(player.currentSlot());
			break;
		case 4:
			player.smallPotion();
			break;
		case 5:
			player.mediumPotion();
			break;
		case 6:
			player.largePotion();
			break;
		}
	}
	
	public int pCurrentSlot() {
		return player.currentSlot();
	}
}
