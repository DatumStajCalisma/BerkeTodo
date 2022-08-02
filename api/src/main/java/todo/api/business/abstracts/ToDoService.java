package todo.api.business.abstracts;

import java.util.List;


import todo.api.core.utilities.results.DataResult;
import todo.api.core.utilities.results.Result;
import todo.api.entities.concretes.ToDo;

public interface ToDoService {

	DataResult<List<ToDo>> getAll();
	
	Result add(ToDo toDo);

	Result deleteTodo(int id);
	
	Result updateTodo(int id, String todoText);

	Result updateTodoStatus(int id, boolean todoStatus);

}
