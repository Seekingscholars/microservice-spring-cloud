package com.itmuch.core.service.impl;

import com.itmuch.core.service.BaseService;
import com.itmuch.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 基类接口抽象
 * @author nmnl
 * @version 1.0
 * @data 20180403 19:20
 */

public abstract class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

	@Autowired
	private BaseMapper<T, ID> baseMapper;

	public BaseMapper<T, ID> getMapper() {
		return baseMapper;
	}

	@Override
	public int insertOne(T record) {
		return getMapper().insertOne(record);
	}

	@Override
	public int updateBySelective(T record) {
		return getMapper().updateBySelective(record);
	}

	@Override
	public T queryByPrimary(ID id) {
		return getMapper().queryByPrimary(id);
	}

	@Override
	public T queryBySelective(Map<String, Object> paramMap) {
		return getMapper().queryBySelective(paramMap);
	}

	@Override
	public List<T> queryListSelective(Map<String, Object> paramMap) {
		return getMapper().queryListSelective(paramMap);
	}

}
