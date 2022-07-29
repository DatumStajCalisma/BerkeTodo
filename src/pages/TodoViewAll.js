import React, { useState, useEffect } from "react";
import TodoItem from "../components/TodoItem";
import TButton from "../components/TButton";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import TodoItemInput from "../components/TodoItemInput";
import ToDoService from "../service/toDoService";
export default function TodoViewAll() {
  const [toDos, setToDos] = useState([]);

  useEffect(() => {
    let toDoService = new ToDoService();
    toDoService.getToDos().then((result) => setToDos(result.data.data));
  }, []);

  // const [isDone, setIsDone] = useState(true);

  const [isEdited, setIsEdited] = useState(false);

  function handleIsEditing() {
    setIsEdited(true);
    console.log("Editing");
  }
  function handleIsEdited() {
    setIsEdited(false);
    console.log("Edited");
  }
  function handleIsDone() {
    console.log("ToDo Completed");
  }
  function handleDelete() {
    console.log("ToDo Deleted");
  }
  return (
    <>
      {toDos.map((toDos) => (
        <div key={toDos.id}>
          <Row style={isEdited ? { display: "none" } : { marginBottom: "5px" }}>
            <Col md={8}>
              <TodoItem toDoText={toDos.todoText} />
            </Col>
            <Col md={1}>
              <TodoItem toDoText={toDos.todoStatus ? "True" : "False"} />
            </Col>
            <Col md={1} style={{ margin: "auto" }}>
              <TButton
                onClick={handleIsEditing}
                name="edit"
                variant="primary"
              />
            </Col>
            <Col md={1} style={{ margin: "auto" }}>
              <TButton onClick={handleIsDone} name="done" variant="success" />
            </Col>
            <Col md={1} style={{ margin: "auto" }}>
              <TButton onClick={handleDelete} name="delete" variant="danger" />
            </Col>
          </Row>
          <Row style={isEdited ? { marginBottom: "5px" } : { display: "none" }}>
            <Col md={11}>
              <TodoItemInput placeHolder="Add a new ToDo" />
            </Col>
            <Col md={1}>
              <TButton onClick={handleIsEdited} name="done" variant="success" />
            </Col>
          </Row>
        </div>
      ))}
    </>
  );
}
