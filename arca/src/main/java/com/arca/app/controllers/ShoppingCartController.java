package com.arca.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arca.app.enums.ShoppingCartStatusEnum;
import com.arca.app.models.entity.Contract;
import com.arca.app.models.entity.ShoppingCart;
import com.arca.app.services.IContractService;
import com.arca.app.services.IShoppingCartService;

@CrossOrigin(origins = { "http://localhost:8100" })
@RestController
@RequestMapping("/api")
public class ShoppingCartController {
	@Autowired
	private IShoppingCartService shoppingCartService;
	
	@Autowired
	private IContractService contractService;
	
	@GetMapping("/getShoppingCartByIdUsersAndStatusActive/{idUsers}")
	public ResponseEntity<ShoppingCart> getShoppingCartByIdUsersAndStatusActive(@PathVariable Long idUsers) {
		 
		List<ShoppingCart> shoppingCarts = shoppingCartService.findByIdUsersAndStatus(idUsers, ShoppingCartStatusEnum.ACTIVE.getCode());
		
		ShoppingCart shoppingCart = new ShoppingCart();

		// por reglas del negocio solo deberia existir un shopping Cart Activo por usuario
		if(shoppingCarts.size() > 0) {
			shoppingCart = shoppingCarts.get(0);
		}
		
		return new ResponseEntity<ShoppingCart>(shoppingCart, HttpStatus.OK);
	}
	
	@PutMapping("/updateShoppingCart")
	public  @ResponseBody ShoppingCart updateFavorite(@RequestBody ShoppingCart shoppingCart) {
		shoppingCartService.update(shoppingCart);
		return shoppingCart;
	}
	
	@PostMapping("/saveShoppingCart")
	public  @ResponseBody ShoppingCart saveFavorite(@RequestBody ShoppingCart shoppingCart) {
		shoppingCartService.update(shoppingCart);
		
		shoppingCart.getContracts().forEach(contract ->{
			contract.setIdShoppingCart(shoppingCart.getIdShoppingCart());
			contractService.update(contract);
		});
		
		return shoppingCart;
	}
	
	
	@PostMapping("/saveContract")
	public  @ResponseBody Contract saveContract(@RequestBody Contract contract) {
		contractService.update(contract);
		return contract;
	}
	
	@GetMapping("/getContractsByIdShoppingCart/{idShoppingCart}")
	public ResponseEntity<List<Contract>> getContractsByIdShoppingCart(@PathVariable Long idShoppingCart) {
		return new ResponseEntity<List<Contract>>(contractService.findByIdShoppingCart(idShoppingCart), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteContract/{idContract}")
	public @ResponseBody Contract deleteContract(@PathVariable Long idContract) {
		Contract contract = new Contract();
		contract.setIdContract(idContract);
		contractService.delete(contract);
		return contract;
	}
	
}
