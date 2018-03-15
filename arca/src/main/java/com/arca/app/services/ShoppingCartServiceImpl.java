package com.arca.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arca.app.models.dao.IShoppingCartDao;
import com.arca.app.models.entity.ShoppingCart;

@Service
public class ShoppingCartServiceImpl  implements IShoppingCartService{

	@Autowired
	private IShoppingCartDao shoppingCartDao;
	
	@Override
	public void update(ShoppingCart shoppingCart) {
		shoppingCartDao.save(shoppingCart);
	}
	
	@Override
	public List<ShoppingCart> findByIdUsersAndStatus(Long idUsers, String status) {
		List<ShoppingCart> shoppingCarts = shoppingCartDao.findByIdUsersAndStatus(idUsers, status);
		
		return shoppingCarts;
	}

}
