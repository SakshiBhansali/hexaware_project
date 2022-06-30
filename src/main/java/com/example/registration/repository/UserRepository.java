package com.example.registration.repository;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.User;
@Repository
@Transactional
public interface UserRepository extends CrudRepository<User,Integer>  {

	

	
}
