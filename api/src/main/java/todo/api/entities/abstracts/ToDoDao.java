package todo.api.entities.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import todo.api.entities.concretes.ToDo;

public interface ToDoDao extends JpaRepository<ToDo,Integer>{

}
