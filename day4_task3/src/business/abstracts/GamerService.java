package business.abstracts;

import day4_task3.entities.concretes.Gamer;

public interface GamerService {
	
	void update(Gamer gamer);
	void deleteAccount(Gamer gamer);
	void register(Gamer gamer);

}
