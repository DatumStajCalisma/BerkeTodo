package todo.api.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import todo.api.entities.concretes.ToDo;

@Repository
@Transactional
public interface ToDoDao extends JpaRepository<ToDo,Integer>{

	
	@Modifying
	@Query(value="UPDATE Todos SET todo_text=:todoText WHERE todo_id=:id",nativeQuery = true)
	int updateTodo(@Param("id") int id,@Param("todoText") String todoText);
	
}
	