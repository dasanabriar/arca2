package com.arca.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.arca.app.models.entity.User;

public interface ILoginDao extends CrudRepository<User, Long>{
	
	
public User findByUserNameAndPassword(String userName, String password);
	
}
