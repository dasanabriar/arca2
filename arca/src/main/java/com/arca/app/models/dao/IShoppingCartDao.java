package com.arca.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arca.app.models.entity.ShoppingCart;

public interface IShoppingCartDao extends CrudRepository<ShoppingCart, Long>{
	
	List<ShoppingCart> findByIdUsersAndStatus(Long idUsers, String status); 

}
