package com.arca.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arca.app.models.dao.IFavoriteDao;
import com.arca.app.models.entity.Favorite;

@Service
public class FavoriteServiceImpl implements IFavoriteService{

	@Autowired
	private IFavoriteDao favoriteDao;
	
	@Override
	public void update(Favorite favorite) {
		favoriteDao.save(favorite);
	}

}
