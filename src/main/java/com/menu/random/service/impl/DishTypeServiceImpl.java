package com.menu.random.service.impl;

import com.menu.random.dao.DishTypeMapper;
import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.DishType;
import com.menu.random.service.DishTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishTypeServiceImpl implements DishTypeService {
    @Autowired
    private DishTypeMapper dishTypeMapper;

//    private static final Logger logger = LoggerFactory.getLogger(DishTypeServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.dishTypeMapper.countByParams(example);
//        logger.debug("count: {}", count);
        return count;
    }

    public DishType selectByPrimaryKey(Long id) {
        return this.dishTypeMapper.selectByPrimaryKey(id);
    }

    public List<DishType> selectByParams(Criteria example) {
        return this.dishTypeMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Long id) {
        return this.dishTypeMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(DishType record) {
        return this.dishTypeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DishType record) {
        return this.dishTypeMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.dishTypeMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(DishType record, Criteria example) {
        return this.dishTypeMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(DishType record, Criteria example) {
        return this.dishTypeMapper.updateByParams(record, example.getCondition());
    }

    public int insert(DishType record) {
        return this.dishTypeMapper.insert(record);
    }

    public int insertSelective(DishType record) {
        return this.dishTypeMapper.insertSelective(record);
    }
}