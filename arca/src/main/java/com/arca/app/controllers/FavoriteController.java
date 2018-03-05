package com.arca.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arca.app.models.entity.Favorite;
import com.arca.app.services.IFavoriteService;

@CrossOrigin(origins = { "http://localhost:8100" })
@RestController
@RequestMapping("/api")
public class FavoriteController {
	
	@Autowired
	private IFavoriteService favoriteService;
	
	@PutMapping("/updateFavorite")
	public  @ResponseBody Favorite updateFavorite(@RequestBody Favorite favorite) {
		favoriteService.update(favorite);
		return favorite;
	}
	
	@PostMapping("/saveFavorite")
	public  @ResponseBody Favorite saveFavorite(@RequestBody Favorite favorite) {
		favoriteService.update(favorite);
		return favorite;
	}

}
