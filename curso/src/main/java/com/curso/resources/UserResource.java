package com.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> encontrarTodos(){
		User u = new User(1L, "Arthur", "arthur@hotmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
