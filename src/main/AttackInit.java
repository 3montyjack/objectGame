package main;

public class AttackInit {

	// Health of Mobs
	public static int humanHealth = 100, zombieHealth = 100, alienHealth = 100;

	// Health of Mobs
	public static int humanArmor = 10, zombieArmor = 10, alienArmor = 10;

	// MobList MOBS : Types List 1 = human, 2 = zombie, 3 = alien
	private static int[] mobType = { 1, 2, 3, 1, 1, 3, 3, 3, 2, 2 };

	private static String[] mobName = { "Player", "Me", "Nupe", "Caka",
			"Enemy", "Enemy", "Enemy", "Enemy", "Enemy", "Enemy" };

	public static int mobNumber() {
		if (mobType.length == mobName.length)
			return mobType.length;
		else
			return 0;
	}

	// Items and Inventory
	public static int maxInventory = 10;

	private static String[] itemName = { "Sword", "Sword", "Sword", "Sword",
			"Sword" };

	private static int[] itemType = { 1, 0, 0, 1, 2 };

	private static int[] itemDamage = { 10, 5, 7, 5, 3 };

	private static int[] itemSpecial = { 0, 0, 0, 0, 1 };

	public static int itemNumber() {
		if (itemName.length == itemType.length
				&& itemName.length == itemDamage.length
				&& itemName.length == itemSpecial.length)
			return itemName.length;
		else
			return 0;
	}

	public int setMobType(int slot) {
		return mobType[slot];
	}

	public int getMobType(int slot) {
		return setMobType(slot);
	}

	public String setMobName(int slot) {
		return mobName[slot];
	}

	public String getMobName(int slot) {
		return setMobName(slot);
	}

	// //////////////////////////////////

	public int setItemType(int slot) {
		return itemType[slot];
	}

	public int getItemType(int slot) {
		return setItemType(slot);
	}

	public String setItemName(int slot) {
		return itemName[slot];
	}

	public String getItemName(int slot) {
		return setItemName(slot);
	}

	public int setItemDamage(int slot) {
		return itemDamage[slot];
	}

	public int getItemDamage(int slot) {
		return setItemDamage(slot);
	}

	public int setItemSpecial(int slot) {
		return itemSpecial[slot];
	}

	public int getItemSpecial(int slot) {
		return setItemSpecial(slot);
	}

}
