package com.mbdev.Hrsm.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbdev.Hrsm.business.abstracts.JobSeekerService;
import com.mbdev.Hrsm.dataAcces.abstracts.JobseekerDao;
import com.mbdev.Hrsm.entities.concretes.Jobseeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	@Autowired
	private JobseekerDao jobSeekerDao;//jpareposundan methodlara ulaşmak için bu sınıfı consta autowiredliyoruz
	//bu şekilde implement edince artık tüm jparepository methodlarına ulaşabilriz

	@Override
	public void addJobseeker(Jobseeker jobseeker) {
		this.jobSeekerDao.save(jobseeker);
		
	}

	@Override
	public void deleteJobseeker(int  id) {
		this.jobSeekerDao.deleteById(id);
	}

	@Override
	public void updateJobseeker(Jobseeker jobseeker) {
		this.jobSeekerDao.save(jobseeker);
	}

	@Override
	public List<Jobseeker> getAllJobseeker() {
		
		return this.jobSeekerDao.findAll() ;
	}

	@Override
	public Jobseeker getByid(int id) {
		// TODO Auto-generated method stub
		return this.jobSeekerDao.getOne(id);
	}
	


}
