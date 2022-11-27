package Exercise2;

public class Client {
	
	
	public static void main(String[] args) {
		
				
		Team AllTeams = new Team("All Teams");		//Alle anwesenden Teams
		
		
		Team Asia = new Team("Asia");
		Team Europe = new Team("Europe");
		
		
		
		Team China = new Team("China");
		Team Germany = new Team("Germany");
		
		
		
		Team MenGermany = new Team("Germany-Men");
		Team WomenGermany = new Team("Germany-Women");
		Team MenChina = new Team("China-Men");
		Team WomenChina = new Team("China-Women");
		
		
		Discipline Gymnastics = new Discipline("Women's Artistic Gymnastics",2,1);
		Discipline Teakwondo = new Discipline("Women's Teakwondo",4,1);
		Discipline Waterpolo = new Discipline("Women'sWaterpolo",2,2);
		Discipline Shooting = new Discipline("Men's Shooting", 2,0);
		Discipline Cycling = new Discipline("Women's Cycling",6,1);
		Discipline Tennis = new Discipline("Women's Tennis",2,1);
		Discipline TableTennis = new Discipline("Men's Table Tennis",3,3);
		Discipline Footbal = new Discipline("Men's Footbal",18,2);

		
		
		
		
		Europe.addTeam(Germany);
		
		
		Germany.addTeam(WomenGermany);
		Germany.addTeam(MenGermany);
		
		
		WomenGermany.addTeam(Cycling);
		WomenGermany.addTeam(Tennis);
		MenGermany.addTeam(Footbal);
		MenGermany.addTeam(TableTennis);
		
		
		
		Asia.addTeam(China);
		
		
		China.addTeam(MenChina);
		China.addTeam(WomenChina);
		
		
		MenChina.addTeam(Shooting);
		WomenChina.addTeam(Gymnastics);
		WomenChina.addTeam(Teakwondo);
		WomenChina.addTeam(Waterpolo);
		
		
		
		MenGermany.getNumberAthletes();
		
		MenGermany.getNumberMedals();
		
		Asia.getNumberMedals();
		

		
		
		
		
		
		
		
	}

}
