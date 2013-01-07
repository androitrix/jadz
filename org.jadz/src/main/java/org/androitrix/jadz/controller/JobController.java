package org.androidtrix.jadz.controller;

import org.androidtrix.jadz.service.JobService;
import org.androitrix.jadz.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/job")
public class JobController {

   private JobService jobService;
   
   @RequestMapping(value="/{id}", method = RequestMethod.GET)
   public @ResponseBody Job getJob(@PathVariable("id") Long id) {

       return UserAdapter.convert(userService.getUser(id));
   }
}
