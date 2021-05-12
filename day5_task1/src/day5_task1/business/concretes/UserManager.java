package day5_task1.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5_task1.business.abstracts.UserInfosCheckService;
import day5_task1.business.concretes.logType.abstracts.LogTypeService;
import day5_task1.business.concretes.logType.concretes.WithEmail;
import day5_task1.dataAcces.abstracts.UserDao;
import day5_task1.entities.concretes.User;

public class UserManager implements UserInfosCheckService{
	
	private UserDao userDao;
	private User user;
	private LogTypeService logTypeService;
	private Boolean canLog = false;
	
	
	
	

	public UserManager(UserDao userDao, User user, LogTypeService logTypeService) {
		this.userDao = userDao;
		this.user = user;
		this.logTypeService = logTypeService;
	}

	@Override
	public boolean checkLength() {
		if(user.getName().length()>2 && user.getSurname().length() >2 && user.getPassword().length()>6) {
			return true;
		}
		else {
			System.out.println("Check Lengths");
			return false;
					
		}
		
	}

	@Override
	public boolean isTrueFormat() {
		String regex = "^(.+)@(.+)$" ;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getMail());
		if(matcher.matches()) {
			return true;
		}
		System.out.println("Check email format");
		return false;
	}

	@Override
	public boolean isAlreadyExist(List<String> db) {
		for(String s : db) {
			if(s == userDao.getUserMail(user)) {
				System.out.println("Bu email adresi kayýtlý");
				return false;
			}
		}
		return true;
		
		
	}

	@Override
	public void addToDb(List<String> db) {
		if(isTrueFormat() && checkLength() && isAlreadyExist(db)) {
			db.add(user.getMail());
			System.out.print("Kayýt olundu");
			canLog = true;
			
			
		}
		
	}

	@Override
	public void login() {
		if(canLog) {
			logTypeService.logType();
		}
		
	}
	
	

}
