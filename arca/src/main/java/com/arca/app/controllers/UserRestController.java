package com.arca.app.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.arca.app.models.entity.City;
import com.arca.app.models.entity.Favorite;
import com.arca.app.models.entity.SexType;
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

	
	@GetMapping("/getUserByCityAndTypeAndPreferences/{cityId}/{userType}/{preferencesId}")
	public ResponseEntity<List<User>> getUserByCityAndTypeAndPreferences(@PathVariable Long cityId, @PathVariable int userType, @PathVariable Long[] preferencesId) {
		// @RequestBody for method put  and get a entity.
		City city = new City();
		city.setIdCity(cityId);
		List<Long> sexTypeList = Arrays.asList(preferencesId);
		List<SexType> sexTypes = new ArrayList<SexType>();
		sexTypeList.forEach(prefe -> {
			SexType sexType = new SexType();
			sexType.setIdSexType(prefe);
			sexTypes.add(sexType);}
		);
		
		return new ResponseEntity<List<User>>(userService.findByCityAndUserTypeAndSexTypeIn(city, userType, sexTypes), HttpStatus.OK);
	}

	
	@GetMapping("/getUserDummy")
	public ResponseEntity<List<User>> getUserDummy() {
		City city = new City();
		city.setIdCity(1L);
		city.setName("Bogota");
		List<SexType> sexTypes = new ArrayList<SexType>();
		SexType sexType = new SexType();
		sexType.setIdSexType(1L);
		sexTypes.add(sexType);
		return new ResponseEntity<List<User>>(userService.findByCityAndUserTypeAndSexTypeIn(city, 1, sexTypes), HttpStatus.OK);
	}
	
	@PostMapping("/upload-file")
	public  String uploadFile(@RequestParam("uploads") MultipartFile file) {
		try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get("c:\\desarrollo\\" + file.getOriginalFilename());
            Files.write(path, bytes);
            	
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return null;
	}
	
	
}
