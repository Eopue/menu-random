package com.menu.random.service.impl;

import com.menu.random.dao.DishesMapper;
import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.Dishes;
import com.menu.random.service.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class DishesServiceImpl implements DishesService {
    @Autowired
    private DishesMapper dishesMapper;

//    private static final Logger logger = LoggerFactory.getLogger(DishesServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.dishesMapper.countByParams(example);
//        logger.debug("count: {}", count);
        return count;
    }

    public Dishes selectByPrimaryKey(Long id) {
        return this.dishesMapper.selectByPrimaryKey(id);
    }

    public List<Dishes> selectByParams(Criteria example) {
        return this.dishesMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Long id) {
        return this.dishesMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Dishes record) {
        return this.dishesMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Dishes record) {
        return this.dishesMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.dishesMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Dishes record, Criteria example) {
        return this.dishesMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Dishes record, Criteria example) {
        return this.dishesMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Dishes record) {
        return this.dishesMapper.insert(record);
    }

    public int insertSelective(Dishes record) {
        return this.dishesMapper.insertSelective(record);
    }

    public List<Dishes> getMenu(int num){

        //列表
        List<Dishes> allDishes = this.dishesMapper.selectByParams(new Criteria());

        //按类型分组
        Map<String, List<Dishes>> groupDishes = allDishes.stream().collect(Collectors.groupingBy(Dishes::getType));


        if(num >= allDishes.size()){
            return allDishes;
        }

        return getToday(null, groupDishes, num, 1);
    }

    public List<Dishes> getToday(List<Dishes> today, Map<String, List<Dishes>>  groupDishes, int num, int index){
        if(today == null){
            today = new ArrayList<>();
        }

        if(num == 0) return today;

        if(index == 9){
            index = 1;
        }

        String type = String.valueOf(index);
        if(groupDishes.containsKey(type)){
            List<Dishes> list = groupDishes.get(type);

            int getIndex = this.getIndex(list, today);
            if(getIndex != -1){
                today.add(list.get(getIndex));
                groupDishes.get(type).remove(getIndex);
            } else {
                num ++;
            }
        }
        return getToday(today,groupDishes, num - 1, index + 1);
    }

    public int getIndex(List<Dishes> list, List<Dishes> today){
        Random rondom = new Random();
        if(list.size() > 0){
            return rondom.nextInt(list.size());
        }
        return -1;
    }

}