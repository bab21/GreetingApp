package com.capgemini.greetingapp;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.greetingapp.model.Greeting;
import com.capgemini.greetingapp.model.User;
import com.capgemini.greetingapp.services.IGreetingService;


@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping(value = {"","/","/home"})
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name) {
		User user =new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
	}
	@GetMapping(value= {"","/","/greetings"})
	public Greeting greeting(@RequestParam(value="id",defaultValue="1")int id) {
		return greetingService.getGreetingById(id);
	}
}
