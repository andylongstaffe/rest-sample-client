package com.hollywood.sample.rest.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hollywood.sample.rest.client.JerseyClient;

@Controller
public class DemoController {

	  @RequestMapping("demo")
	  public String loadForm(ModelMap model) {
		  JerseyClient client = new JerseyClient();
		  String users = client.getUsers();
		  model.addAttribute("users", users);
		  return "demo";
	  }
	  
	  @RequestMapping(value="getallusers.json",method=RequestMethod.GET)
	  public @ResponseBody String getallusers() {
		  JerseyClient client = new JerseyClient();
		  String users = client.getUsers();
		  return users;
	  }
	
}
