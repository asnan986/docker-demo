package org.dxc.docker.controller;

import org.dxc.docker.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@RequestMapping("/user")
	public User getUser() {
		User user= new User("Asnan M H", "asnanmh986.amh@gmail.com", "1001");
		return user;
		
	}
}
