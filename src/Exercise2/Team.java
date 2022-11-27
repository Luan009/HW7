package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Team implements OlympicTeams{
	
	//Composite, die "Oberteams"
	
	
	private String name;
	
	
	List <OlympicTeams> Teams = new ArrayList<OlympicTeams>();		//enthält Unterteams
	
	
	
	Team(String name) {
		this.name = name;
		
	}
	
	
	public void addTeam(OlympicTeams a) {
		Teams.add(a);
	}
	
	public void removeTeam(OlympicTeams a) {
		Teams.remove(a);
	}
	
	
	

	
	public String getName() {
		return this.name;
	}


	
	public void getNumberAthletes() {
		System.out.println("Number of Athletes of " + this.getName());

		for (OlympicTeams sub : Teams){
			sub.getNumberAthletes();
		}
		
		
	}


	
	public void getNumberMedals() {
		System.out.println("Number of Gold Medals of " + this.getName());

		for(OlympicTeams sub: Teams) {
			sub.getNumberMedals();
		}
	}


	
}
