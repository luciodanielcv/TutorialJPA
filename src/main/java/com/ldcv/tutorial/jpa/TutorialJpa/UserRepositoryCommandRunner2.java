package com.ldcv.tutorial.jpa.TutorialJpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ldcv.tutorial.jpa.TutorialJpa.entity.User;
import com.ldcv.tutorial.jpa.TutorialJpa.service.UserDAOService;
import com.ldcv.tutorial.jpa.TutorialJpa.service.UserRepository;

@Component
public class UserRepositoryCommandRunner2 implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserRepositoryCommandRunner2.class);
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Employee");
		userRepository.save( user );
		logger.info( "LDCV --- New user is created with Spring JpaRepository: " + user );
		
		Optional<User> userWithId = userRepository.findById( 2L );
		System.out.println("LDCV User with Id 2: " + userWithId );
		
		List<User> users = userRepository.findAll();
		logger.info( "All Users: " + users );
		
		
	}
	
	

}
