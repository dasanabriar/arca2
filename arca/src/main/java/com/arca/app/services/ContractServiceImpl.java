package com.arca.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arca.app.models.dao.IContractDao;
import com.arca.app.models.entity.Contract;

@Service
public class ContractServiceImpl implements IContractService{

	@Autowired
	private IContractDao contractDao;
	
	@Override
	public void update(Contract contract) {
		contractDao.save(contract);
	}

	@Override
	public void save(Contract contract) {
		contractDao.save(contract);
	}

	@Override
	public void delete(Contract contract) {
		contractDao.delete(contract);
	}

	@Override
	public List<Contract> findByIdShoppingCart(Long idShoppingCart) {
		return contractDao.findByIdShoppingCart(idShoppingCart);
	}

}
