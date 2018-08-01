package ${serviceName}.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ${commonName}.mapper.BaseMapper;
import ${commonName}.service.impl.BaseServiceImpl;
import ${mapperName}.${ClassName}Mapper;
import ${packageName}.${ClassName};
import ${serviceName}.${ClassName}Service;


/**
 * ${functionName}ServiceImpl
 * 
 * @author ${classAuthor}
 * @version 1.0.0
 * @date ${classDate}
 *
 */
@Service("${className}Service")
public class ${ClassName}ServiceImpl extends BaseServiceImpl<${ClassName}, Long> implements ${ClassName}Service {
	
    private static final Logger logger = LoggerFactory.getLogger(${ClassName}ServiceImpl.class);
   
    @Autowired
    private ${ClassName}Mapper ${className}Mapper;

	@Override
	public BaseMapper<${ClassName}, Long> getMapper() {
		return ${className}Mapper;
	}
	
}
