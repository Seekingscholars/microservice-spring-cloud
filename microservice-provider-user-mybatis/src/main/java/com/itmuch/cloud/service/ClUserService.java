package com.itmuch.cloud.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.itmuch.cloud.pojo.ClUser;

import java.util.Map;

/**
 * 用户-账户表Service
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-08-01 16:15:56
 *
 */
public interface ClUserService  {
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

    PageInfo<ClUser> fromPageInfo(Map<String, Object> searchMap, Integer pageNum, Integer pageSize);

    Page<ClUser> fromPage(Map<String, Object> searchMap, Integer pageNum, Integer pageSize);
}
