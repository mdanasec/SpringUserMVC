package org.jsp.usermvcdemo.controller;

import org.jsp.usermvcdemo.dao.UserDao;
import org.jsp.usermvcdemo.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	public UserDao dao;

	// Open a view with the given name
	@RequestMapping(value = "/open-view")
	public String openView(@RequestParam String view) {
		return view;
	}

	// Load a specific page and add an empty User object to it
	@RequestMapping(value = "/load")
	public ModelAndView load(@RequestParam String page) {
		ModelAndView view = new ModelAndView();
		view.setViewName(page);
		view.addObject("u", new User());
		return view;
	}

	// Handle user registration
	@PostMapping("/register")
	@ResponseBody
	public String saveUser(@ModelAttribute(name = "u") User user) {
		user = dao.saveUser(user);
		return "User saved with ID: " + user.getId();
	}

	// Handle user update
	@PostMapping("/update")
	@ResponseBody
	public String updateUser(@ModelAttribute(name = "u") User user) {
		// Assuming your DAO has a method to update an existing user by their ID
		User u = dao.updateUser(user);

		if (u != null) {
			return "User with ID " + user.getId() + " has been updated.";
		} else {
			return "User with ID " + user.getId() + " not found or could not be updated.";
		}
	}

	// Find a user by their ID
	@GetMapping(value = "/find")
	public ModelAndView findById(@RequestParam int id) {
		User u = dao.findById(id);
		ModelAndView view = new ModelAndView();
		if (u != null) {
			view.setViewName("print");
			view.addObject("data", u);
			return view;
		} else {
			view.setViewName("error");
			view.addObject("message", "Invalid id !!");
			return view;
		}
	}

	// Delete a user by their ID
	@PostMapping(value = "/delete")
	@ResponseBody
	public ModelAndView deleteById(@RequestParam int id) {
		boolean u = dao.deleteById(id);
		ModelAndView view = new ModelAndView();

		if (u) {
			view.setViewName("print");
			view.addObject("data", u);
			return view;
		} else {
			view.setViewName("error");
			view.addObject("message", "Invalid id");
			return view;
		}
	}

	// Find a user by their phone number and password
	@PostMapping(value = "findByPhone")
	@ResponseBody
	public ModelAndView findByPhone(@RequestParam long phone, @RequestParam String password) {
		User u = dao.verifyByPhone(phone, password);
		ModelAndView view = new ModelAndView();
		if (u != null) {
			view.setViewName("print");
			view.addObject("data", u);
			return view;
		} else {
			view.setViewName("error");
			view.addObject("message", "Invalid phone and password!!");
			return view;
		}
	}

	// Find a user by their email and password
	@PostMapping(value = "/findByEmail")
	@ResponseBody
	public ModelAndView findByEmail(@RequestParam String email, @RequestParam String password) {
		User u = dao.verifyByEmail(email, password);
		ModelAndView view = new ModelAndView();
		if (u != null) {
			view.setViewName("print");
			view.addObject("data", u);
			return view;
		} else {
			view.setViewName("error");
			view.addObject("message", "Invalid email and password!!");
			return view;
		}
	}
}
