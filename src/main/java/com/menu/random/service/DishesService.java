package com.menu.random.service;

import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.Dishes;

import java.math.BigDecimal;
import java.util.List;

public interface DishesService {
    int countByParams(Criteria example);

    Dishes selectByPrimaryKey(Long id);

    List<Dishes> selectByParams(Criteria example);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKey(Dishes record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Dishes record, Criteria example);

    int updateByParams(Dishes record, Criteria example);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    List<Dishes> getMenu(int num);

    List<List<Dishes>> getMenuOfSpecifyPrice(int price);
}