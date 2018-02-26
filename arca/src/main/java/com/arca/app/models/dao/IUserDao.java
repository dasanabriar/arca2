package com.arca.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.arca.app.models.entity.User;

public interface IUserDao extends CrudRepository<User, Long>{

}
