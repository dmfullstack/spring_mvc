package com.arman.springmvc;

import com.arman.jee.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Arman on 2017-05-09.
 */

@Controller
public class LoginController {

	@Autowired
	UserValidationService userValidationService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	@ResponseBody --> needed to return string
	public String showLoginPage(){
		return  "login"; //uses InternalResourceViewResolver (prefix & suffix) /WEB-INF/jsp/login.jsp
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	@ResponseBody --> needed to return string
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap modelMap){
		if (userValidationService.isUserValid(name, password)) {
			modelMap.put("name", name);
			modelMap.put("password", password);
			return  "welcome"; //uses InternalResourceViewResolver (prefix & suffix) /WEB-INF/jsp/login.jsp
		} else {
			modelMap.put("error", "Invalid credentials");
			return "login";
		}

	}

}
