package business.abstracts;

import day4_task3.entities.concretes.Game;
import day4_task3.entities.concretes.Gamer;

public interface GameService {
	
	void boughtBy(Game game, Gamer gamer);
	
	void newCampain(Game game) ;
	
	
		
	

}
