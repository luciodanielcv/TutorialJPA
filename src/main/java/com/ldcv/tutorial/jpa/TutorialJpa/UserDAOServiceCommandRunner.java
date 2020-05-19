package com.ldcv.tutorial.jpa.TutorialJpa;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ldcv.tutorial.jpa.TutorialJpa.entity.User;
import com.ldcv.tutorial.jpa.TutorialJpa.service.UserDAOService;

@Component
public class UserDAOServiceCommandRunner implements CommandLineRunner {

	@Autowired
	private UserDAOService userDaoService;
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("LDCV", "Admin");
		long insert = userDaoService.insert( user );
		logger.info( "LDCV --- New user is created: " + user );
		
		
		
	}
	
	

}
