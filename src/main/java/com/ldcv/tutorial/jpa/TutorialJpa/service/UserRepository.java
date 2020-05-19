package com.ldcv.tutorial.jpa.TutorialJpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldcv.tutorial.jpa.TutorialJpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}