package com.menu.random.dao;

import com.menu.random.pojo.Criteria;
import com.menu.random.pojo.DishType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DishTypeMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByParams(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByParams(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(DishType record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(DishType record);

    /**
     * 根据条件查询记录集
     */
    List<DishType> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    DishType selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") DishType record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") DishType record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(DishType record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(DishType record);
}