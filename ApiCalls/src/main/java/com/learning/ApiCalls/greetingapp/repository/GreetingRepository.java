package com.learning.ApiCalls.greetingapp.repository;

import com.learning.ApiCalls.greetingapp.model.Greeting;
import com.learning.ApiCalls.greetingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
