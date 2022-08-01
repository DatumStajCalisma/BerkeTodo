package todo.api.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import todo.api.entities.concretes.ToDo;

@Repository
public interface ToDoDao extends JpaRepository<ToDo,Integer>{


}
