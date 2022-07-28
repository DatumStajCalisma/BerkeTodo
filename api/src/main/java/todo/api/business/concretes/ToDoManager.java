package todo.api.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todo.api.business.abstracts.ToDoService;
import todo.api.core.utilities.results.DataResult;
import todo.api.core.utilities.results.Result;
import todo.api.core.utilities.results.SuccessDataResult;
import todo.api.core.utilities.results.SuccessResult;
import todo.api.entities.abstracts.ToDoDao;
import todo.api.entities.concretes.ToDo;

@Service
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
	public Result add(ToDo todo) {
		this.toDoDao.save(todo);
		return new SuccessResult("ToDo added successfully");

	}
}
