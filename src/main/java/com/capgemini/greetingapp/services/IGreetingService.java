package com.capgemini.greetingapp.services;

import com.capgemini.greetingapp.model.Greeting;
import com.capgemini.greetingapp.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(int id);
}
