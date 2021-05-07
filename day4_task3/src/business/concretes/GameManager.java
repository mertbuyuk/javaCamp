package business.concretes;

import business.abstracts.GameService;
import day4_task3.entities.concretes.Game;
import day4_task3.entities.concretes.Gamer;

public class GameManager implements GameService {

	@Override
	public void boughtBy(Game game,Gamer gamer) {
		if(gamer.getId() == 100) {
			game.setPrice(game.getPrice()/10);
			System.out.println("You are 100th customer. Congrulations! : " + gamer.getName() + "Campain price " + game.getPrice());
			
		}
		System.out.println(game.getName() +" bought by : " + gamer.getName() + " Price  " + game.getPrice());
		game.setPrice(game.getPrice()*10);
		
	}

	@Override
	public void newCampain(Game game) {
		game.setPrice(game.getPrice()/10);
		System.out.print("New price for the weekend " + game.getPrice());
		
	}

}
