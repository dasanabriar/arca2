package com.arca.app.services;

import java.util.List;

import com.arca.app.models.entity.ShoppingCart;

public interface IShoppingCartService {
	
	void update(ShoppingCart favorite);
	
	List<ShoppingCart> findByIdUsersAndStatus(Long idUsers, String status);
}
