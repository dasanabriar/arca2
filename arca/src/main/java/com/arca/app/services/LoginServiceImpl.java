package com.arca.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arca.app.models.dao.ILoginDao;
import com.arca.app.models.entity.User;

@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private ILoginDao loginDao;

	@Override
	public User findByUserNameAndPassword(String userName, String password) {
		return loginDao.findByUserNameAndPassword(userName, password);
	}

}
