package com.arca.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arca.app.models.dao.IUserDao;
import com.arca.app.models.entity.City;
import com.arca.app.models.entity.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> findAll() {
		return (List<User>) userDao.findAll();
	}
	
	@Override
	public List<User> findByCityAndUserType(City city, int userType) {
		return (List<User>) userDao.findByCityAndUserType(city, userType);
	}
	
}
