package todo.api.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import todo.api.business.abstracts.UserService;
import todo.api.core.entities.User;
import todo.api.core.utilities.results.DataResult;

@RestController
@RequestMapping("")
@CrossOrigin
public class UserController {

	
private UserService userService;

@Autowired
public UserController(UserService userService) {
	super();
	this.userService = userService;
}

@GetMapping("/viewAllUsers")
public DataResult<List<User>> getAll(){
	return this.userService.getAll();
}

@GetMapping("viewOneUser")
public DataResult<User> getUserByEmail(@RequestParam String userEmail){
	return this.userService.findByuserEmail(userEmail);
}
}
