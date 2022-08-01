import React, { useState, useEffect } from "react";
import TodoItem from "../components/TodoItem";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import TButton from "../components/TButton";
import ToDoService from "../service/toDoService";

export default function TodoCompleted() {
  const [toDos, setToDos] = useState([]);

  useEffect(() => {
    let toDoService = new ToDoService();
    toDoService.getToDos().then((result) => setToDos(result.data.data));
  }, []);
  function handleDelete() {
    console.log("ToDo Deleted");
  }

  return (
    <>
      {toDos
        .filter((todo) => todo.todoStatus == false)
        .map((toDos) => (
          <div key={toDos.id}>
            <Row style={{ marginBottom: "5px" }}>
              <Col md={11}>
                <TodoItem toDoText={toDos.todoText} />
              </Col>
              <Col style={{ margin: "auto" }} md={1}>
                <TButton
                  onClick={handleDelete}
                  name="delete"
                  variant="danger"
                />
              </Col>
            </Row>
          </div>
        ))}
    </>
  );
}
