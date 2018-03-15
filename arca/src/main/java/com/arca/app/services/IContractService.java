package com.arca.app.services;

import java.util.List;

import com.arca.app.models.entity.Contract;

public interface IContractService {
	
	void update(Contract contract);
	
	void save(Contract contract);
	
	void delete(Contract contract);
	
	List<Contract> findByIdShoppingCart(Long idShoppingCart);
	
}
