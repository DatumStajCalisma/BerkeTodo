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
	private Boolean todoStatus;
}
