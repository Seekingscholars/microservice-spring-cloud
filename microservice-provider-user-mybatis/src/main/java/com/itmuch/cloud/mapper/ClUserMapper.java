package com.itmuch.cloud.mapper;

import com.itmuch.cloud.pojo.ClUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 用户-账户表Dao
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-08-01 16:15:56
 *
 */
@Mapper
@Repository
public interface ClUserMapper {

    /**
     * 插入数据
     * @param clUser 实体类
     * @return 主键值
     */
    int insertOne(ClUser clUser);

    /**
     * 更新数据 新数据
     * @param clUser 更新条件
     */
    int updateBySelective(ClUser clUser);

    /**
     * 获取一条记录 根据主键查询数据
     * @param id 主键值
     * @return 数据结果
     */
    ClUser queryByPrimary(Long id);

    /**
     * 获取一条记录
     * @param paramMap 查询条件
     * @return 查询结果
     */
    ClUser queryBySelective(Map<String, Object> paramMap);

    /**
     * 数据查询 - 支持分页查询
     * @param paramMap 查询条件
     * @return 结果集
     */
    List<ClUser> queryListSelective(Map<String, Object> paramMap);
}
