package todo.api.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import todo.api.entities.concretes.TodoWithUser;

@Repository
@Transactional
public interface TodoWithUserDao extends JpaRepository<TodoWithUser,Integer> {

}
