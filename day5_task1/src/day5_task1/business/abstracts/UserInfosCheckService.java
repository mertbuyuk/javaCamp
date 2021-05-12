package day5_task1.business.abstracts;

import java.util.List;

import day5_task1.business.concretes.logType.abstracts.LogTypeService;



public interface UserInfosCheckService {
	
	public boolean checkLength();
	
	public boolean isTrueFormat();
	
	public boolean isAlreadyExist(List<String> db);
	
	public void addToDb(List<String> db);
	
	public void login();
	
	
	

}
