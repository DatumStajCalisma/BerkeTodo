package todo.api.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import todo.api.core.entities.User;

@Repository
@Transactional
public interface UserDao extends JpaRepository<User,Integer>{


	User findByuserEmail(String userEmail);


}
