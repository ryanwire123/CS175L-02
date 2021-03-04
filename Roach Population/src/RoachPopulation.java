
public class RoachPopulation {
	double population;
	
	public RoachPopulation(int initialPop) {
		population = initialPop;
	}
	public void breed() {
		population = population * 2;
	}
		
	public void spray(double sprayPct) {
		population = population - (population * sprayPct);
		
	}
	public double getRoaches() {
		return population;
	}

	public static void main(String[] args) {
		

	}

}
