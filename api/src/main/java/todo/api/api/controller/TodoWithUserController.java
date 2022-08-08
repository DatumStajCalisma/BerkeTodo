package todo.api.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.api.business.abstracts.TodoWithUserService;
import todo.api.core.utilities.results.DataResult;
import todo.api.entities.concretes.TodoWithUser;

@RestController
@RequestMapping("")
@CrossOrigin
public class TodoWithUserController {

private TodoWithUserService todoWithUserService;
	
	@Autowired
	public TodoWithUserController(TodoWithUserService todoWithUserService) {
		super();
		this.todoWithUserService = todoWithUserService;
	}
	
	@GetMapping("/todoWithUser")
	public DataResult<List<TodoWithUser>> getAll(){
		return this.todoWithUserService.getAll();
	}
}
