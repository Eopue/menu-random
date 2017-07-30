package com.menu.random.service;

import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.History;

import java.util.List;

public interface HistoryService {
    int countByParams(Criteria example);

    History selectByPrimaryKey(Integer id);

    List<History> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(History record, Criteria example);

    int updateByParams(History record, Criteria example);

    int insert(History record);

    int insertSelective(History record);
}