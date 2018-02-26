package com.arca.app.services;

import java.util.List;

import com.arca.app.models.entity.User;

public interface IUserService {

	List<User> findAll();
}
