package com.arca.app.services;

import com.arca.app.models.entity.User;

public interface ILoginService {
	
	public User findByUserNameAndPassword(String userName, String password);

}
