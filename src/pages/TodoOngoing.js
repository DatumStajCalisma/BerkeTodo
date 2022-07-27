import React, { useState } from "react";
import TodoItem from "../components/TodoItem";
import TButton from "../components/TButton";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import TodoItemInput from "../components/TodoItemInput";

export default function TodoOngoing() {
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
      <Row style={isEdited ? { display: "none" } : { marginBottom: "5px" }}>
        <Col md={9}>
          <TodoItem toDoText="This is a ToDo" />
        </Col>
        <Col md={1} style={{ margin: "auto" }}>
          <TButton onClick={handleIsEditing} name="edit" variant="primary" />
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
    </>
  );
}
