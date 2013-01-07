package org.androidtrix.jadz.dao;

import org.androitrix.jadz.model.Job;

public interface JobDAO {
   
   public void save(Job job);
   
   public Job getById(Long id);

}
