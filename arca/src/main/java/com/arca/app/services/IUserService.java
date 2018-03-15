package com.arca.app.services;

import java.util.List;

import com.arca.app.models.entity.City;
import com.arca.app.models.entity.SexType;
import com.arca.app.models.entity.User;

public interface IUserService {

	List<User> findAll();
	
	List<User> findByCityAndUserTypeAndSexTypeIn(City city, int userType, List<SexType> sexTypes);
	
	List<User> findByIdUsersIn(Long[] idFavorites);
}
