package com.anujk.notes.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.anujk.notes.api.model.User;

public interface UserRepository extends MongoRepository<User,String> {
	
	@Query("{username : ?0, password : ?1}")
	public User findUserByUsernameAndPassword(String username, String password);
		
}
