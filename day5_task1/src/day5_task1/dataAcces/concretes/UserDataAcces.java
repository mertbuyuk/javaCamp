package day5_task1.dataAcces.concretes;

import day5_task1.dataAcces.abstracts.UserDao;
import day5_task1.entities.concretes.User;

public class UserDataAcces implements UserDao {

	@Override
	public String getUserMail(User user) {
		// TODO Auto-generated method stub
		return user.getMail();
	}

}
