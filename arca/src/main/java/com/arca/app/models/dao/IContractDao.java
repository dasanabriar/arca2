package com.arca.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arca.app.models.entity.Contract;

public interface IContractDao extends CrudRepository<Contract, Long>{
	List<Contract> findByIdShoppingCart(Long idShoppingCart);
}
