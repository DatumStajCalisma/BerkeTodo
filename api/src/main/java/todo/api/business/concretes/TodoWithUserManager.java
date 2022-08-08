
package todo.api.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todo.api.business.abstracts.TodoWithUserService;
import todo.api.core.utilities.results.DataResult;
import todo.api.core.utilities.results.SuccessDataResult;
import todo.api.dataAccess.abstracts.TodoWithUserDao;
import todo.api.entities.concretes.TodoWithUser;


@Service("todoWithUserService")
public class TodoWithUserManager implements TodoWithUserService {

	private TodoWithUserDao todoWithUserDao;

	@Autowired
	public TodoWithUserManager(TodoWithUserDao todoWithUserDao) {
		super();
		this.todoWithUserDao = todoWithUserDao;
	}
	
	@Override
	public DataResult<List<TodoWithUser>> getAll() {
		return new SuccessDataResult<List<TodoWithUser>>(this.todoWithUserDao.findAll(), "Data listed successfully");
		
	}
}
