package todo.api.business.abstracts;

import java.util.List;

import todo.api.core.entities.User;
import todo.api.core.utilities.results.DataResult;

public interface UserService {

	DataResult<List<User>> getAll();

	DataResult<User> findByuserEmail(String userEmail);

}
