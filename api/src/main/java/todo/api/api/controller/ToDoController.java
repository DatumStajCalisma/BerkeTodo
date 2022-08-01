package todo.api.api.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import todo.api.business.abstracts.ToDoService;
import todo.api.core.utilities.results.DataResult;
import todo.api.core.utilities.results.Result;
import todo.api.entities.concretes.ToDo;

@RestController
@RequestMapping("")
@CrossOrigin
public class ToDoController {

	private ToDoService toDoService;
	
	@Autowired
	public ToDoController(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}
	
	@GetMapping("/viewAll")
	public DataResult<List<ToDo>> getAll(){
		return this.toDoService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody ToDo toDo){
		return this.toDoService.add(toDo);
	}

}
