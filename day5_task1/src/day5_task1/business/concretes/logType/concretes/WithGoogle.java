package day5_task1.business.concretes.logType.concretes;

import day5_task1.business.concretes.logType.abstracts.LogTypeService;

public class WithGoogle implements LogTypeService {

	@Override
	public void logType() {
		System.out.print("Google ile giriþ saðlandý");
		
	}

}
