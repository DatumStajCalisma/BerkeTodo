package todo.api.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todo.api.business.abstracts.UserService;
import todo.api.core.dataAccess.UserDao;
import todo.api.core.entities.User;
import todo.api.core.utilities.results.DataResult;
import todo.api.core.utilities.results.SuccessDataResult;


@Service("userService")
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Data listed successfully");
		
	}

		

	@Override
	public DataResult<User> findByuserEmail(String userEmail) {
		return new SuccessDataResult<User>(this.userDao.findByuserEmail(userEmail), "Data listed successfully");
	}
	
}
