package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
