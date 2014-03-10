package attackEng;

import java.util.Random;

public class Zomble extends Mob {
	
	Random rand = new Random();
	Player player;
	private int weapon = 0;
	
	public Zomble(Player inputs) {
		player = inputs;
	}
	
	public void attack() {
		makeMove();
	}
	
	@SuppressWarnings("unused")
	private int checkPHealth() {
		return player.getHealth();
	}

	void makeMove()
	{
		if  (checkHealth() <= 10) 
		{
			largePotion();
		} else {
			
			switch (rand.nextInt(30)) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				player.slash(2);
				weapon = 2;
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				player.slash(1);
				weapon = 1;
				break;
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
				player.slash(2);
				weapon = 2;
				break;
			case 30:
				player.slash(10);
				weapon = 10;
				break;
			default:
				player.slash(2);
				weapon = 2;
				break;
				
			}
			
		}
	}

	@SuppressWarnings("unused")
	private void checkEnergy() {
		// TODO Make energy checks
			
	}
	
	public int getWeapon() {
		return weapon;
	}

	private int checkHealth() {
		return getHealth();
	}
	
	
}


