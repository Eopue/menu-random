package com.menu.random.service;

import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.Restaurant;

import java.util.List;

public interface RestaurantService {
    int countByParams(Criteria example);

    Restaurant selectByPrimaryKey(Long id);

    List<Restaurant> selectByParams(Criteria example);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Restaurant record, Criteria example);

    int updateByParams(Restaurant record, Criteria example);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);
}