package com.itmuch.cloud.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itmuch.cloud.mapper.ClUserMapper;
import com.itmuch.cloud.pojo.ClUser;
import com.itmuch.cloud.service.ClUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 用户-账户表ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-08-01 16:15:56
 *
 */
@Service("clUserService")
public class ClUserServiceImpl implements ClUserService {
	
    private static final Logger logger = LoggerFactory.getLogger(ClUserServiceImpl.class);
   
    @Autowired
    private ClUserMapper clUserMapper;

	@Override
	public int insertOne(ClUser clUser) {
		return clUserMapper.insertOne(clUser);
	}

	@Override
	public int updateBySelective(ClUser clUser) {
		return clUserMapper.updateBySelective(clUser);
	}

	@Override
	public ClUser queryByPrimary(Long id) {
		return clUserMapper.queryByPrimary(id);
	}

	@Override
	public ClUser queryBySelective(Map<String, Object> paramMap) {
		return clUserMapper.queryBySelective(paramMap);
	}

	public PageInfo<ClUser> fromPageInfo(Map<String, Object> searchMap, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<ClUser> pageInfo = new PageInfo<>(clUserMapper.queryListSelective(searchMap));
		return pageInfo;
	}

	public Page<ClUser> fromPage(Map<String, Object> searchMap, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<ClUser> page = (Page<ClUser>)clUserMapper.queryListSelective(searchMap);
		return page;
	}

}
