package com.itmuch.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * 基类controller
 * @author nmnl
 * @version 1.0
 * @data 20180403 14:34
 */
@Controller
@Scope("prototype")
public abstract class BaseController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
}
