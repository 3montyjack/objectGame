package attackEng;

import java.util.Random;

public class Zomble extends Mob {
	
	Random rand = new Random();
	Player player;
	private int weapon = 0;
	private int r;
	
	public Zomble(Player inputs) {
		player = inputs;
		inv = new Inventory(10);
		
	}
	
	public void move() {
		makeMove();
	}
	
	@SuppressWarnings("unused")
	private int checkPHealth() {
		return player.getHealth();
	}

	void makeMove()
	{
		if  (getHealth() <= 10) 
		{
			setAction(2);
			largePotion();
		} else {
			setAction(1);
			r = Math.round(rand.nextInt(30));
			System.out.println(r);
			switch (r) {
			case 1:
				mediumPotion();
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
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				player.slash(1);
				weapon = 1;
				break;
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
				player.slash(2);
				weapon = 2;
				break;
			case 15:
				player.slash(10);
				weapon = 10;
				break;
			default:
				System.out.println("Error in Zomble");
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

	
	public boolean checkOverkill() {
		if (r == 15) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String getAction() {
		//System.out.println("005");
		return action;
	}
	
	public boolean addItem(int item) {
		
		if (inv.add(item)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
}


