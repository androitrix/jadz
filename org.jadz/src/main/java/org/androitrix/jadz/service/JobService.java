package org.androidtrix.jadz.service;

import java.util.List;

import org.androitrix.jadz.model.Job;

public interface JobService {

   public Job getJobById(Long id);
   
   public List<Job> getJobsForCustomerName(String name);
   
}
