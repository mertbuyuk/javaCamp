package business.concretes;


import business.abstracts.GameService;
import business.abstracts.GamerCheckService;
import business.abstracts.GamerService;
import day4_task3.entities.concretes.Gamer;

public class GamerManager implements GamerService{
	private GamerCheckService gamerCheck;


	public GamerManager(GamerCheckService gamerCheck) {
		this.gamerCheck = gamerCheck;
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("updated account : " + gamer.getName() + " " + gamer.getSurname());
		
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println("Deleted account : " + gamer.getName() + " " + gamer.getSurname());
		
	}

	@Override
	public void register(Gamer gamer) {
		if(gamerCheck.save(gamer)) {
			System.out.println("Gamer found : " + gamer.getName());
		}
		else {
			System.out.println("Gamer not found");
		}
		
	}

	

}
