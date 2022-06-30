package com.example.registration;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.registration.entity.User;
import com.example.registration.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)


public class UserRepositoryTest {

	@Autowired private UserRepository repo;
	
	@Test
	public void testAddNew() {
		User user = new User();
		user.setEmailid("suniljain@gmail.com");
		user.setFirstname("sunil");
		user.setLastname("pandya");
		user.setPassword("sunil123");
		user.setConfirmpassword("sunil123");
		user.setPhonenumber("2136546744");
		
		User savedUser = repo.save(user);
		Assertions.assertThat(savedUser).isNotNull();
		Assertions.assertThat(savedUser.getId()).isGreaterThan(0);			
	}
	
	@Test
	public void testListAll() {
		Iterable<User> users = repo.findAll();
		Assertions.assertThat(users).hasSizeGreaterThan(0);
		for (User user : users) {
			System.out.println(user);
			
		}
	
	}
	@Test
	public void testUpdate() {
		Integer userId = 2;
		Optional<User> optionalUser = repo.findById(userId);
		User user = optionalUser.get();
		user.setConfirmpassword("rahul123");
		repo.save(user);
		
		User updatedUser = repo.findById(userId).get();
		Assertions.assertThat(updatedUser.getConfirmpassword()).isEqualTo("rahul123");
	}
	@Test
	public void testGet() {
		Integer userId = 5;
		Optional<User> optionalUser =repo.findById(userId);
		Assertions.assertThat(optionalUser.get());
	}
	@Test
	public void TestDelete() {
		Integer userId=15;
		repo.deleteById(userId);
		
		Optional<User> optionalUser =repo.findById(userId);
		Assertions.assertThat(optionalUser).isNotPresent();
	}
	
}
