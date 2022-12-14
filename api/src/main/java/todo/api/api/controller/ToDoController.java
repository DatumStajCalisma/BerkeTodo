package todo.api.api.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@DeleteMapping("/delete/{id}")
	public Result deleteTodo(@PathVariable(value = "id") int id){
		return this.toDoService.deleteTodo(id);
	}
	
	@PatchMapping("/updateText/{id}/{todoText}")
	public Result updateTodo(@PathVariable(value = "id") int id,@PathVariable(value="todoText") String todoText){
		return  this.toDoService.updateTodo(id,todoText);
	}
	
	@PatchMapping("/updateStatus/{id}/{todoStatus}")
	public Result updateTodoStatus(@PathVariable(value = "id") int id,@PathVariable(value="todoStatus") boolean todoStatus){
		return  this.toDoService.updateTodoStatus(id,todoStatus);
	}
	

	
}
