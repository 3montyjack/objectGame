package attackEng;

public class Energy {

	int energy;
	int DefaultEnergyGainPerTurn;
	
	public Energy() {
		energy = 100;
	}
	
	public Energy(int initialValue) {
		energy = initialValue;
	}
	
	int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int ammount) {
		energy = ammount;
	}
	
	public void useEnergy(int ammount) {
		energy = energy - ammount;
	}
	
	public void gainEnergy(int ammount) {
		energy = energy + ammount;
	}
	
	//DefaultEnergyGainPerTurn
	public void setDEGPT(int defaultNum) {
		DefaultEnergyGainPerTurn = defaultNum;
	}
	
	private int getDEGPT() {
		return DefaultEnergyGainPerTurn;
	}
	
	public void energyTurn() {
		energy = energy + getDEGPT();
	}
}
