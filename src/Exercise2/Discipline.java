package Exercise2;

public class Discipline implements OlympicTeams{
	
	
	//die konkreten Teams
	
	private String name;
	private int numberAthletes;
	private int numberMedals;
	
	
	
	Discipline(String name, int numberAthletes, int numberMedals) {
		this.name = name;
		this.numberAthletes = numberAthletes;
		this.numberMedals = numberMedals;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public void getNumberAthletes() {
		System.out.println("Team: "+ this.getName() + ", Number of Athletes: " + this.numberAthletes);
	}
	
	
	public void setNumberAthletes(int numberAthletes) {
		this.numberAthletes = numberAthletes;
	}

	


	public void getNumberMedals() {
		System.out.println("Team: " + this.getName() + ", Number of Gold Medals: " + numberMedals);
	}


	public void setNumberMedals(int numberMedals) {
		this.numberMedals = numberMedals;
	}

}
