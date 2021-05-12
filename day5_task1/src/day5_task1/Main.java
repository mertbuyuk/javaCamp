package day5_task1;

import java.util.ArrayList;
import java.util.List;

import day5_task1.business.concretes.UserManager;
import day5_task1.business.concretes.logType.concretes.WithEmail;
import day5_task1.dataAcces.abstracts.UserDao;
import day5_task1.dataAcces.concretes.UserDataAcces;
import day5_task1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("t", "s", "mert_sdsS@gmail.com", "d");
		List<String> db = new ArrayList<>();
		db.add(user.getMail());
		
		User user2 = new User("asdsadsadast", "ssadasda", "mert_s@Sgmail.com", "dsdasdasd");
		UserManager userManager = new UserManager(new UserDataAcces(), user2, new WithEmail());
		
		userManager.checkLength();
		userManager.isTrueFormat();
		userManager.isAlreadyExist(db);
		userManager.addToDb(db);
		
		userManager.login();
	}

}
