package com.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.ResourceNotFoundException;
import com.model.User;

@RestController
public class UserController {
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id) 
			throws ResourceNotFoundException
	{
		Map<Integer,User> map=new HashMap<>();
		map.put(1, new User(1,"Peter"));
		map.put(2,new User(2,"Sam"));
		
		if(!map.containsKey(id))
		{
			throw new ResourceNotFoundException("Resourse not found for userid"+id);
		}
		else
		{
			return ResponseEntity.ok(map.get(id));
		}
	}

}
