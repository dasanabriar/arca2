package com.arca.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arca.app.models.entity.City;
import com.arca.app.models.entity.User;
import com.arca.app.services.IUserService;

@CrossOrigin(origins = { "http://localhost:8100" })
@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private IUserService userService;

	@GetMapping("/getUser")
	public ResponseEntity<List<User>> getAllUser() {
		return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/getUserByCityAndType")
	public ResponseEntity<List<User>> getUsersByCityAndUserType(@PathVariable City city, @PathVariable int userType ) {
		return new ResponseEntity<List<User>>(userService.findByCityAndUserType(city, userType), HttpStatus.OK);
	}
	
	@GetMapping("/getUserDummy")
	public ResponseEntity<List<User>> getUserDummy() {
		City city = new City();
		city.setIdCity(1L);
		city.setName("Bogota");
		return new ResponseEntity<List<User>>(userService.findByCityAndUserType(city, 1), HttpStatus.OK);
	}
}