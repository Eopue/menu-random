package com.menu.random.service.impl;

import com.menu.random.dao.HistoryMapper;
import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.History;
import com.menu.random.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryMapper historyMapper;

//    private static final Logger logger = LoggerFactory.getLogger(HistoryServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.historyMapper.countByParams(example);
//        logger.debug("count: {}", count);
        return count;
    }

    public History selectByPrimaryKey(Integer id) {
        return this.historyMapper.selectByPrimaryKey(id);
    }

    public List<History> selectByParams(Criteria example) {
        return this.historyMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.historyMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(History record) {
        return this.historyMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(History record) {
        return this.historyMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.historyMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(History record, Criteria example) {
        return this.historyMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(History record, Criteria example) {
        return this.historyMapper.updateByParams(record, example.getCondition());
    }

    public int insert(History record) {
        return this.historyMapper.insert(record);
    }

    public int insertSelective(History record) {
        return this.historyMapper.insertSelective(record);
    }
}