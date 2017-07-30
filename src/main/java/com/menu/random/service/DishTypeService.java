package com.menu.random.service;

import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.DishType;

import java.util.List;

public interface DishTypeService {
    int countByParams(Criteria example);

    DishType selectByPrimaryKey(Long id);

    List<DishType> selectByParams(Criteria example);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DishType record);

    int updateByPrimaryKey(DishType record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(DishType record, Criteria example);

    int updateByParams(DishType record, Criteria example);

    int insert(DishType record);

    int insertSelective(DishType record);
}