package epamTask3;

public class HouseConstructionCost {
	String materialStandard;
	int totalAreaOfTheHouse;
	boolean automatedHome;
	public HouseConstructionCost(String materialStandard,int totalAreaOfTheHouse,boolean automatedHome) {
		this.materialStandard = materialStandard;
		this.totalAreaOfTheHouse = totalAreaOfTheHouse;
		this.automatedHome = automatedHome;
	}
	public int calculatePrice() {
		if(materialStandard.equalsIgnoreCase("standard")) {
			return 1200*totalAreaOfTheHouse;
		}else if(materialStandard.equalsIgnoreCase("above standard")) {
			return 1500*totalAreaOfTheHouse;
		}else if(materialStandard.equalsIgnoreCase("high standard") && automatedHome == false) {
			return 1800*totalAreaOfTheHouse;
		}else {
			return 2500*totalAreaOfTheHouse;
		}
	}
}
