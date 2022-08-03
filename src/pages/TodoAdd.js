import React, { useState, useEffect } from "react";
import TodoItemInput from "../components/TodoItemInput";
import TButton from "../components/TButton";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import ToDoService from "../service/toDoService";

export default function TodoAdd() {
  const [todoText, setTodoText] = useState("");
  const [todoStatus, setTodoStatus] = useState(false);
  const handleChange = (event) => {
    setTodoText(event.target.value);
    setTodoStatus(false);
  };
  function handleAdded() {
    const todoData = { todoText, todoStatus };
    console.log(todoData);

    fetch(
      "http://localhost:8080/add?todoStatus=" +
        todoData.todoStatus +
        "&todoText=" +
        todoData.todoText,
      {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(todoData),
      }
    ).then(() => {
      console.log("todo added ");
    });
  }

  // useEffect((todoData) => {
  //   let toDoService = new ToDoService();
  //   toDoService.addToDo().then((response) => handleChange(todoData));
  // }, []);
  return (
    <>
      <Row style={{ marginBottom: "5px" }}>
        <Col md={11}>
          <TodoItemInput onChange={handleChange} placeHolder="Add a new ToDo" />
        </Col>
        <Col md={1}>
          <TButton onClick={handleAdded} name="add" variant="primary" />
        </Col>
      </Row>
    </>
  );
}
