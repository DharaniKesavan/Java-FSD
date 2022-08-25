package com.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.user.dao.UserDao;
import com.user.entity.User;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
		
	@RequestMapping(value="/userform",  method=RequestMethod.GET)
	public String showForm(Model m){
		m.addAttribute("user", new User());
		return "userform";		
	}
	
	@RequestMapping("/viewuser")
	public String viewuser(Model m){
		List<User> userList= dao.getUsersDetails();
		for(User e : userList){
			System.out.println(e.getUserId());
		}
		m.addAttribute("userList",userList);
		return "view";
	}
	
	@RequestMapping(value="/editform/{userId}")
	public String edit(@PathVariable int userId, Model m){		
		User u=dao.getUserId(userId);
		m.addAttribute("user",u);
		return "editform";
	}
	
	@RequestMapping(value="/editsave")
	public String editSave(@ModelAttribute("user") User u, Model m){		
		System.out.println("-----userid-----"+u.getUserId());
		dao.update(u);
		List<User> userList= dao.getUsersDetails();
		for(User e : userList){
			System.out.println(e.getUserId());
		}
		m.addAttribute("userList",userList);
		return "view";
	}
}