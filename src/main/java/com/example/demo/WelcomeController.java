package com.example.demo;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
	
	@RequestMapping("/")
	public String getMessage()
	{
		return "<h1>Welcome to Spring</h1>";
	}
	
	@RequestMapping("/user/{name}")
	public String getUserMessage(@PathVariable(name ="name") String name)
	{
		return "<h1>Welcome to <font color='green'>"+name+"</font></h1>";
	}

}
