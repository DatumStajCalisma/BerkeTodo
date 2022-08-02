package todo.api.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todo.api.business.abstracts.ToDoService;
import todo.api.core.utilities.results.DataResult;
import todo.api.core.utilities.results.Result;
import todo.api.core.utilities.results.SuccessDataResult;
import todo.api.core.utilities.results.SuccessResult;
import todo.api.dataAccess.abstracts.ToDoDao;
import todo.api.entities.concretes.ToDo;

@Service("toDoService")
public class ToDoManager implements ToDoService{
		
	private ToDoDao toDoDao;

	@Autowired
	public ToDoManager(ToDoDao toDoDao) {
		super();
		this.toDoDao = toDoDao;
	}
	
	@Override
	public DataResult<List<ToDo>> getAll() {
		return new SuccessDataResult<List<ToDo>>(this.toDoDao.findAll(), "Data listed successfully");
		
	}

	@Override
	public Result add(ToDo toDo) {
		this.toDoDao.save(toDo);
		return new SuccessResult("ToDo added successfully");

	}

	@Override
	public Result deleteTodo(int id) {
		this.toDoDao.deleteById(id);
		return new SuccessResult("ToDo deleted successfully");

	}

	@Override
	public SuccessDataResult<Object> updateTodo(int id, String todoText) {
		this.toDoDao.updateTodo(id,todoText);
		return new SuccessDataResult<Object>(this.toDoDao.findById(id),"ToDo updated successfully");
	}

	


}
