package todo.api.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="todowithuser")
@AllArgsConstructor
@NoArgsConstructor	
public class TodoWithUser {
	@Id
	@Column(name="todo_id")
	private int id; 
	
	@Column(name="todo_text")
	private String todoText;
	
	@Column(name="todo_status")
	private boolean todoStatus;
	
	@Column(name="user_id")
	private int todoUserId;
	
	@Column(name="email")
	private String todoWithUserEmail;
	
public TodoWithUser() {}

public TodoWithUser(int id, String todoText, boolean todoStatus, int todoUserId, String todoWithUserEmail) {
	super();
	this.id = id;
	this.todoText = todoText;
	this.todoStatus = todoStatus;
	this.todoUserId = todoUserId;
	this.todoWithUserEmail = todoWithUserEmail;
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

public int getTodoUserId() {
	return todoUserId;
}

public void setTodoUserId(int todoUserId) {
	this.todoUserId = todoUserId;
}

public String getTodoWithUserEmail() {
	return todoWithUserEmail;
}

public void setTodoWithUserEmail(String todoWithUserEmail) {
	this.todoWithUserEmail = todoWithUserEmail;
}
}	