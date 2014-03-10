package attackEng;

public class Energy {

	int energy;
	
	int getHealth() {
		return energy;
	}
	
	
	void setEnergy(int ammount) {
		energy = ammount;
		
	}
	
	void useEnergy(int ammount) {
		energy = energy - ammount;
	}
	
	void gainEnergy(int ammount) {
		energy = energy + ammount;
	}
}
