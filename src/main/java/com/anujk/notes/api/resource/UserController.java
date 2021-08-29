package com.anujk.notes.api.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.anujk.notes.api.model.User;
import com.anujk.notes.api.respository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		repository.save(user);
		return "User added Successfully" + user.getId();
	}
	
	@RequestMapping("/getUser")
	public String getUser(@RequestBody User user) {
		
		return repository.findUserByUsernameAndPassword(user.getUsername(),user.getPassword()).getId();
		
	}
}
