package com.menu.random.service.impl;

import com.menu.random.dao.RestaurantMapper;
import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.Restaurant;
import com.menu.random.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantMapper restaurantMapper;

//    private static final Logger logger = LoggerFactory.getLogger(RestaurantServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.restaurantMapper.countByParams(example);
//        logger.debug("count: {}", count);
        return count;
    }

    public Restaurant selectByPrimaryKey(Long id) {
        return this.restaurantMapper.selectByPrimaryKey(id);
    }

    public List<Restaurant> selectByParams(Criteria example) {
        return this.restaurantMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Long id) {
        return this.restaurantMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Restaurant record) {
        return this.restaurantMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Restaurant record) {
        return this.restaurantMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.restaurantMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Restaurant record, Criteria example) {
        return this.restaurantMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Restaurant record, Criteria example) {
        return this.restaurantMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Restaurant record) {
        return this.restaurantMapper.insert(record);
    }

    public int insertSelective(Restaurant record) {
        return this.restaurantMapper.insertSelective(record);
    }
}