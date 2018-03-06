package com.arca.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arca.app.models.entity.User;
import com.arca.app.services.ILoginService;

@CrossOrigin(origins = {"http://localhost:8100"} )
@RestController
@RequestMapping("/api")
public class LoginRestController {

	@Autowired
	private ILoginService loginService;
	
	@GetMapping("/login/{userName}/{password}")
	public ResponseEntity<User> show(@PathVariable String userName, @PathVariable String password ) {
		User userLoged = loginService.findByUserNameAndPassword(userName, password);
		if(userLoged == null) {
			return new ResponseEntity<User>(userLoged, HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<User>(userLoged, HttpStatus.OK);
	}
	
}
