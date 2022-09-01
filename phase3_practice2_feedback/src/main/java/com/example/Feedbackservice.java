package com.example;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Feedbackservice {
	
	@Autowired
	Feedbackrepository feedbackrepository;//reference object of interface
	
	public List<Feedbackentity> getAllFeedbacks(){
		return feedbackrepository.findAll();
	}
	
	public boolean addFeedback(Feedbackentity pe){
        feedbackrepository.save(pe);
        return true;
    }
}
