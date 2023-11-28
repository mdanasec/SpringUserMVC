package org.jsp.usermvcdemo.controller;

import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

	@RequestMapping(value = "/open")
	@ResponseBody
	public String toConfigure() {
		return "welcome mvc";
	}

	@RequestMapping(value = "/checkDb")
	@ResponseBody
	public String toConfigureDb() {

		return Persistence.createEntityManagerFactory("dev").toString();
	}

}
