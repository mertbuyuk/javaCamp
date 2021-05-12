package day5_task1.business.concretes.logType.concretes;

import day5_task1.business.concretes.logType.abstracts.LogTypeService;

public class WithEmail implements LogTypeService {

	@Override
	public void logType() {
		System.out.println("Email ile giriþ saðlandý");
		
	}

}
