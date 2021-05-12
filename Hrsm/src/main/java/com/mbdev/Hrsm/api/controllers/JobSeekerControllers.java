package com.mbdev.Hrsm.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbdev.Hrsm.business.abstracts.JobSeekerService;
import com.mbdev.Hrsm.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerControllers {
	
	@Autowired
	private JobSeekerService jobSeekerService;
	
	@PostMapping("/add")
	public void add(@RequestBody Jobseeker jobseeker) {
		jobSeekerService.addJobseeker(jobseeker);
	}
	
	@PostMapping("/delete")
	public void delete(@PathVariable("id") int  id) {
		jobSeekerService.deleteJobseeker(id);
	}
	
	@GetMapping("/getByid")
	public Jobseeker getByid(@PathVariable("id") int id) {
		return this.jobSeekerService.getByid(id);
	}
	@GetMapping("/getAll")
	public List<Jobseeker> getAll(){
		return this.jobSeekerService.getAllJobseeker();
	}
	
	
	
	
}
