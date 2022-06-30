package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>  {

	User findByName(String name);

	void deleteByName(String name);

	

	
}
