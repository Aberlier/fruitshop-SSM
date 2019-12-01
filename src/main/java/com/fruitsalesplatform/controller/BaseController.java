package com.fruitsalesplatform.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
//公共Controller 被所有Controller继承
public abstract class BaseController {
	@InitBinder
	//此方法用于日期转换，若页面日期格式转换错误，就报404错误
	public void initBinder(WebDataBinder binder){
		DateFormat dataformat=new SimpleDateFormat("yyyy-MM-dd");
		dataformat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dataformat,true));
	}
}
