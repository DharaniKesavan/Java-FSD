package com.example;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Feedbackcontroller {
	@Autowired 
	Feedbackservice feedbackservice;
	
	@GetMapping("/allfeedback")
	public List<Feedbackentity> getAllFeedbacks(){
		return feedbackservice.getAllFeedbacks();
		
	}
	
	@PostMapping("/feedback") 
	public String addFeedback(@RequestParam("user") String user,  @RequestParam("rating") int rating ,@RequestParam("comment") String comment){
	   Feedbackentity f=new Feedbackentity(user,rating,comment);
		boolean data=feedbackservice.addFeedback(f);
		if(data) {
			return "Feedback added succesfully!!!";
		}
		else {
			return "Unable to add the feedback!";
		}
	}
}


