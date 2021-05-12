package com.mbdev.Hrsm.business.abstracts;

import java.util.List;

import com.mbdev.Hrsm.entities.concretes.Jobseeker;

public interface JobSeekerService {
	public void addJobseeker(Jobseeker jobseeker);
	public void deleteJobseeker(int id);
	public void updateJobseeker(Jobseeker jobseeker);
	public List<Jobseeker> getAllJobseeker();
	public Jobseeker getByid(int id);

}
