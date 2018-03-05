package com.arca.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.arca.app.models.entity.Favorite;

public interface IFavoriteDao extends CrudRepository<Favorite, Long>{

}
