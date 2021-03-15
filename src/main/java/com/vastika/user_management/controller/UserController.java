package com.vastika.user_management.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.user_management.model.User;
import com.vastika.user_management.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/add_user", method=RequestMethod.GET)
	public String getUserForm() {
		return "addUser";
	}
	
	@RequestMapping(value="/edit_user", method=RequestMethod.GET)
	public String getEditUserForm(@RequestParam int id,Model model) {
		model.addAttribute("user", userService.getUser(id));
		return "editUser";
	}
	
	@RequestMapping(value="/save_user", method=RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute User user) {
		userService.saveUser(user);
		return "redirect:/list_user";
	}
	
	@RequestMapping(value="/update_user", method=RequestMethod.POST)
	public String updateUserInfo(@ModelAttribute User user) {
		userService.updateUser(user);
		return "redirect:/list_user";
	}
	
	@RequestMapping(value="/list_user", method=RequestMethod.GET)
	public String getUserList(Model model) {
		model.addAttribute("users", userService.getAllUser());
		return "listUser";
	}
	
	@RequestMapping(value="/getId", method=RequestMethod.GET)
	public String getUserbyID() {
		return "enterId";
	}
	
//	@RequestMapping(value="/findId", method=RequestMethod.GET)
//	public String getUsebyId(@RequestParam int id,Model model) {
//		User u = userService.getUser(id);
//		
//		List<User> us = new ArrayList<>();
//		us.add(u);
//		model.addAttribute("users", us);
//		return "userDetail";
//	}
	
	@RequestMapping(value="/findId", method=RequestMethod.GET)
	public String getUsebyId(HttpServletRequest request, Model model) {
		String uId = request.getParameter("userId");
		int userId = Integer.parseInt(uId);
		
	
		
		User u = userService.getUser(userId);
		
		List<User> us = new ArrayList<>();
		us.add(u);
		model.addAttribute("users", us);
		
		//model.addAttribute("users", userService.getUser(userId));
		
		
		return "userDetail";
	}
	
	@RequestMapping(value="/delete_user", method=RequestMethod.GET)
	public String deleteUser(@RequestParam int id) {
		userService.deleteUser(id);
		return "redirect:/list_user";
	}
}
