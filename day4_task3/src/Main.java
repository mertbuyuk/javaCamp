import adapters.MernisAdapter;
import business.concretes.GameManager;
import business.concretes.GamerManager;
import day4_task3.entities.concretes.Game;
import day4_task3.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(100,"Mert","Büyük","1999","5555");
		
		GamerManager gamerManager = new GamerManager(new MernisAdapter());
		
		gamerManager.register(gamer);
		gamerManager.update(gamer);
		gamerManager.deleteAccount(gamer);
		
		Game game = new Game("CS", 258);
		
		GameManager gameManager = new GameManager();
		gameManager.boughtBy(game, gamer);
		gameManager.newCampain(game);

	}

}
