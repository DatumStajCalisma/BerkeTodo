package todo.api.business.abstracts;

import java.util.List;

import todo.api.core.utilities.results.DataResult;
import todo.api.entities.concretes.TodoWithUser;

public interface TodoWithUserService {

	DataResult<List<TodoWithUser>> getAll();
	
}
