package com.arca.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arca.app.models.entity.City;
import com.arca.app.models.entity.SexType;
import com.arca.app.models.entity.User;

public interface IUserDao extends CrudRepository<User, Long>{
	
	List<User> findByCityAndUserTypeAndSexTypeIn (City city, int userType, List<SexType> sexTypes);
	
	List<User> findByIdUsersIn(Long[] idFavorites);
}
