package com.codingdojo.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
	}
    
    @RequestMapping("/daikichi/travel/{location}")
    public String showTravel(@PathVariable("location") String location){
    	return "Congratulation! You will soon travel to " + location;
    }
    
    @RequestMapping("/daikichi/lotto/{num}")
    public String showLotto(@PathVariable("num") int num){
    	if (num % 2 == 0) {
    		return "You have enjoyed the fruits of your laboor but now is a great time to spend time with family and friends.";
    	} else {
    		return "You will take a grand journey in the near future, but be weary of tempting offers.";
    	}
    }

}
