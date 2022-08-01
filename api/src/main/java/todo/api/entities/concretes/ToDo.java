package todo.api.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="todos")
@AllArgsConstructor
@NoArgsConstructor	
public class ToDo {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="todo_id")
	private int id; 
	
	

	@Column(name="todo_text")
	private String todoText;
	
	@Column(name="todo_status")
	private boolean todoStatus;
	
public ToDo() {}
	
	public ToDo(int id, String todoText, boolean todoStatus) {
		super();
		this.id = id;
		this.todoText = todoText;
		this.todoStatus = todoStatus;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodoText() {
		return todoText;
	}

	public void setTodoText(String todoText) {
		this.todoText = todoText;
	}

	public boolean isTodoStatus() {
		return todoStatus;
	}

	public void setTodoStatus(boolean todoStatus) {
		this.todoStatus = todoStatus;
	}
}
